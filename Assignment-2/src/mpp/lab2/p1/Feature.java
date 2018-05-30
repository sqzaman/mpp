package mpp.lab2.p1;

import java.util.List;


public class Feature {
	int id;
	String name;
	String description;
	Personnel developer;
	int estimatedTime; // man hour

	List<WorkLog> worklogs;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Personnel getDeveloper() {
		return developer;
	}
	public void setDeveloper(Personnel developer) {
		this.developer = developer;
	}
	public int getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	
	public void addWorklogs(WorkLog wLog) {
		this.worklogs.add(wLog);
	}
	
	public List<WorkLog> getWorklogs() {
		return worklogs;
	}
}
