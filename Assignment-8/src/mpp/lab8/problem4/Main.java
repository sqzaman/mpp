package mpp.lab8.problem4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");
		//Test Goodbye word
		System.out.println(countWords(list,'e','z',7));

	}
	
	public static int countWords(List<String> words, char c, char d, int len) {	
		return  (int) words.stream()
				.filter(s -> s.length() == len)
				.filter(s -> s.contains(""+c) == true)
				.filter(s -> s.contains(""+d) == false)
				.count();
	}

}
