package mpp.lab9.problem1c;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		int[] values = {1, 2, 4, 5, 6, 7, 9, 8};
		
		IntSummaryStatistics summary = IntStream.of(values).summaryStatistics();
		System.out.println(summary.getMax());
		System.out.println(summary.getMin());
		
		//Stream<BigInteger> naturalNums = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE)))
		
	}
}
