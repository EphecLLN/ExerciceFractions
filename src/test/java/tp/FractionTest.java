/**
 * 
 */
package tp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Virginie Van den Schrieck
 *
 */
class FractionTest {
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	/**
	 * Test method for {@link tp.Fraction#Fraction()}.
	 */
	@Test
	void testFraction() {
		Fraction f = new Fraction();
		assertEquals(f.getNumerator(),0);
		assertNotEquals(f.getDenominator(),0);
	}

	/**
	 * Test method for {@link tp.Fraction#Fraction(int, int)}.
	 */
	@Test
	void testFractionIntInt() {
		Fraction f = new Fraction(2,4);
		assertEquals(f.getNumerator(),1);
		assertEquals(f.getDenominator(),2);
		f = new Fraction(2,-4);
		assertEquals(f.getNumerator(),-1);
		assertEquals(f.getDenominator(),2);
		f = new Fraction(-8,-4);
		assertEquals(f.getNumerator(),2);
		assertEquals(f.getDenominator(),1);
	}

	/**
	 * Test method for {@link tp.Fraction#Fraction(int, tp.Fraction)}.
	 */
	@Test
	void testFractionIntFraction() {
		//Test 1+1/2
		Fraction f = new Fraction(1,2);
		Fraction m = new Fraction(1,f);
		assertEquals(m.getNumerator(),3);
		assertEquals(m.getDenominator(),2);
		//Test 2 + 4/2
		f = new Fraction(4,2);
		m = new Fraction(2,f);
		assertEquals(m.getNumerator(),4);
		assertEquals(m.getDenominator(),1);
	}

	/**
	 * Test method for {@link tp.Fraction#getNumerator()}.
	 */
	@Test
	void testGetNumerator() {
		Fraction f = new Fraction(2,4);
		assertEquals(f.getNumerator(),1);
	}

	/**
	 * Test method for {@link tp.Fraction#setNumerator(int)}.
	 */
	@Test
	void testSetNumerator() {
		Fraction f = new Fraction(1,2);
		f.setNumerator(4);
		assertEquals(f.getNumerator(),2);
	}

	/**
	 * Test method for {@link tp.Fraction#getDenominator()}.
	 */
	@Test
	void testGetDenominator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#setDenominator(int)}.
	 */
	@Test
	void testSetDenominator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#toString()}.
	 */
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#asMixedNumber()}.
	 */
	@Test
	void testAsMixedNumber() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#add(tp.Fraction)}.
	 */
	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#soustract(tp.Fraction)}.
	 */
	@Test
	void testSoustract() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#multiply(tp.Fraction)}.
	 */
	@Test
	void testMultiply() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#divide(tp.Fraction)}.
	 */
	@Test
	void testDivide() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#raiseToPower(int)}.
	 */
	@Test
	void testRaiseToPower() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isZero()}.
	 */
	@Test
	void testIsZero() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isInteger()}.
	 */
	@Test
	void testIsInteger() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isNegative()}.
	 */
	@Test
	void testIsNegative() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isSameFraction(tp.Fraction)}.
	 */
	@Test
	void testIsSameFraction() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isGreaterThan(tp.Fraction)}.
	 */
	@Test
	void testIsGreaterThan() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isUnitFraction()}.
	 */
	@Test
	void testIsUnitFraction() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isReduced()}.
	 */
	@Test
	void testIsReduced() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isProperFraction()}.
	 */
	@Test
	void testIsProperFraction() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#isAdjacentTo(tp.Fraction)}.
	 */
	@Test
	void testIsAdjacentTo() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#toDouble()}.
	 */
	@Test
	void testToDouble() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link tp.Fraction#clone()}.
	 */
	@Test
	void testClone() {
		fail("Not yet implemented");
	}

}
