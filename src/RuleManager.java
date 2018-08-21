import java.util.*;

public final class RuleManager {

	private static List<Rule> ruleSet = new ArrayList<Rule>();
	private static List<Integer> inputList = new ArrayList<Integer>();
	private static Boolean didAllRulesPass = true;
	static int[] inputArray;

	private RuleManager() {

	}

	public static void GetUserInput() {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter a series of Integers and press enter to exit");
		while (!sc.hasNext("exit")) {
			Scanner lineSc = new Scanner(sc.nextLine());
			while (lineSc.hasNextInt()) {
				if (lineSc.equals(""))
					break;
				inputList.add(lineSc.nextInt());
			}
			lineSc.close();
		}
		sc.close();
		int c = inputList.size();
		if (c == 0) {
			System.out.println("Please enter valid input");
			return;
		}
		
		//building an array of ints from arrayList
		inputArray = new int[c];
		for (int i = 0; i < inputList.size(); i++) {
			if (inputList != null && inputList.get(i) != null) {
				inputArray[i] = inputList.get(i);
			}
		}
		BuildRuleSet();
	}

	public static void BuildRuleSet() {
		if (inputArray.length >= 2) {
			ruleSet.add(new RuleA("RuleA"));
			ruleSet.add(new RuleB("RuleB"));
		} else
			System.out
					.println("Enter atleast two integers for rule A and rule B to run");
		ruleSet.add(new RuleC("RuleC"));
		RunRules();
	}

	public static void RunRules() {
		for (Rule item : ruleSet) {
			if (inputArray != null && inputArray.length > 0) {
				item.Execute(inputArray);
				item.PrintRuleResult();
				if (item != null && !item.getHasRulePassed())
					didAllRulesPass = false;
			}

		}
		PrintRulesResult();
	}

	public static void PrintRulesResult() {
		String allRulesResult = "Not all rules passed";
		if (didAllRulesPass)
			allRulesResult = "All rules passed";
		System.out.println(allRulesResult);
	}

}
