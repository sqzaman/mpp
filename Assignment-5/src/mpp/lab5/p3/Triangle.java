package mpp.lab5.p3;

public class Triangle extends Shape {
	private double base, height;


	public Triangle(double base, double height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return 1/2 * base * height;
	}

	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
}
