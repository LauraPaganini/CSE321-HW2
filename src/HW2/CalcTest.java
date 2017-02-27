

import static org.junit.Assert.*;
import org.junit.Test;


public class CalcTest {

	@Test
	public void testSubtract() {
		assertEquals(1, Calc.subtract(4, 3));
		assertEquals(-3, Calc.subtract(0, 3));
		assertEquals(0, Calc.subtract(2, 2));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(6, Calc.multiply(3, 2));
		assertEquals(0, Calc.multiply(3, 0));
		assertEquals(-4, Calc.multiply(2, -2));
	}
	
	@Test
	public void testDivide() {
		assertEquals(2, Calc.divide(4, 2));
		assertEquals(1, Calc.divide(3, 3));
		assertEquals(-4, Calc.divide(8, -2));
	}
}
