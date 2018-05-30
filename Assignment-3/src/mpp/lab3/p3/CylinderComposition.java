package mpp.lab3.p3;

public class CylinderComposition {
	  public Circle base;
	  public double height;

	  public CylinderComposition(double r, double h) {
	    height = h;
	    base = new Circle(r);
	  }

	  public double getVolume() {
	    return base.getArea() * height;
	  }
	
}
