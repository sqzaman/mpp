package mpp.lab2.prob2A;

public class Student {
	String name;
	GradeReport gradeReport;
	
	public Student(String studentName) {
		name = studentName;
	}

	public GradeReport getGradeReport() {
		return gradeReport;
	}

	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}

	public String getName() {
		return name;
	}
	

}
