package mpp.lab3.p2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	int id;
	String name;
	int maintenanceCost;
	List<Apartment> apartments;
	
	public Building(int buildingNo, String buildingName, int buildingMaintenenceCost) {
		id = buildingNo;
		name = buildingName;
		maintenanceCost = buildingMaintenenceCost;
		apartments = new ArrayList<Apartment>();
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public void addApartment(Apartment apartment) {
		apartments.add(apartment);
	}
	
	public int getMaintenanceCost() {
		return maintenanceCost;
	}

}
