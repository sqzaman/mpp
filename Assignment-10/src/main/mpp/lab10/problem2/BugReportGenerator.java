package mpp.lab10.problem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mpp.lab10.problem2.classfinder.ClassFinder;




/**
 * This class scans the package lesson10.labs.prob2.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 * 
 * Joe Smith reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 * Tom Jones reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "mpp.lab10.problem2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		// implement
		Map<String, String> bugs = new HashMap<>();
		classes.stream()
		.forEach(aClass -> {
			BugReport annotation = aClass.getAnnotation(BugReport.class);
			String key = annotation.assignedTo(),
				value = "\n\t" + REPORTED_BY + annotation.reportedBy() + 
					"\n\t" + CLASS_NAME + aClass.getName() +
					"\n\t" + DESCRIPTION + annotation.description() +
					"\n\t" + SEVERITY + annotation.severity() + "\n";
			
			if(bugs.containsKey(key)) {
				bugs.put(key, bugs.get(key) + value);
			} else {
				bugs.put(key, "\n"+ key + value);
			}
		});
		
		try {
			FileWriter fileWriter = new FileWriter(REPORT_NAME, false);
			
			for(String value: bugs.values()) {
				fileWriter.write(value);
			}
			
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
