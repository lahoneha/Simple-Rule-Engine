public class RuleA extends Rule {

	public RuleA(String name) {
		super(name);
	}

	/**
	 * If any two sequential integers in the sequence add up to 1000 or greater,
	 * the rule is "passed". If not, the rule is "failed
	 *
	 * @param inputSeries
	 *            : array of integers
	 */
	public void Execute(int[] inputSeries) {
		if (inputSeries != null && inputSeries.length >= 2) {
			int previous = inputSeries[0];
			for (int i = 1; i < inputSeries.length; i++) {
				int current = inputSeries[i];
				if (previous + current >= 1000) {
					setHasRulePassed(true);
					break;
				}
				previous = current;
			}

		}
	}

}
