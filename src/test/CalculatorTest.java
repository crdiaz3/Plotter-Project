package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.maths.Calculator;

public class CalculatorTest {
	
	Calculator calc; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calc = new Calculator(10,10,"x");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetFunction() {
		
		double[][] res = calc.getFunction();
		double[][] exp = new double[1000][2];
		for(int i=0;i<1000;i++)
		{
			exp[i][0] = (calc.b/1000.0*i);
			exp[i][1] = (calc.b/1000.0*i);
		}
		
		for(int i=0;i<1000;i++)
		{
			assertEquals(Integer.toString(i),exp[i][0],res[i][0],0.009);
			assertEquals(exp[i][1],res[i][1],0.009);
		}
		
	}

	@Test
	public void testGetFunction3D() {
		fail("Not yet implemented");
	}

}
