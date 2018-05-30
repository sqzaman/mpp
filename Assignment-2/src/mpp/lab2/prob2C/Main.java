package mpp.lab2.prob2C;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Section section1 = new Section("FPP");
		Section section2 = new Section("MPP");
		Section section3 = new Section("WAP");
		Section section4 = new Section("WAA");
		
		Student student1 = new Student("Zaman");
		student1.addSection(section2);
		student1.addSection(section4);
		
		Student student2 = new Student("Samiul");
		student2.addSection(section1);
		student2.addSection(section3);
		
		Student student3 = new Student("Sharif");
		student3.addSection(section1);
		student3.addSection(section2);
		student3.addSection(section3);
		
		Student student4 = new Student("Nisha");
		student4.addSection(section2);
		student4.addSection(section3);
		student4.addSection(section4);
		

	}

}
