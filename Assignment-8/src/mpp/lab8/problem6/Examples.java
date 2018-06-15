package mpp.lab8.problem6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {

	//type: Class::instanceMethod
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;
	
	// A.
	//type:  Class::instanceMethod
	Function<Employee, String> getName1 = e -> e.getName();
	Function<Employee, String> getName2 = Employee::getName;
	
	// B.
	//type: Class::instanceMethod
	BiConsumer<Employee, String> setName1 = (e,s) -> e.setName(s);
	BiConsumer<Employee, String> setName2 = Employee::setName;
	
	// C.
	//type: Class::instanceMethod
	Comparator<String> strComp1 = (s1,s2) -> s1.compareTo(s2);
	Comparator<String> strComp2 = String::compareTo;
	
	// D.
	//type: Class::staticMethod
	BiFunction<Integer, Integer, Double> pow1 = (x,y) -> Math.pow(x,y);
	BiFunction<Integer, Integer, Double> pow2 = Math::pow;
	
	// E.
	//type: Class::instanceMethod
	Function<Apple, Double> getWeight1 = (Apple a) -> a.getWeight();
	Function<Apple, Double> getWeight2 = Apple::getWeight;
	
	// F.
	//type: Class::staticMethod
	Function<String, Integer> parser1 = x -> Integer.parseInt(x);
	Function<String, Integer> parser2 = Integer::parseInt;
	
	// G.
	//type: Class::instanceMethod
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> empComp1 = (e1, e2) -> comp.compare(e1,e2);
	Comparator<Employee> empComp2 = comp::compare;
	

	public void evaluator() {
		Employee testEmp = new Employee("Baby", 500);
		Apple testApple = new Apple(4.5);
		System.out.println(upper2.apply("hello"));
		System.out.println(getName2.apply(testEmp));
		
		
		setName2.accept(testEmp,"Boy");
		System.out.println(testEmp.getName());
		
		System.out.println(strComp2.compare("a", "b"));
		System.out.println(pow2.apply(2,10));
		System.out.println(getWeight2.apply(testApple));
		
		System.out.println(parser2.apply("55"));
		
		System.out.println(empComp2.compare(testEmp, new Employee("Boy", 500)));
		
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	@FunctionalInterface
	public interface NoArgNoReturn {
		void act();
	}
	
	
	static class Apple {
		Apple(double weight) {
			this.weight = weight;
		}
		private double weight;
		public double getWeight() {
			return weight;
		}
	}
}
