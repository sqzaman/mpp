package mpp.lab9.problem8;

import java.util.Arrays;
import java.util.List;

import mpp.lab9.problem7b.LambdaLibrary;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		// print the number of Employees in list whose salary > 100000 and whose
		// last name begins
		// with a letter that comes after the letter 'E'

		System.out.println(LambdaLibrary9.SORTED_LIST_OF_EMPLOYEE_WITH_SALARY_AND_LASTNAME_START_AFTER.apply(list, 100000, new Character('E')));
		
		
		// print a list of sorted full names - all upper case -- of Employees
		// with
		// salary > 85000 and whose first name begins with a letter that comes
		// before the letter 'R'
		System.out.println(LambdaLibrary9.SORTED_LIST_OF_EMPLOYEE_WITH_SALARY_AND_FIRSTNAME_START_AFTER.apply(list, 8500, new Character('R')));

	}

}
