package mpp.lab4.p3;

public class Paycheck {
	
	double grossPay;
	double fica;
	double state;
	double local;
	double medicare;
	double socialSecurity;
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
	public double getNetPay() {		
		return grossPay - (fica + state + local + medicare + socialSecurity);
	}
	

}
