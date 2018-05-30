package mpp.lab2.prob2C;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	String name;
	List<Section> sections;
	
	public Student(String n) {
		name = n;		
		sections = new ArrayList<Section>();
	}

	public List<Section> getSections() {
		return sections;
	}

	public void addSection(Section section) {
		this.sections.add(section);
	}

	public String getName() {
		return name;
	}
	
	

}
