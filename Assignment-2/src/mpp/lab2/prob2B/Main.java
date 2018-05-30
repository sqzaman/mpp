package mpp.lab2.prob2B;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Order order = new Order(1);		
		OrderLine orderLine1 = new OrderLine(order);
		OrderLine orderLine2 = new OrderLine(order);
		OrderLine orderLine3 = new OrderLine(order);
		OrderLine orderLine4 = new OrderLine(order);
		
		order.addOrderLine(orderLine1);
		order.addOrderLine(orderLine2);
		order.addOrderLine(orderLine3);
		order.addOrderLine(orderLine4);
		
		
		

	}

}
