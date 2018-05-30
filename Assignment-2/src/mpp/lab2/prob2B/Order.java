package mpp.lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	int orderNum;
	List<OrderLine> orderLine;
	
	public Order(int orderNumber) {
		orderNum = orderNumber;
		orderLine = new ArrayList<OrderLine>();
	}

	public int getOrderNum() {
		return orderNum;
	}

	public List<OrderLine> getOrderLine() {
		return orderLine;
	}

	public void addOrderLine(OrderLine orderLine) {
		this.orderLine.add(orderLine);
	}
	

}
