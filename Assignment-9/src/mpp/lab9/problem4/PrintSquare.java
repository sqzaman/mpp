package mpp.lab9.problem4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(5);
	}
	
	public static void printSquares(int num) {
		System.out.println(
		IntStream.rangeClosed(1, num)
		.map(n -> n * n)
		.mapToObj(String::valueOf)
		.collect(Collectors.joining(","))
		);
		System.out.println("===========================");
		
		System.out.println(
		IntStream.iterate(1, n -> n + 1)
		.limit(num)
		.map(n -> n*n)
		.mapToObj(String::valueOf)
		.collect(Collectors.joining(","))
		
		);
		
	}

}
