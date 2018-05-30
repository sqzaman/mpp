package mpp.lab2.p1;

import java.util.Date;

public class WorkLog {
	int id;
	Feature feature;
	Date date;
	int timeWorked; // man hour

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTimeWorked() {
		return timeWorked;
	}
	public void setTimeWorked(int timeWorked) {
		this.timeWorked = timeWorked;
	}
}
