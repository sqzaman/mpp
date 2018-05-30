package mpp.lab3.p2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {

	String name;
	List<Building> buildings;
	
	public Landlord(String landlordName) {
		name = landlordName;
		buildings = new ArrayList<Building>();
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void addBuilding(Building building) {
		buildings.add(building);
	}
	
	
	public String getName() {
		return name;
	}

	public int getMonthlyProfit() {

		int totalMaintenanceCost = 0;
		int totalRent = 0;
		for(Building building: buildings) {
			
			totalMaintenanceCost += building.getMaintenanceCost();
			
			for(Apartment apartment: building.getApartments()) {
				totalRent += apartment.getMonthlyRent();
			}
		}
		
		return totalRent - totalMaintenanceCost;
	}
	
	

}
