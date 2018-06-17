package mpp.lab9.problem7b;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));
		
		System.out.println(LambdaLibrary.SORTED_LIST_OF_EMPLOYEE_WITH_SALARY_AND_LASTNAME_START_AFTER.apply(list, 100000, new Character('M')));

	}

}
