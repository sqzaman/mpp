package mpp.lab5.p3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalArea = 0;
		List<Shape> list = new ArrayList<>();
		
		Shape s1 = new Circle(5.2);
		Shape s2 = new Rectangle(5, 4);
		Shape s3 = new Triangle(5, 4);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Shape s: list) {
			totalArea +=s.computeArea();
		}
		
		System.out.println(String.format("Sum of Areas = %s",  totalArea));


	}

}
