package andycpp;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	private static Calculator calculator = new Calculator();
	
	protected void setUp() throws Exception {
		calculator.clear();
	}

	public void testAdd() {
		calculator.add(2);

        calculator.add(3);

        assertEquals(5, calculator.getResult());
	}

	public void testSubstract() {
		calculator.add(10);

        calculator.substract(2);

        System.out.println(calculator.getResult());
        assertEquals(8, calculator.getResult());
	}

	public void testMultiply() {
		fail("Not yet implemented");
	}

	public void testDivide() {
		calculator.add(8);

        calculator.divide(2);

        assertEquals(4, calculator.getResult());
	}

}
