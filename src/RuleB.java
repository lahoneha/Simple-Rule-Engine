public class RuleB extends Rule {

	public RuleB(String name) {
		super(name);
	}

	/**
	 * If any integer in the sequence is at least 500 greater than the one
	 * previous to it in the sequence, the rule is "passed", else it is
	 * "failed".
	 *
	 * @param inputSeries
	 *            : array of integers
	 */
	public void Execute(int[] inputSeries) {
		if (inputSeries != null && inputSeries.length >= 2) {
			int previous = inputSeries[0];
			if (inputSeries.length > 1) {
				for (int i = 1; i < inputSeries.length; i++) {
					int current = inputSeries[i];
					if (current - previous >= 500) {
						setHasRulePassed(true);
						break;
					}
					previous = current;
				}
			}

		}
	}

}
