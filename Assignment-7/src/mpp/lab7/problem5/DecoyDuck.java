package mpp.lab7.problem5;

public class DecoyDuck  extends Duck {
	
	public DecoyDuck() {
		setFlyBehavior(new CannotFly());
		setQuackBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

}
