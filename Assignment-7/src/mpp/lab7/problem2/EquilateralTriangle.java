package mpp.lab7.problem2;

public class EquilateralTriangle implements Polygon{
	private double side;
	EquilateralTriangle(double s){
		side = s;
	}
	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return new double[] {side, side, side};
	}
}
