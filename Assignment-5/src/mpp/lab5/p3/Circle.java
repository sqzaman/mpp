package mpp.lab5.p3;

public class Circle extends Shape {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

}
