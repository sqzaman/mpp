package mpp.lab8.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		// using custom bifunction		
		System.out.println( new MyBiFunction().apply(2.0, 3.0)); // [8.0, 6.0]
		
		
		// using default bifunction
		BiFunction<Double, Double, List<Double>> f = (x,y) -> { 
					List<Double> list = new ArrayList<>();
					list.add(Math.pow(x, y));
					list.add(x * y);
					return list;
				};
			System.out.println(f.apply(2.0, 3.0));
		
		
	}
	
	static class MyBiFunction implements BiFunction<Double, Double, List<Double>> {
		public List<Double> apply(Double x, Double y) {
			return new ArrayList<Double>() {{
					add(Math.pow(x, y));
					add(x * y);	
			}};			
		}
	}

}
