package mpp.lab9.problem7b;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class LambdaLibrary {
static Predicate<Employee> predicate = (e) -> e.getSalary() > 100000 && e.getLastName().charAt(0) > 'M';
static	Function<Employee, String> fullName = (e) -> (e.getFirstName() + " " + e.getLastName());

static TriFunction<Employee, Integer, Character, Boolean> myFunctor = (e, s, c)->
{
	return e.getSalary() > s && e.getLastName().charAt(0) > c;
};

public static final TriFunction<List<Employee>, Integer, Character, String> SORTED_LIST_OF_EMPLOYEE_WITH_SALARY_AND_LASTNAME_START_AFTER =
(emp, salary, firstChar) -> emp.stream()
								.filter((e) -> e.getSalary() > salary && e.getLastName().charAt(0) > firstChar)
								.map(fullName)
								.sorted()
								.collect(Collectors.joining(", "));


}
