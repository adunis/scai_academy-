package corso.RestaurantEmpire.model;

import java.util.List;
import corso.RestaurantEmpire.model.Meal;
import corso.RestaurantEmpire.service.CustomerService;
import corso.RestaurantEmpire.service.RestaurantService;

public class Customer {

	private String idCustomer;
	private double billValue;
	private boolean paidBill;
	private Table reservedTable = null;
	private boolean isSeated;

	public Customer(String idCustomer) {
		this.setIdCustomer(idCustomer);
	}

	public void ReserveTable(List<Table> listTables, int numberTablePlaces) {
		Table freeTable = RestaurantService.FindFreeTable(listTables, numberTablePlaces);
		if (freeTable != null) {
			freeTable.setReserved(true);
			setReservedTable(freeTable);
		}
	}

	public void GoToRestaurant(List<Table> listTables, int numberTablePlaces) {

		if (reservedTable == null) ReserveTable(listTables, numberTablePlaces);
			
		if (reservedTable != null) setSeated(true);

		}


	public void Command(List<Meal> listMeals) {
		if (isSeated()) {
			CustomerService.addToBillValue(this, listMeals.stream().mapToDouble(x -> x.getPrice()).sum());
		} else {
			return;
		}

	}

	public void PayBill() {
		System.out.println("Your bill is:");
		System.out.println(getBillValue());

		setBillValue(0);
		setReservedTable(null);
		return;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public double getBillValue() {
		return billValue;
	}

	public void setBillValue(double billValue) {
		this.billValue = billValue;
	}

	public Table getReservedTable() {
		return reservedTable;
	}

	public void setReservedTable(Table reservedTable) {
		this.reservedTable = reservedTable;
	}

	public boolean isSeated() {
		return isSeated;
	}

	public void setSeated(boolean isSeated) {
		this.isSeated = isSeated;
	}

	/**
	 * @return the paidBill
	 */
	public boolean isPaidBill() {
		return paidBill;
	}

	/**
	 * @param paidBill the paidBill to set
	 */
	public void setPaidBill(boolean paidBill) {
		this.paidBill = paidBill;
	}

}
