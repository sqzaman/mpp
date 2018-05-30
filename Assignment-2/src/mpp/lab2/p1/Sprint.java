package mpp.lab2.p1;

import java.util.Date;
import java.util.List;

public class Sprint {
	int id;
	Date startDate;
	Date endDate;
	List<Feature> features;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<Feature> getFeatures() {
		return features;
	}
	public void addFeature(Feature feature) {
		this.features.add(feature);
	}

	/**
	 * 
	 * 
	 * @return double time still required to finish the sprint
	 */
	public double calculateAmountOfWorkToDo() {

		double totalTimeWorked = 0.0;
		double totalTimeRequiredForSprint = 0;
		for(Feature feature: features) {
			totalTimeRequiredForSprint = feature.getEstimatedTime();
			for(WorkLog workLog: feature.getWorklogs()) {
				totalTimeWorked += workLog.getTimeWorked();
			}
		}
		
		return totalTimeRequiredForSprint - totalTimeWorked;
		
	}
	
	public double calculateAmountOfWorkAlreadyDone() {

		double totalTimeWorked = 0;
		for(Feature feature: features) {
			for(WorkLog workLog: feature.getWorklogs()) {
				totalTimeWorked += workLog.getTimeWorked();
			}
		}
		
		return totalTimeWorked;
		
	}
}
