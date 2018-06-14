package mpp.lab8.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		class MyBiFunction implements BiFunction<Double, Double, List<Double>> {
			public List<Double> apply(Double x, Double y) {
				return new ArrayList<Double>() {{
						add(Math.pow(x, y));
						add(x * y);	
				}};			
			}
		}
		MyBiFunction f = new MyBiFunction();
		System.out.println(f.apply(2.0, 3.0)); // output 1
	}

}
