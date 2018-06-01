package mpp.lab4.p3;

public abstract class Employee {
	int employeeId;
	
	

	public Paycheck calcCompensation(int month) {
		double grossPay = calcGrossPay(month);
		return new Paycheck(
				grossPay,
				grossPay * 0.23,
				grossPay *  0.05, 
				grossPay * 0.01,
				grossPay * 0.03,
				grossPay * 0.075
			);
	}
	
	public abstract double calcGrossPay(int month);
}
