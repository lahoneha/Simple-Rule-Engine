import static org.junit.Assert.*;

import org.junit.Test;

public class RuleEngineTestCase {

	Rule objectA = new RuleA("TestRuleA");
	Rule objectB = new RuleA("TestRuleB");
	Rule objectC = new RuleA("TestRuleC");

	@Test
	public void testRuleA() {
		int[] a = { 100, 20, 30 };
		objectA.Execute(a);
		assertEquals(objectA.getHasRulePassed(), false);
	}
	
	@Test
	public void testRuleB() {
		int[] b = { 100, 20, 30 };
		objectA.Execute(b);
		assertEquals(objectB.getHasRulePassed(), false);
	}
	
	@Test
	public void testRuleC() {
		int[] c = { 100, 20, 30 };
		objectA.Execute(c);
		assertEquals(objectC.getHasRulePassed(), false);
	}

}
