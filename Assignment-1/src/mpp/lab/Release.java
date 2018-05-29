package mpp.lab;

import java.sql.Date;
import java.util.List;

public class Release {	
	 int id;
	 String releaseVersion;
	 Date releaseDate;
	 String releaseNotes;
	 List<Feature> features; 
}
