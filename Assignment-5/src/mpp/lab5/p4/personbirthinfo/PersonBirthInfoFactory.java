package mpp.lab5.p4.personbirthinfo;

public final class PersonBirthInfoFactory {
	
	private PersonBirthInfoFactory(){		
	}
	
	public static PersonBirthInfo createPersonAndBirthInfo(String personName, String birthPlaceName) {
		
		Person p = new Person(personName);
		BirthInfo bi = new BirthInfo(birthPlaceName);
		
		p.setBirthInfo(bi);
		bi.setPerson(p);
		
		return new PersonBirthInfoImpl(p, bi);
	
	}

}
