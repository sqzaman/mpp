package mpp.lab4.p3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings(value = { "remind" })
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date dt = new Date();
		
		Order o1 = new Order(1, new Date(), 100);
		Order o2 = new Order(1, new Date(), 101);
		List<Order> list = new ArrayList<Order>();
		list.add(o1);
		list.add(o2);
		Employee comEmployee = new CommissionedEmployee(list);
		o1.setCommissionedEmployee(comEmployee);
		o2.setCommissionedEmployee(comEmployee);
		comEmployee.calcCompensation(dt.getMonth()).getNetPay();
		

	}

}
