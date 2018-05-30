package mpp.lab3.p2;

public class Apartment {

	int id;
	String name;
	Building building;
	int monthlyRent;
	
	public Apartment(int apartmentNo, String apartmentName, Building aptBuilding, int apartmentMonthlyRent) {
		id = apartmentNo;
		name = apartmentName;
		building = aptBuilding;
		monthlyRent = apartmentMonthlyRent;				
		
	}

	public int getMonthlyRent() {
		return monthlyRent;
	}
	
	
}
