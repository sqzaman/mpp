package mpp.lab10.problem7.soln2;
import java.util.List;
import java.util.stream.Collectors;

import mpp.lab10.problem7.Employee;
public class Filter {
	public static String asString(List<Employee> list) {
        return list.stream()
	    .filter(Utility::salaryGreaterThan100000)
	    .filter(Utility::lastNameAfterM)
	    .map(Utility::fullName)
	    .sorted()
	    .collect(Collectors.joining(", ")).toString();
	}
}
