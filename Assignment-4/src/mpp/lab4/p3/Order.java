package mpp.lab4.p3;

import java.util.Date;

public class Order {
	int orderNo;
	Date orderDate;
	double orderAmount;
	Employee commissionedEmployee;
	
	public Order(int orderNo, Date orderDate, double orderAmount, Employee commissionedEmployee) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.commissionedEmployee = commissionedEmployee;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public Employee getCommissionedEmployee() {
		return commissionedEmployee;
	}
	
}
