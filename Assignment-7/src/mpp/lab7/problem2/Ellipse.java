package mpp.lab7.problem2;

public class Ellipse implements ClosedCurve {
	private double a;
	private double e;
	public Ellipse(double a, double e) {
		this.a = a;
		this.e = e;
	}
	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4 * a * e;
	}


}
