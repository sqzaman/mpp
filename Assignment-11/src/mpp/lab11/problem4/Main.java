package mpp.lab11.problem4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		// 4a.
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
		nums.add(3.14); // compiler error is here. it expects Number
		
		/*
		 * Explanation: We cannot add anything into the nums list because the list declaration doesn't commit to
			any specific type. It is defined to be a List that accepts
			subtypes of Number. Solution: change List<? extend Number> to List<? super Number>
		*/


		// 4b.
		List<Object> objs = new ArrayList<Object>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints2 = objs;
		ints2.add(3);
		double dbl2 = sum(ints2); //compiler error is here. it expects <? extends ...>
		
		/*  Explanation: An compile error occurs at double dbl = sum(ints);
			because the function expect the Collection <? extends Number>,
			but what we provide is List<? super Integer> that isn't a subtype of Collection < ? extends Number>
		 
		 */
		
	}
	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for (Number num : nums)
			s += num.doubleValue();
		return s;
	}
	
}
