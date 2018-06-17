package mpp.lab10.problem5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixThis {
	
	 // This method creates a compiler error -- try to fix it List<String>
	List<String> processList(List<String> list) {
	
	return list.stream()
			.map(x ->
			FunctionWithException.unchecked((String word) -> doNothingIfShort(word)).apply(x))
			.collect(Collectors.toList()); // This will fail to* compile
	 }
	 

	String doNothingIfShort(String input) throws InputTooLongException {
		if (input.length() > 3)
			throw new InputTooLongException();
		else
			return input;
	}

	public static void main(String[] args) {
		FixThis ft = new FixThis();
		List<String> words1 = Arrays.asList("not", "too", "big", "yet");
		 System.out.println(ft.processList(words1));
		 
			List<String> words2 = Arrays.asList("A", "problem", "arises", "here");
			System.out.println(ft.processList(words2));
	}

	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;

		public InputTooLongException() {
			super("Must be length 3 or less");
		}

		public InputTooLongException(String s) {
			super(s);
		}

		public InputTooLongException(Throwable t) {
			super(t);
		}
	}
}
