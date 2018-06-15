package mpp.lab8.problem4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class BestSolution {

	final TriFunction<String, String, Integer, Predicate<String>> customLamda = (letter1, letter2, length) -> 
		(word -> word.contains(letter1) && !word.contains(letter2) && word.length() == length);
		
		public int countWords(List<String> words, char c, char d, int len) {	
		    return words.stream()
		    		    .filter(customLamda.apply("" + c, "" + d, len))				
		    			.collect(Collectors.toList())
		    			.size();
		}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		System.out.println(new BestSolution().countWords(list, 'e', 'z', 7));
	}
}
