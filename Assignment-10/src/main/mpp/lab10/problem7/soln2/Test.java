package mpp.lab10.problem7.soln2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import mpp.lab10.problem7.Employee;
public class Test {

	@org.junit.Test
	public void test() {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		// verify that John Sims's salary is bigger than 100000
		assert (Utility.salaryGreaterThan100000(new Employee("John", "Sims", 110000)));

		// verify that Thomas Blake's salary is bigger than 100000
		assert (Utility.salaryGreaterThan100000(new Employee("Thomas", "Blake", 111000)));

		assertEquals("Thomas Blake",
				Utility.salaryGreaterThan100000(new Employee("Thomas", "Blake", 111000))
						? Utility.fullName(new Employee("Thomas", "Blake", 111000))
						: null);

		// verify that Donald Trump's last name begins with any letter that comes after
		// ¡®M¡¯ in the alphabet
		assert (Utility.lastNameAfterM(new Employee("Donald", "Trump", 100000)));

		assertEquals("Donald Trump",
				Utility.lastNameAfterM(new Employee("Donald", "Trump", 100000))
						? Utility.fullName(new Employee("Donald", "Trump", 100000))
						: null);

		String candidates = Filter.asString(emps);
		assertEquals(candidates, "Alice Richards, Joe Stevens, John Sims, Steven Walters");
	}

}
