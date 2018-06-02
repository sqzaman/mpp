package mpp.lab5.p4.personbirthinfo;

public final class PersonBirthInfoImpl implements PersonBirthInfo {
	
	private Person person;
	private BirthInfo birthInfo;

	//package level
	PersonBirthInfoImpl(Person p, BirthInfo bi) {
		person = p;
		birthInfo = bi;
	}

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return person;
	}

	@Override
	public BirthInfo getBirthInfo() {
		// TODO Auto-generated method stub
		return birthInfo;
	}

}
