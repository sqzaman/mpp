package mpp.lab7.problem4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		Consumer<String> consumer = name -> System.out.println(name.toUpperCase());
		// print each element of the list in upper case format
		printList(list, consumer);
		
		/*Consumer<String> consumerNames = name -> {
		    System.out.println(name);
		};
		
		list.forEach(consumerNames);
		*/
		

	}

	// implement a Consumer
	public static void printList(List<String> list, Consumer<String> consumer) {
		list.forEach(consumer);
		/*for (String str : list) {
			consumer.accept(str.toUpperCase());
		}*/
	}

}
