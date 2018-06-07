package mpp.lab5.p1;

import java.awt.Component;



final public class AddressRuleSet implements RuleSet {
	AddressRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow) ob;
		String id = addr.getIdValue();
		String street = addr.getStreetValue();
		String city = addr.getCityValue();
		String state = addr.getStateValue();
		String zip = addr.getZipValue();
		
		nonEmptyRule(id, street, city, state, zip);

		numericRule(id);
		
		zipRule(zip);
		
		stateRule(state);
		
		if (id.equals(zip))
			throw new RuleException("ID field may not equal zip field");

	}
	
	private void nonEmptyRule(String id, String street, String city, String state, String zip) throws RuleException {
		if (id.equals("") || street.equals("") || city.equals("") || state.equals("") || zip.equals(""))
			throw new RuleException("One or more fields are empty");
	}

	private void numericRule(String id) throws RuleException {
		try {
			Integer.parseInt(id);
		} catch(NumberFormatException e) {
			throw new RuleException("ID must be numeric");
		}
	}
	
	private void zipRule(String zip) throws RuleException {
		if (!zip.matches("^[1..9]\\d{4}$"))
			throw new RuleException("Zip must be numeric with exactly 5 digits");

	}
	
	private void stateRule(String state) throws RuleException {
		if (!state.matches("[A-Z]{2}"))
			throw new RuleException("State must have exactly two characters in the range A-Z ");
	}


}
