package corso.RestaurantEmpire.model;

public class Table {

	private String idTable;
	private int tablePlaces; //1 or 2
	private boolean isReserved = false; 
	
	public Table(String idTable, int tablePlaces) {
		setIdTable(idTable);
		setTablePlaces(tablePlaces);
	}
	
	
	
	/**
	 * @return the idTable
	 */
	public String getIdTable() {
		return idTable;
	}
	/**
	 * @param idTable the idTable to set
	 */
	public void setIdTable(String idTable) {
		this.idTable = idTable;
	}
	/**
	 * @return the tablePlaces
	 */
	public int getTablePlaces() {
		return tablePlaces;
	}
	/**
	 * @param tablePlaces the tablePlaces to set
	 */
	public void setTablePlaces(int tablePlaces) {
		this.tablePlaces = tablePlaces;
	}
	/**
	 * @return the isReserved
	 */
	public boolean isReserved() {
		return isReserved;
	}
	/**
	 * @param isReserved the isReserved to set
	 */
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	} 
	
}
