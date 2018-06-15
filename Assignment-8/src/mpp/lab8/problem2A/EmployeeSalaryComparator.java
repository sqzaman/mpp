package mpp.lab8.problem2A;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.salary == e2.salary)
			return 0;
		//return e1.name.compareTo(e2.name) < e2.salary ? -1: e1.salary == e2.salary ? 0: 1;
		else if (e1.salary < e2.salary)
			return -1;
		else
			return 1;
	}
}
