package mpp.lab5.p4.personbirthinfo;

public class BirthInfo {
	private String birthPlaceName;
	private Person person;
	
	BirthInfo(String bPlaceName){
		birthPlaceName = bPlaceName;
	}
	

	public String getBirthPlaceName() {
		return birthPlaceName;
	}
	

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person p) {
		person = p;
	}

	

}
