package mpp.lab10.problem7.soln1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import mpp.lab10.problem7.Employee;
import mpp.lab10.problem7.Main;
import java.util.List;

public class FilterEmployeeTest {

	@Test
	public void test() {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));
		String candidates = new Main().getFilteredEmployee(emps, 190000, 'D');
		assertEquals(candidates, "Joe Stevens");
		candidates = new Main().getFilteredEmployee(emps, 90000, 'S');
		assertEquals(candidates, "Donald Trump, Steven Walters");
	}

}
