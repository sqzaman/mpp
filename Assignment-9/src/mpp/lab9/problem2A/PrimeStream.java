package mpp.lab9.problem2A;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PrimeStream {	
	
	private static final Stream<BigInteger> primes = Stream.iterate(BigInteger.ONE, n -> n.nextProbablePrime());
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(BigInteger.ONE, n ->	n.nextProbablePrime())
		.limit(4)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
