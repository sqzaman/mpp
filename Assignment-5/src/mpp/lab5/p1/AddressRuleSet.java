package mpp.lab5.p1;

import java.awt.Component;


final public class AddressRuleSet implements RuleSet {
	// package level access
	AddressRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		AddressWindow addr = (AddressWindow) ob;

		numericRule(addr);
		// comment
		throw new RuleException("An address rule has been violated!");

	}

	private void numericRule(AddressWindow addr) throws RuleException {
		// String zip = addr.getZipValue();
		// try {
		// Integer.parseInt(zip);
		// } catch(NumberFormatException e) {
		// throw new RuleException("Zip must be numeric");
		// }
	}

}
