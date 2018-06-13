package mpp.lab7.problem1.partE;

public interface InterfaceD extends InterfaceB, InterfaceC{


	@Override
	default void method() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceC: method()");
	}

}
