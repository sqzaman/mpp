package mpp.lab10.problem1;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TDDPractice {

	static Function<String, String> myFuncter = new Function<String, String>() {
		@Override
		public String apply(String t) {
			return String.format("%s%s", t.substring(0, t.length() - 1), Character.toUpperCase(t.charAt(t.length() - 1)));
		}
	};
	
	public static List<String> changeLastCharToUpper(List<String> words) {
		return words.stream().map(myFuncter).collect(Collectors.toList());
	}

}
