package mpp.lab4.p3;

import java.util.Date;

@SuppressWarnings(value = { "remind" })
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date dt = new Date();
		CommissionedEmployee comEmployee = new CommissionedEmployee();
		Order o1 = new Order(1, new Date(), 100, comEmployee);
		comEmployee.addOrder(o1);
		comEmployee.calcCompensation(dt.getMonth()).getNetPay();
		

	}

}
