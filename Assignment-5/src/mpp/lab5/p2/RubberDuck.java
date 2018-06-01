package mpp.lab5.p2;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

}
