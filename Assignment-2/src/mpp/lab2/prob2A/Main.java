package mpp.lab2.prob2A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Zaman");
		GradeReport gradeReport1 = new GradeReport(student1);
		student1.setGradeReport(gradeReport1);
		
		Student student2 = new Student("Kamal");
		GradeReport gradeReport2 = new GradeReport(student2);
		student1.setGradeReport(gradeReport2);
		
		Student student3 = new Student("Afsana");
		GradeReport gradeReport3 = new GradeReport(student3);
		student3.setGradeReport(gradeReport3);

	}

}
