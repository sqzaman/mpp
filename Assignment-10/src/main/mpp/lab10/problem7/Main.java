package mpp.lab10.problem7;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000), new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000), new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000), new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000), new Employee("Donald", "Trump", 100000));

		//System.out.println(emps.filter(e -> (e.getSalary() > 100000)).filter(e -> (e.getLastName().charAt(0) > 'M'))
		//		.map(e -> fullName(e)).sorted().collect(Collectors.joining(", ")));
		new Main().printEmps(emps);
	}
	
	public String getFilteredEmployee(List<Employee> emps, int salary, char c){

		Predicate<Employee> predicate = (e) -> e.getSalary() > salary && e.getLastName().charAt(0) > c;
	    Function<Employee, String> fullName = (e) -> e.getFirstName().concat(" ").concat(e.getLastName());
	    
	    String empoyees = emps.stream()
				.filter(predicate) 
				.map(fullName)
				.sorted()
				.collect(Collectors.joining(", "));
		return empoyees;
	}
	
	private void  printEmps(List<Employee> emps) {
		String employees = this.getFilteredEmployee(emps, 5000, new Character('M'));
		System.out.println(employees);	
	}

	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
