package mpp.lab5.p2;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	public Duck() {

	}

	public void setFlyBehavior(FlyBehavior fBehavior) {
		flyBehavior = fBehavior;
	}

	public void setQuackBehavior(QuackBehavior qBehavior) {
		quackBehavior = qBehavior;
	}
	
	public abstract void display();
	
	
	public void fly() {
		flyBehavior.fly();
	}

	public void quack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("swimming");
	}
	
	
	

}
