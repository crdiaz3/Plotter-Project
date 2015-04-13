package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.maths.ParseFunction;

public class ParseFunctionTest {
	
	ParseFunction pf;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		pf = new ParseFunction();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParseFunction() {
		pf.setFunction("(12+6)/3 - 2*8");
		assertEquals(-10,pf.parseFunction(),0.0);
		pf.setFunction("sin(3.14)+cos(0)*tan((3.14/4))");
		assertEquals(1.0,pf.parseFunction(),0.009);
		//System.out.println(pf.getFunction()+"\n"+pf.recordedFunctions.toString());
		pf.setFunction("2/0");
		assertEquals(0,pf.parseFunction(),0.0);
		
	}

}
