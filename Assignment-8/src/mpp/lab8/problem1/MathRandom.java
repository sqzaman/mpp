package mpp.lab8.problem1;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lamda
		Supplier<Double> supplier = () -> Math.random();
		System.out.println(supplier.get());
		
		// method reference
		Supplier<Double> supplierMethodReference = Math::random;
		System.out.println(supplierMethodReference.get());
		
		// custom supplier in inner class
		System.out.println((new MathRandom()).new MathSupplier().get());
		
	}

	
	public class MathSupplier implements Supplier<Double> {

		@Override
		public Double get() {
			// TODO Auto-generated method stub
			return Math.random();
		}
		
	}

}
