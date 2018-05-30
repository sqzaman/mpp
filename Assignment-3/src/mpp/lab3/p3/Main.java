package mpp.lab3.p3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c = new Cylinder(7, 6);
		//System.out.println("the raidus of this Cylinder is  " + c.getRadius());
		//System.out.println("the height of this Cylinder  is " + c.getHeight());
		//System.out.println("the Area of this Cylinder  is " + c.getArea());
		System.out.println("the volume of this Cylinder  is " + c.getVolume());
		
		CylinderComposition cc = new CylinderComposition(7.0, 6.0);
		//System.out.println("the raidus of this Cylinder is  " + cc.getRadius());
		//System.out.println("the height of this Cylinder  is " + cc.getHeight());
		//System.out.println("the Area of this Cylinder  is " + cc.getArea());
		System.out.println("the volume of this Cylinder  is " + cc.getVolume());
	}

}
