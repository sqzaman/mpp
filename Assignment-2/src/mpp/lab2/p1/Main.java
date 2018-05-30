package mpp.lab2.p1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personnel developer1 = new Personnel("Zaman", PersonnelType.Developer);
		Personnel developer2 = new Personnel("Aman", PersonnelType.Developer);
		Personnel developer3 = new Personnel("Kamal", PersonnelType.Developer);
		
		Personnel pm1 = new Personnel("Akmal", PersonnelType.ProjectManager);

		
		Feature f1 = new Feature();
		f1.setId(1);
		f1.setDeveloper(developer1);
		f1.setName("Login Feature");
		f1.setDescription("Login Feature Description");
		f1.setEstimatedTime(10);
		
		
		Feature f2 = new Feature();
		f2.setId(2);
		f2.setDeveloper(developer2);
		f2.setName("Logout Feature");
		f2.setDescription("Logout Feature Description");
		f2.setEstimatedTime(10);
		
		Feature f3 = new Feature();
		f3.setId(3);
		f3.setDeveloper(developer2);
		f3.setName("Main Feature");
		f3.setDescription("Main Feature Description");
		f3.setEstimatedTime(100);

	}

}
