package mpp.lab10.problem7.soln2;

import java.util.function.Function;
import java.util.function.Predicate;

import mpp.lab10.problem7.Employee;

public class Utility {
	public static boolean salaryGreaterThan100000(Employee e){
		return e.getSalary() > 100000 ? true : false;
	}
	
	public static boolean lastNameAfterM(Employee e) {
		return e.getLastName().charAt(0) > 'M' ? true : false;
	}
	
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}
}
