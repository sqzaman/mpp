package mpp.lab11.problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		
		List<Number> nums = ints; // this is the error, reason not covarient, Interger list cannot assign to Number list
		nums.add(3.14);
		
		// b
		List<Integer> ints1 = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		
		List<? extends Number> nums1 = ints1;
		nums1.add(3.14);
		

	}

}
