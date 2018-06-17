package mpp.lab9.problem5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(5);
		System.out.println(streamSection(nextStream(), 0, 3).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 2, 5).collect(Collectors.joining(", ")));
		System.out.println(streamSection(nextStream(), 7, 8).collect(Collectors.joining(", ")));
	}
	
	
	@SuppressWarnings("unused")
	private static Stream<String> streamSection(Stream<String> stream, int m, int n){		
		return stream.limit(n+1).skip(m);
	}
	@SuppressWarnings("unused")
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}

}
