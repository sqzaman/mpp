package mpp.lab;


import java.util.List;

public class Project {
	int id;
	String title;
	String description;
	Personnel projectManager;
	Backlog backlog;
	List<Release> releases;	
}
