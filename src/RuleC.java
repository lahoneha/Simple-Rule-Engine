public class RuleC extends Rule {

	public RuleC(String name) {
		super(name);
	}

	/**
	 * If the average of all the integers in the sequence is 500 or greater the
	 * rule is "passed", else it is "failed".
	 * 
	 * @param inputSeries
	 *            : array of integers
	 */
	public void Execute(int[] inputSeries) {
		int sum = 0;
		int average = 0;
		if (inputSeries != null) {
			int count = inputSeries.length;
			for (int i = 0; i < inputSeries.length; i++) {
				sum = sum + inputSeries[i];
			}
			if (count != 0) {
				average = sum / count;
			}
			if (average >= 500)
				setHasRulePassed(true);
		}
	}

}
