package mpp.lab7.problem5;

public interface QuackBehavior {
	default void quack() {
		System.out.println("quacking");
	}
}
