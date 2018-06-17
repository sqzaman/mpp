package mpp.lab9.problem1b;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Bill", "Thomas", "Marry"};
		System.out.println(Arrays.stream(names)
		.collect(Collectors.joining(",")));
		
	}

}
