package mpp.lab4.p3;

public class SalariedEmployee extends Employee {
	double montlySalary = 10000.0;
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcGrossPay(int month) {
		// TODO Auto-generated method stub
		return montlySalary;
	}

}
