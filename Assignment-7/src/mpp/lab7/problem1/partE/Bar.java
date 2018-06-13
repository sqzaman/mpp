package mpp.lab7.problem1.partE;

public interface Bar {
	default void someMethod() {
		System.out.println("Bar#someMethod()");
	}
}
