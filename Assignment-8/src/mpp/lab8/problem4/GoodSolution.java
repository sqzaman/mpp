package mpp.lab8.problem4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GoodSolution {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");
		
		//Test Goodbye word
		System.out.println(new GoodSolution().countWords(list,'e','z',7));

	}
	
	public int countWords(List<String> words, char c, char d, int len) {	
		return words.stream()
				.filter(w -> w.length() == len)
				.filter(w -> w.contains("" + c))
				.filter(w -> !w.contains("" + d))
				.collect(Collectors.toList())
				.size();
	}
}
