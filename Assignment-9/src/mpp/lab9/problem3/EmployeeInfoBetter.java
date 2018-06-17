package mpp.lab9.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class EmployeeInfoBetter {
	static enum SortMethod {
		BYNAME, BYSALARY
	};
	
	final static class Pair<S,T>{
		Pair(S f, T t){
			first = f;
			second = t;
		}
		S first;
		T second;
	}

	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> e.getSalary();	
	
	@SuppressWarnings("rawtypes")
	final Pair<Function, Function> nameSalaryPair = new Pair<>(byName, bySalary);
	@SuppressWarnings("rawtypes")
	final Pair<Function, Function> salaryNamePair = new Pair<>(bySalary, byName);
	
	@SuppressWarnings({ "rawtypes", "serial" })
	Map<SortMethod, Pair<Function, Function>> mapSorter = new HashMap<SortMethod, Pair<Function, Function>>() {
		{
			put(SortMethod.BYNAME, nameSalaryPair);
			put(SortMethod.BYSALARY, salaryNamePair);
		}
	};
	
	@SuppressWarnings({ "rawtypes", "serial" })
	Map<SortMethod, Comparator<Employee>> mapSorter2 = new HashMap<SortMethod, Comparator<Employee>>() {
		{
			put(SortMethod.BYNAME, Comparator.comparing(byName).thenComparing(bySalary));
			put(SortMethod.BYSALARY, Comparator.comparing(bySalary).thenComparing(byName));
		}
	};
	
	@SuppressWarnings("unchecked")
	public void sort(List<Employee> emps, final SortMethod method) {
		// first way
		 Collections.sort(emps, Comparator.comparing(mapSorter.get(method).first).thenComparing(mapSorter.get(method).second));
		
		// 2nd way
		/*if (mapSorter2.containsKey(method)) {
			Collections.sort(emps, mapSorter2.get(method));
		}*/
		
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		//ei.sort(emps, EmployeeInfoBetter.SortMethod.BYNAME);
		//System.out.println(emps);
		// same instance
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYSALARY);
		 System.out.println(emps);
	}
}
