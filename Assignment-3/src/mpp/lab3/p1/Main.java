package mpp.lab3.p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));

	}

}
