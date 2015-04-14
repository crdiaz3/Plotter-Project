package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Point3D;

public class Point3DTest {
	Point3D point1;
	Point3D point2;
	Point3D point3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateCosin() {
		point1 = new Point3D(2,5,2);
		point2 = new Point3D(-2,-5,-2);
		assertEquals(-1.0,Point3D.calculateCosin(point1, point2),0.009);
		point1 = new Point3D(2,5.2,6);
		point2 = new Point3D(6.2,6,2);
		assertEquals(0.77,Point3D.calculateCosin(point1, point2),0.009);
	}

	@Test
	public void testCalculateDotProductPoint3DPoint3D() {
		point1 = new Point3D(9.2,5.4,2);
		point2 = new Point3D(2.5,1.2,6);
		assertEquals(41.48,Point3D.calculateDotProduct(point1, point2),0.009);
	}

	@Test
	public void testCalculateDotProductDoubleDoubleDoublePoint3D() {
		point1 = new Point3D(2,5.2,6);
		assertEquals(57.36,Point3D.calculateDotProduct(2.1, 3.3, 6.0, point1),0.009);
	}

	@Test
	public void testCalculateNorm() {
		point1 = new Point3D(6,1.2,0.25);
		assertEquals(6.12,Point3D.calculateNorm(point1),0.009);
	}

	@Test
	public void testDistancePoint3DPoint3D() {
		point1 = new Point3D(0,0,0);
		point2 = new Point3D(0,0,1);
		assertEquals(1.0,Point3D.distance(point1, point2),0.0);
		point2 = new Point3D(-1,-1,-1);
		assertEquals(1.73,Point3D.distance(point1, point2),0.009);
	}

	@Test
	public void testDistanceDoubleDoubleDoubleDoubleDoubleDouble() {
		assertEquals(5.0,Point3D.distance(0, 0, 0, 0, 0, -5),0.0);
		assertEquals(5.20,Point3D.distance(2, 3, 4, 5, 6, 7),0.009);
	}

	@Test
	public void testCalculateOrthogonal() {
		point1 = new Point3D(2.4,6.2,-3.4);
		point2 = new Point3D(-6.2,2.4,0);
		assertTrue(point2.equals(Point3D.calculateOrthogonal(point1)));
	}

	@Test
	public void testCalculateVersor() {
		point1 = new Point3D(2.5,6,4.2);
		point2 = point1.calculateVersor();
		point3 = new Point3D(0.32,0.78,0.54);
		assertEquals(point3.x,point2.x,0.009);
		assertEquals(point3.y,point2.y,0.009);
		assertEquals(point3.z,point2.z,0.009);
	}

	@Test
	public void testCalculateCrossProduct() {
		point1 = new Point3D(2,5.4,5);
		point2 = new Point3D(4,7,12.2);
		point3 = new Point3D(30.88, -4.4, -7.6);
		Point3D p = Point3D.calculateCrossProduct(point1, point2);
		assertEquals(point3.x,p.x,0.009);
		assertEquals(point3.y,p.y,0.009);
		assertEquals(point3.z,p.z,0.009);
	}

	@Test
	public void testSubstract() {
		point1 = new Point3D(0,0,0);
		point2 = new Point3D(1, 3, 4);
		assertTrue(new Point3D(1,3,4).equals(point2.substract(point1)));
		point1 = new Point3D(2,5,1);
		point2 = new Point3D(-2,7,-9);
		point3 = point1.substract(point2);
		assertTrue(new Point3D(4,-2,10).equals(point3));
	}

	@Test
	public void testMinus() {
		point1 = new Point3D(6,1,2);
		point2 = new Point3D(3,6,2);
		point3 = new Point3D(3,-5,0);
		point1.minus(point2);
		assertTrue(point3.equals(point1));
	}

	@Test
	public void testSum() {
		point1 = new Point3D(4,8,4);
		point2 = new Point3D(2,8,1);
		point3 = point1.sum(point2);
		assertTrue(new Point3D(6,16,5).equals(point3));
		point1 = new Point3D(6,1,2);
		point2 = new Point3D(-6,-1,-2);
		point3 = point1.sum(point2);
		assertTrue(new Point3D(0,0,0).equals(point3));
	}

	@Test
	public void testMultiply() {
		point1 = new Point3D(1,5,4);
		point2 = point1.multiply(4.0);
		assertTrue(new Point3D(4,20,16).equals(point2));
		point1 = new Point3D(6,1,6);
		point2 = point1.multiply(0.0);
		assertTrue(new Point3D(0,0,0).equals(point2));
	}

	@Test
	public void testFoundXIntersectionPoint3DPoint3DDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoundXIntersectionDoubleDoubleDoubleDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoundZIntersection() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoundPX_PY_PZ_Intersection() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoundPX_PY_PZ_TEXTURE_Intersection() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoundPXIntersection() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoundPYIntersection() {
		fail("Not yet implemented");
	}

	@Test
	public void testFoundPZIntersection() {
		fail("Not yet implemented");
	}

	@Test
	public void testRotate() {
		point1 = new Point3D(3,3,3);
		point1.rotate(0.0, 0.0, Math.cos(Math.PI/4), Math.sin(Math.PI/4));
		point2 = new Point3D(0.0,Math.sqrt(Math.pow(3,2) + Math.pow(3, 2)),3);
		//assertEquals(point2,point1);
		assertEquals(point1.x,point2.x,0.000000000000009);	//acceptable delta
		assertEquals(point1.y,point2.y,0.000000000000009);	//is arbitrarily
		assertEquals(point1.z,point2.z,0.000000000000009);	//chosen(very accurate)
	}

	@Test
	public void testBuildTranslatedPoint() {
		point1 = new Point3D(6,1,2);
		point2 = point1.buildTranslatedPoint(0, 2.4, 3.9);
		assertTrue(new Point3D(6,3.4,5.9).equals(point2));
	}

	@Test
	public void testTranslate() {
		point1 = new Point3D(2,5,6);
		point1.translate(4, 8, -4);
		assertTrue(new Point3D(6,13,2).equals(point1));
	}

}
