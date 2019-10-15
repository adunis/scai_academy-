package corso.RestaurantEmpire.model;

import java.util.List;

public class Restaurant {

	private String idRestaurant;
	private List<Table> restaurantTables;
	private List<Meal> restaurantMenu = null; 

	public Restaurant(String idRestaurant) {
		setIdRestaurant(idRestaurant);
	}
	
	
	public String getIdRestaurant() {
		return idRestaurant;
	}

	public void setIdRestaurant(String idRestaurant) {
		this.idRestaurant = idRestaurant;
	}

	public List<Table> getRestaurantTables() {
		return restaurantTables;
	}

	public void setRestaurantTables(List<Table> restaurantTables) {
		this.restaurantTables = restaurantTables;
	}

	public List<Meal> getRestaurantMenu() {
		return restaurantMenu;
	}

	public void setRestaurantMenu(List<Meal> restaurantMenu) {
		this.restaurantMenu = restaurantMenu;
	}

	public void createMenu(List<Meal> restaurantMenu) {
		setRestaurantMenu(restaurantMenu);
	}
	
}
