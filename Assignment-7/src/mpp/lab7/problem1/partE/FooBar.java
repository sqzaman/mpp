package mpp.lab7.problem1.partE;

public class FooBar implements Foo, Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FooBar#Main()");
		FooBar fooBar = new FooBar();
		fooBar.someMethod();
		fooBar.someOtherMethod();

	}

	@Override
	public void someMethod() {
		// TODO Auto-generated method stub
		System.out.println("FooBar#someMethod()");
	}

}
