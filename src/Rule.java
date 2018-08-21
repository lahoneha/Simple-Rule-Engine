public abstract class Rule {

	private String ruleName;

	// getter and setter for field ruleName
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleName() {
		return ruleName;
	}

	private boolean hasRulePassed = false;

	// getter and setter for field hasRulePassed
	public void setHasRulePassed(boolean hasRulePassed) {
		this.hasRulePassed = hasRulePassed;
	}

	public boolean getHasRulePassed() {
		return hasRulePassed;
	}

	Rule(String name) {
		setRuleName(name);
	}

	// This is the business logic for the rule
	abstract void Execute(int[] input);

	// This is the action to be performed once the rule executes
	void PrintRuleResult() {
		StringBuilder sb = new StringBuilder("Rule");
		String ruleResult = "failed";
		if (hasRulePassed)
			ruleResult = "passed";
		System.out.println(sb.append(" ").append(this.ruleName).append(" ")
				.append(ruleResult));
	}

}
