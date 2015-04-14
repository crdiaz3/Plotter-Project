package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Point3D;
import com.Polygon3D;

public class Polygon3DTest {
	
	Polygon3D poly;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		poly = new Polygon3D();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPointPoint3D() {
		poly = new Polygon3D(3, new int[]{0,0,0}, new int[]{2,2,2}, new int[]{1,1,1});
		poly.addPoint(new Point3D(1.0,2.0,3.0));
		int[] temp = new int[]{0,0,0,1};
		int[] get = poly.getXpoints();
		assertTrue(Arrays.equals(temp,get));
		temp = new int[]{2,2,2,2};
		get = poly.getYpoints();
		assertTrue(Arrays.equals(temp, get));
		temp = new int[]{1,1,1,3};
		get = poly.getZpoints();
		assertTrue(Arrays.equals(temp, get));
		
	}

	@Test
	public void testAddPointIntIntInt() {
		poly = new Polygon3D(3, new int[]{0,0,0}, new int[]{2,2,2}, new int[]{1,1,1});
		poly.addPoint(3,2,1);
		int[] temp = new int[]{0,0,0,3};
		int[] get = poly.getXpoints();
		assertTrue(Arrays.equals(temp,get));
		temp = new int[]{2,2,2,2};
		get = poly.getYpoints();
		assertTrue(Arrays.equals(temp, get));
		temp = new int[]{1,1,1,1};
		get = poly.getZpoints();
		assertTrue(Arrays.equals(temp, get));
	}

	@Test
	public void testDivideIntoTriangles() {
		poly = new Polygon3D(2,new int[]{1,1}, new int[]{2,1}, new int[]{3 ,5});
		assertTrue(Arrays.equals(new Polygon3D[0], Polygon3D.divideIntoTriangles(poly)));
		poly = new Polygon3D(4,new int[4], new int[4], new int[4]);
		fail("Not fully tested");
	}

	@Test
	public void testExtractSubPolygon3D() {
		fail("Not yet implemented");
	}

	@Test
	public void testFromAreaToPolygon2D() {
		fail("Not yet implemented");
	}

	@Test
	public void testClipPolygonToArea2D() {
		fail("Not yet implemented");
	}

	@Test
	public void testClipPolygon3D() {
		fail("Not yet implemented");
	}

	@Test
	public void testClipPolygon3DInY() {
		fail("Not yet implemented");
	}

	@Test
	public void testClipPolygon3DInX() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsFacing() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindNormal() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasInsidePoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuildTranslatedPolygon() {
		poly = new Polygon3D(3, new int[]{2,3,0}, new int[]{0,3,0}, new int[]{0,0,0});
		Polygon3D temp = poly.buildTranslatedPolygon(2, 5, -2);
		assertTrue(Arrays.equals(new int[]{4,5,2},temp.getXpoints()));
		assertTrue(Arrays.equals(new int[]{5,8,5},temp.getYpoints()));
		assertTrue(Arrays.equals(new int[]{-2,-2,-2},temp.getZpoints()));
	}

	@Test
	public void testTranslateDoubleDoubleDouble() {
		poly = new Polygon3D(4, new int[]{3,4,2,2}, new int[]{6,5,2,5}, 
				new int[]{9,0,4,2});
		poly.translate(2, 5, -4);
		assertTrue(Arrays.equals(new int[]{5,6,4,4},poly.getXpoints()));
		assertTrue(Arrays.equals(new int[]{11,10,7,10},poly.getYpoints()));
		assertTrue(Arrays.equals(new int[]{5,-4,0,-2},poly.getZpoints()));
	}

	@Test
	public void testInvertY() {
		poly = new Polygon3D(2, new int[]{2,4}, new int[]{5,0}, new int[]{0,2});
		poly.invertY(3);
		assertTrue(Arrays.equals(new int[]{-2,3},poly.getYpoints()));
	}

	@Test
	public void testBuildPrismIFace() {
		poly = new Polygon3D(3, new int[]{2,2,2}, new int[]{1,2,3}, new int[]{3,2,1});
		Polygon3D temp = new Polygon3D(3, new int[]{1,1,1}, new int[]{1,5,3}, new int[]{5,2,4});
		Polygon3D res = new Polygon3D(4, new int[]{1,1,2,2}, new int[]{5,3,3,2}, new int[]{2,4,1,2});
		Polygon3D calc = Polygon3D.buildPrismIFace(temp, poly, 1);
		assertTrue(Arrays.equals(calc.getXpoints(), res.getXpoints()));
		assertTrue(Arrays.equals(calc.getYpoints(), res.getYpoints()));
		assertTrue(Arrays.equals(calc.getZpoints(), res.getZpoints()));
	}

	@Test
	public void testFindCentroid() {
		poly = new Polygon3D(4, new int[]{0,2,2,0},new int[]{0,0,2,2}, new int[]{0,1,2,3});
		assertTrue((new Point3D(1,1,1.5)).equals(Polygon3D.findCentroid(poly)));
	}

}
