package fall2014.challenge3;

import org.junit.Assert;
import org.junit.Test;

public class MathOnNumbersInStringTest {

	@Test
	public void testNullString() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.calculate(null);
		Assert.assertNull(value);
	}
	
	@Test
	public void TestExampleString() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		String input = "Hello6 9World 2, Nic8e D7ay!";
		Integer value = calculator.add(input);
		Assert.assertEquals(32, value, 0);
		value = calculator.calculate(input);
		Assert.assertEquals(2, value, 0);
	}
	
	@Test
	public void TestZeroString() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		String input = "Hello6 9World, Nic-8e D-7ay!";
		Integer value = calculator.add(input);
		Assert.assertEquals(0, value, 0);
		value = calculator.calculate(input);
		Assert.assertEquals(0, value, 0);
	}
	
	@Test
	public void TestMultiDigitAdd() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		String input = "10x1y100";
		Integer value = calculator.add(input);
		Assert.assertEquals(111, value, 0);
	}
	
	@Test
	public void TestSimpleDivision() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.divide(4, 2);
		Assert.assertEquals(2, value, 0);
	}
	
	@Test
	public void TestDivisionRounding() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.divide(5, 2);
		Assert.assertEquals(3, value, 0);
	}

	@Test
	public void TestDivisionRoundingNegative() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.divide(-5, 2);
		Assert.assertEquals(-2, value, 0);
	}
	
	@Test
	public void AddEmptyString() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("");
		Assert.assertEquals(0, value, 0);
	}
	
	@Test
	public void StringWithNoIntegers() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("abc");
		Assert.assertEquals(0, value, 0);
		value = calculator.calculate("abc");
		Assert.assertEquals(0, value, 0);
	}
	
	@Test
	public void StringWithOneInteger() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("1");
		Assert.assertEquals(1, value, 0);
		value = calculator.calculate("1");
		Assert.assertEquals(1, value, 0);
	}
	
	@Test
	public void AddStringWithLineBreak() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("dywi23jss\ni88sjdhj1");
		Assert.assertEquals(112, value, 0);
	}
	
	@Test
	public void AddAllIntsSeparatedByAlpha() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("a1b2c3d4e5f6g7h8i9j0");
		Assert.assertEquals(45, value, 0);
	}
	
	@Test
	public void AddLeading0() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("012");
		Assert.assertEquals(12, value, 0);
	}
	
	@Test
	public void AddLeading0To0() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("012a-012");
		Assert.assertEquals(0, value, 0);
	}
	
	@Test
	public void AddAllIntsAndOperators() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("0+1-2*3/4");
		Assert.assertEquals(6, value, 0);
	}
	
	@Test
	public void AddPositiveNegative() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("3-1");
		Assert.assertEquals(2, value, 0);
	}
	
	@Test
	public void AddNegativeExampleString() {
		MathOnNumbersInString calculator = new MathOnNumbersInString();
		Integer value = calculator.add("dywi-2-3jssi-8-8sjdhj-1");
		Assert.assertEquals(-22, value, 0);
	}
	
	
}
