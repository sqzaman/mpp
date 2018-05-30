package mpp.lab3.p3;

public class Cylinder extends Circle {

	double height = 1.0;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double rdius) {
		
	}
	public Cylinder(double radius, double h) {
		 super(radius);
		 height = h;
		
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return  Math.PI  * Math.pow(radius, 2) * height;
	}
}
