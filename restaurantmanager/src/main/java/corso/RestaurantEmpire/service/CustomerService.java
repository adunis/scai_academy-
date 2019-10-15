package corso.RestaurantEmpire.service;

import corso.RestaurantEmpire.model.Customer;

public class CustomerService {

	public static void addToBillValue(Customer customer, double value) {
		customer.setBillValue(customer.getBillValue() + value);
	}
	
}
