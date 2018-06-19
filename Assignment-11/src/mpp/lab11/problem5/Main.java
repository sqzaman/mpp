package mpp.lab11.problem5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collection;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(42, 1, 9, 5, 8, 4);
		System.out.println(Main.findSecondSmallest(ints));
		
		List<String> strngs = Arrays.asList("zaman", "kaman", "samal", "amal", "abal", "aal");
		System.out.println(Main.findSecondSmallest(strngs));
	}
	
	public static <T extends Comparable<T>> T findSecondSmallest(Collection<? extends T> source) {	
		return source.stream().sorted().collect(Collectors.toList()).get(1);	    
	}
}
