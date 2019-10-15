package corso.RestaurantEmpire;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import corso.RestaurantEmpire.*;
import corso.RestaurantEmpire.model.Customer;
import corso.RestaurantEmpire.model.Meal;
import corso.RestaurantEmpire.model.Restaurant;
import corso.RestaurantEmpire.model.Table;
import corso.RestaurantEmpire.model.enums.TypeMeal;
import corso.RestaurantEmpire.service.RestaurantService;

/*
 * Unit test for simple App.
 */

public class AppTest extends TestCase {

	Restaurant ristorante = new Restaurant("ristorante01");
	public List<Meal> listMeals = new ArrayList<Meal>();

	public List<Table> listTables = new ArrayList<Table>();

	Customer customer01 = new Customer("customer01");
	Customer customer02 = new Customer("customer02");
	Customer customer03 = new Customer("customer03");
	Customer customer04 = new Customer("customer04");
	Customer customer05 = new Customer("customer05");

	public AppTest(String testName) {
		super(testName);

		listMeals.add(new Meal("APP01", TypeMeal.APPETIZER, 10));
		listMeals.add(new Meal("APP02", TypeMeal.APPETIZER, 8));
		listMeals.add(new Meal("APP03", TypeMeal.APPETIZER, 5));
		listMeals.add(new Meal("APP04", TypeMeal.APPETIZER, 7));
		listMeals.add(new Meal("APP05", TypeMeal.APPETIZER, 9));
		listMeals.add(new Meal("APP06", TypeMeal.APPETIZER, 12));
		listMeals.add(new Meal("APP07", TypeMeal.APPETIZER, 11));

		listMeals.add(new Meal("PRI01", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI02", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI03", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI04", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI05", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI06", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI07", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI08", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI09", TypeMeal.PRIMO, 10));
		listMeals.add(new Meal("PRI10", TypeMeal.PRIMO, 10));

		listMeals.add(new Meal("SEC01", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC02", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC03", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC04", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC05", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC06", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC07", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC08", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC09", TypeMeal.SECONDO, 10));
		listMeals.add(new Meal("SEC10", TypeMeal.SECONDO, 10));

		listMeals.add(new Meal("DES01", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES02", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES03", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES04", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES05", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES06", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES07", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES08", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES09", TypeMeal.DESSERT, 10));
		listMeals.add(new Meal("DES10", TypeMeal.DESSERT, 10));

	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public void testCreateMenu() {
		ristorante.createMenu(listMeals);
		assertNotNull(ristorante.getRestaurantMenu());
	}

	public void testFindFreeTable() {

		listTables.add(new Table("table01", 2));
		listTables.add(new Table("table02", 1));
		listTables.add(new Table("table03", 1));
		listTables.add(new Table("table04", 2));

		Table table = null;
		table = RestaurantService.FindFreeTable(listTables, 2);
		assertNotNull(table);
	}

	public void testReserveTable() {
		listTables.add(new Table("table01", 2));
		listTables.add(new Table("table02", 1));
		listTables.add(new Table("table03", 1));
		listTables.add(new Table("table04", 2));

		customer01.ReserveTable(listTables, 2);
		customer02.ReserveTable(listTables, 1);
		customer03.ReserveTable(listTables, 1);
		customer04.ReserveTable(listTables, 2);
		customer05.ReserveTable(listTables, 2);

		assertNotNull(customer01.getReservedTable());
		assertNotNull(customer02.getReservedTable());
		assertNotNull(customer03.getReservedTable());
		assertNotNull(customer04.getReservedTable());
		assertNull(customer05.getReservedTable());
	}

	public void testGoToRestaurant() {

		listTables.add(new Table("table01", 2));
		listTables.add(new Table("table02", 1));
		listTables.add(new Table("table03", 1));
		listTables.add(new Table("table04", 2));

		customer01.ReserveTable(listTables, 2);
		customer02.ReserveTable(listTables, 1);
		customer03.ReserveTable(listTables, 1);
		customer04.ReserveTable(listTables, 2);
		customer05.ReserveTable(listTables, 2);

		customer05.GoToRestaurant(listTables, 2);
		assertFalse(customer05.isSeated());
	}

	public void testCommand() {
		ristorante.createMenu(listMeals);

		listTables.add(new Table("table01", 2));
		customer01.GoToRestaurant(listTables, 2);

		List<Meal> orderedMeals = new ArrayList<Meal>();

		String orderedMealId01 = "APP01";
		orderedMeals.addAll(ristorante.getRestaurantMenu().stream().filter(x -> orderedMealId01.equals(x.getIdMeal()))
				.collect(Collectors.toList()));

		String orderedMealId02 = "SEC01";
		orderedMeals.addAll(ristorante.getRestaurantMenu().stream().filter(x -> orderedMealId02.equals(x.getIdMeal()))
				.collect(Collectors.toList()));

		String orderedMealId03 = "PRI01";
		orderedMeals.addAll(ristorante.getRestaurantMenu().stream().filter(x -> orderedMealId03.equals(x.getIdMeal()))
				.collect(Collectors.toList()));

		customer01.Command(orderedMeals);

		assertEquals(30.0, customer01.getBillValue(), 2);
	}

	public void TestPayBill() {
		ristorante.createMenu(listMeals);

		listTables.add(new Table("table01", 2));
		customer01.GoToRestaurant(listTables, 2);

		List<Meal> orderedMeals = new ArrayList<Meal>();

		String orderedMealId01 = "APP01";
		orderedMeals.addAll(ristorante.getRestaurantMenu().stream().filter(x -> orderedMealId01.equals(x.getIdMeal()))
				.collect(Collectors.toList()));

		String orderedMealId02 = "SEC01";
		orderedMeals.addAll(ristorante.getRestaurantMenu().stream().filter(x -> orderedMealId02.equals(x.getIdMeal()))
				.collect(Collectors.toList()));

		String orderedMealId03 = "PRI01";
		orderedMeals.addAll(ristorante.getRestaurantMenu().stream().filter(x -> orderedMealId03.equals(x.getIdMeal()))
				.collect(Collectors.toList()));

		customer01.Command(orderedMeals);

		assertEquals(30.0, customer01.getBillValue(), 2);

		customer01.PayBill();

		assertEquals(0.0, customer01.getBillValue(), 2);
		
		
		
	
		
		
		
		
	}

}
