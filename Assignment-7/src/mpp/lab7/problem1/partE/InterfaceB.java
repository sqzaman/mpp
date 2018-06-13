package mpp.lab7.problem1.partE;

public interface InterfaceB extends InterfaceA {
	default void method() {
		System.out.println("InterfaceB: method()");
	}
}
