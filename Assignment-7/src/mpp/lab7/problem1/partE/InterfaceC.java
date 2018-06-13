package mpp.lab7.problem1.partE;

public interface InterfaceC extends InterfaceA{
	default void method() {
		System.out.println("InterfaceC: method()");
	}

}
