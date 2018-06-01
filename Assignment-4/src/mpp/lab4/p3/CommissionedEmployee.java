package mpp.lab4.p3;

import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends Employee {

	List<Order> orders;
	public CommissionedEmployee() {
		// TODO Auto-generated constructor stub
		orders = new ArrayList<Order>();
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

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

}
