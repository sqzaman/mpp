package mpp.lab3.p2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Landlord landLord = new Landlord("Mr X");
		
		Building building1 = new Building(100, "building 1", 10000);
		
		Apartment apt1 = new Apartment(101, "Apartment 1 building 1", building1, 15000);
		Apartment apt2 = new Apartment(102, "Apartment 2 building 1", building1, 25000);
		Apartment apt3 = new Apartment(103, "Apartment 3 building 1", building1, 35000);
		Apartment apt4 = new Apartment(104, "Apartment 4 building 1", building1, 45000);
		
		building1.addApartment(apt1);
		building1.addApartment(apt2);
		building1.addApartment(apt3);
		building1.addApartment(apt4);
		
		Building building2 = new Building(100, "building 2", 15000);
		
		
		Apartment apt21 = new Apartment(101, "Apartment 1 building 2", building2, 15000);
		Apartment apt22 = new Apartment(102, "Apartment 2 building 3", building2, 25000);
		Apartment apt23 = new Apartment(103, "Apartment 3 building 4", building2, 35000);
		Apartment apt24 = new Apartment(104, "Apartment 4 building 5", building2, 45000);
		
		building2.addApartment(apt21);
		building2.addApartment(apt22);
		building2.addApartment(apt23);
		building2.addApartment(apt24);
		
		
		landLord.addBuilding(building1);
		landLord.addBuilding(building2);
		
		//String out = String.format("Total montly profilt of %s is: %d", landLord.getName(), landLord.getMonthlyProfit());
		
		System.out.println( String.format("Total montly profilt of %s is: %d", landLord.getName(), landLord.getMonthlyProfit()));
		
		
		
		

	}

}
