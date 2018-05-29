package mpp.lab;

import java.util.List;


public class Feature {
	int id;
	String name;
	String description;
	Personnel developer;
	int estimatedTime; // man hour
	int status;
	List<WorkLog> worklogs;	
}
