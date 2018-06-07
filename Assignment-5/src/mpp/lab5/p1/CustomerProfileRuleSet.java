package mpp.lab5.p1;

import java.awt.Component;



final public class CustomerProfileRuleSet implements RuleSet {

	CustomerProfileRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow custProf = (ProfileWindow) ob;
		String id = custProf.getIdValue();
		String firstName = custProf.getFirstNameValue();
		String lastName = custProf.getLastNameValue();
		String fvrtMovie = custProf.getFavoriteMovieValue();
		String fvrtRestaurant = custProf.getFavoriteRestaurantValue();		

		nameRule(firstName);
		nameRule(lastName);

	}
	
	private void nonEmptyRule(String id, String firstName, String lastName, String fvrtMovie, String fvrtRestaurant) throws RuleException {
		if (id.equals("") || firstName.equals("") || lastName.equals("") || fvrtMovie.equals("") || fvrtRestaurant.equals(""))
			throw new RuleException("One or more fields are empty");
	}

	private void numericRule(String id) throws RuleException {
		try {
			Integer.parseInt(id);
		} catch(NumberFormatException e) {
			throw new RuleException("ID must be numeric");
		}
	}
	
 
	private void nameRule(String name) throws RuleException {
		if (!name.matches("^[a-zA-Z]+$"))
			throw new RuleException("firstname and lastname fields may not contain spaces or characters other than a-z, A-Z");
	}
	
	
}
