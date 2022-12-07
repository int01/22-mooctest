package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilsTest {

	@Test(timeout = 4000)
	public void test00() throws Throwable {
		int int0 = MathUtils.getMax(0, 1);
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void test01() throws Throwable {
		double double0 = MathUtils.logarithm(0, 0.6670841613769531);
		assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test02() throws Throwable {
		double double0 = MathUtils.logarithm(0.625, 3320.4039999999995);
		assertEquals((-17.250593903425383), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void test03() throws Throwable {
		int int0 = MathUtils.getMax((-1), (-1));
		assertEquals((-1), int0);
	}

	@Test(timeout = 4000)
	public void test04() throws Throwable {
		int int0 = MathUtils.getDigitFromNumber(1, 0);
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void test05() throws Throwable {
		int int0 = MathUtils.getDigitFromNumber((-1), 0);
		assertEquals((-1), int0);
	}

	@Test(timeout = 4000)
	public void test06() throws Throwable {
		// Undeclared exception!
		try {
			MathUtils.getDigitFromNumber(0, (-1));
			fail("Expecting exception: ArithmeticException");

		} catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}
	}

	@Test(timeout = 4000)
	public void test07() throws Throwable {
		int int0 = MathUtils.getMax(1, 0);
		assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void test08() throws Throwable {
		int int0 = MathUtils.getMax(0, 0);
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test09() throws Throwable {
		int int0 = MathUtils.getDigitFromNumber(0, 0);
		assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void test10() throws Throwable {
		MathUtils mathUtils0 = new MathUtils();
	}

}
