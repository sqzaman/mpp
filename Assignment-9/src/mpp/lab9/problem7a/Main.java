package mpp.lab9.problem7a;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		// your stream pipeline here
		Predicate<Employee> predicate = (e) -> e.getSalary() > 100000 && e.getLastName().charAt(0) > 'M';
		Function<Employee, String> fullName = (e) -> (e.getFirstName() + " " + e.getLastName());
		
		System.out.println(
		list.stream()
		.filter(predicate)
		.map(fullName)
		.collect(Collectors.joining(", "))
		);
	}

}
