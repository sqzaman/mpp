package mpp.lab7.problem5;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
		
	}

}
