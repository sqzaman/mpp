package mpp.lab5.p2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = {new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck()};
		
		for(Duck d: ducks) {
			System.out.println(String.format("%s:", d.getClass().getSimpleName()));
			System.out.println("-----------------------------------");
			d.display();
			d.fly();
			d.quack();
			d.swim();
			System.out.println("***********************************");
		}

	}

}
