package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.maths.AdvancedCalculator;
import com.maths.Calculator;

public class AdvancedCalculatorTest {

	//AdvancedCalculator advcalc;
	Calculator calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calc = new Calculator(10,10,"x^2");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDf() {
		//fail("Not yet implemented");
		double df = AdvancedCalculator.df(Math.PI, calc);
		assertEquals(2*Math.PI,df,0.000000009);
	}

	@Test
	public void testSimpsonIntegral() {
		calc = new Calculator(10,10,"1");
		double integral = AdvancedCalculator.SimpsonIntegral(calc);
		assertEquals(2*Math.PI,integral,0.09);
	}

	@Test
	public void testTrapeziumIntegral() {
		calc = new Calculator(10,10,"1");
		double integral = AdvancedCalculator.trapeziumIntegral(calc);
		assertEquals(2*Math.PI,integral,0.09);
	}

	@Test
	public void testGaussIntegral() {
		calc = new Calculator(10,10,"1");
		double integral = AdvancedCalculator.gaussIntegral(calc);
		assertEquals(2*Math.PI,integral,0.09);
	}

}
