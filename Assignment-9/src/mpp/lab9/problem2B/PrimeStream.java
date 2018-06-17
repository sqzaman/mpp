package mpp.lab9.problem2B;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.stream.Stream;

public class PrimeStream {

	static final Function<Long, Stream<BigInteger>> primeStreamFunction = 
			l -> Stream.iterate(BigInteger.ONE, n -> n.nextProbablePrime()).limit(l);
			
	public void printFirstNPrimes(long n) {
		primeStreamFunction.apply(n).forEach(System.out::println);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PrimeStream ps = new PrimeStream();
		 ps.printFirstNPrimes(10);
		 System.out.println("====");
		 ps.printFirstNPrimes(5); 

	}

}
