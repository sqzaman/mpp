package mpp.lab5.p3;

public class Rectangle extends Shape {
	private double width, length;
	
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width * length;
	}


}
