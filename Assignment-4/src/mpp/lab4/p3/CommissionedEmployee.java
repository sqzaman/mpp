package mpp.lab4.p3;

import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends Employee {

	List<Order> orders;
	public CommissionedEmployee(List<Order> orders) {
		// TODO Auto-generated constructor stub
		this.orders = orders;
	}

	@Override
	public double calcGrossPay(int month) {
		// TODO Auto-generated method stub
		double grossAmount = 0.0;
		for(Order o: orders) {
			grossAmount += o.getOrderAmount();
		}
		return grossAmount;
	}

}
