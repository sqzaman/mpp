package mpp.lab8.problem5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {


//@SuppressWarnings("unused")
public static void main(String[] args) {
	List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
			"Everywhere you want to be");

		
		//list.forEach(((Consumer<String>)String::toUpperCase).andThen(System.out::println));

		
		
		// using own define consumer
		list.forEach(new MyConsumer());
		System.out.println("================================");
		
		// using lamda expression
		list.forEach(s -> System.out.println(s.toUpperCase()));
		System.out.println("================================");
		
		// using method refference
		list.forEach(ForEachTest::printUpper);
		
		System.out.println("================================");
		//defining a consumer using lamda
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		list.forEach(consumer::accept);
		
	}

	static void printUpper(String s) {
		System.out.println(s.toUpperCase());
	}

	// implement a Consumer
	static class MyConsumer implements Consumer<String> {
		public void accept(String s) {
			System.out.println(s.toUpperCase());
		}
	}

}


