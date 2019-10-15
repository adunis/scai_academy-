package corso.RestaurantEmpire.service;


import java.util.List;
import java.util.function.Predicate;

import corso.RestaurantEmpire.model.Table;

public class RestaurantService {

	public static Table FindFreeTable(List<Table> listTables, int numberTablePlaces){
		
		Table freeTable = listTables.stream().filter(x -> !x.isReserved()).filter(k -> k.getTablePlaces() == numberTablePlaces).findAny().orElse(null);
		
		return freeTable;
	}
	
	
	
}
