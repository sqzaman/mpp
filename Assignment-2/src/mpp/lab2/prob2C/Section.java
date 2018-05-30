package mpp.lab2.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Section {
	
	String sectionName;
	List<Student> students;
	
	public Section(String sectionNme) {
		sectionName = sectionNme;
		students = new ArrayList<Student>();
	}

	public String getSectionName() {
		return sectionName;
	}

	public List<Student> getStudents() {	
		return students;
	}

}
