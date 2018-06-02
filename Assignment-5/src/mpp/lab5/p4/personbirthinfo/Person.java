package mpp.lab5.p4.personbirthinfo;

public class Person {
	private String name;
	private BirthInfo birthInfo;
	
	Person(String n){
		name = n;
	}
	

	public String getName() {
		return name;
	}

	public BirthInfo getBirthInfo() {
		return birthInfo;
	}

	public void setBirthInfo(BirthInfo birthInfo) {
		this.birthInfo = birthInfo;
	}


}
