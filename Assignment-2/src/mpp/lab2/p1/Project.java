package mpp.lab2.p1;

import java.util.ArrayList;
import java.util.List;

public class Project {
	int id;
	String title;
	String description;
	Personnel projectManager;
	List<Release> releases;
	
	public Project() {
		releases = new ArrayList<Release>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Personnel getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Personnel projectManager) {
		this.projectManager = projectManager;
	}

	public List<Release> getReleases() {
		return releases;
	}

	public void addRelease(Release release) {
		this.releases.add(release);
	}
}
