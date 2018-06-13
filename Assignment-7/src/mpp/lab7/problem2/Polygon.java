package mpp.lab7.problem2;

public interface Polygon extends ClosedCurve {
	double[] getSides();
	
	default double computePerimeter() {
		double perimeter = 0.0;
		for(double side: getSides()) {
			perimeter += side;
		}
		
		return perimeter;
	}
}
