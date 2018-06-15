package mpp.lab8.problem4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BetterSolution {
	
	
	final Function<String, Predicate<String>> containsLetter = letter -> word -> word.contains(letter);

    final Function<String, Predicate<String>> notContainLetter	= letter -> word -> !word.contains(letter);

    final Function<Integer, Predicate<String>> wordLength = length -> word -> word.length() == length;


	public int countWords(List<String> words, char c, char d, int len) {
		return words.stream()
				  .filter(containsLetter.apply("" + c))
				  .filter(notContainLetter.apply("" + d))
				  .filter(wordLength.apply(len))
				  .collect(Collectors.toList())
				  .size();
	}
	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		System.out.println(new BetterSolution().countWords(list,'e','z',7));
	    
	}

}
