package mpp.lab3.p3;

public class Circle {
	double radius = 1.0;
	String color = "red";
	
	public Circle() {
		
	}
	public Circle(double rad) {
		radius = rad;
	}
	
	public double getArea(){
		return Math.PI * (radius * radius);
	}
	public double getRadius() {
		return radius;
	}
	
	 public String toString() {
	      return "\nradius: " + radius + "\narea: " + getArea()  + "\n";
	  }
}
