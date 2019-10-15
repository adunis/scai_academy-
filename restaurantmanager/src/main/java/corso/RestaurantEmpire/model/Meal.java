package corso.RestaurantEmpire.model;

import corso.RestaurantEmpire.model.enums.TypeMeal;

public class Meal {
	
	private String idMeal; 
	private TypeMeal typeMeal; 
	private double price; 
	
		public Meal(String idMeal, TypeMeal typeMeal, double price){
			setIdMeal(idMeal);
			setTypeMeal(typeMeal);
			setPrice(price);
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public TypeMeal getTypeMeal() {
			return typeMeal;
		}

		public void setTypeMeal(TypeMeal typeMeal) {
			this.typeMeal = typeMeal;
		}

		public String getIdMeal() {
			return idMeal;
		}

		public void setIdMeal(String idMeal) {
			this.idMeal = idMeal;
		}
}
