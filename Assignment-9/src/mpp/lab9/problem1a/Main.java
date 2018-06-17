package mpp.lab9.problem1a;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream ones = IntStream.generate(() -> 1).distinct();
		ones.forEach(System.out::println);
		 
		 // its generating one distinct element from a intStream, and the way its generating the stream its
		 // an infinity stream, to fix this problem we can limit the generation of stream like as below
		IntStream ones1 = IntStream.generate(() -> 1).limit(1).distinct();
		ones1.forEach(System.out::println);
	}

}
