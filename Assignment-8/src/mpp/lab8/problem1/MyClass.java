package mpp.lab8.problem1;

import java.util.function.Predicate;

public class MyClass {
	int x;
	String y;
	Predicate<MyClass> p1 = (MyClass instance) -> this.equals(instance);
	Predicate<MyClass> p2 = this::equals;
			
	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
	}

	public void myMethod(MyClass cl) {
		System.out.println("Is this instance p1 equal to cl? " + p1.test(cl));
		System.out.println("Is this instance p2 equal to cl? " + p2.test(cl));
		System.out.println((this==cl));
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (x != other.x)
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		MyClass myclass = new MyClass(28, "Ab");
		myclass.myMethod(myclass);

		myclass.myMethod(new MyClass(28, "Ab"));

	}
	

}
