package mpp.lab3.p1;

public class PersonWithJob extends Person {

	private double salary;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) aPerson;
		boolean isEqual = this.getName().equals(p.getName()) && this.getSalary() == p.getSalary();
		return isEqual;
	}

}
