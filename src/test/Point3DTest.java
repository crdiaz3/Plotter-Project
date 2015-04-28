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
		point3 = point2.substract(point1);
		System.out.println("Point");
		System.out.println(point3.toString());
		assertTrue(new Point3D(1,3,4).equals(point3));
		point1 = new Point3D(2,5,1);
		point2 = new Point3D(-2,7,-9);
		point3 = point1.substract(point2);
		assertTrue(new Point3D(4,-2,10).equals(point3));
	}

	@Test
	public void testFoundXIntersectionPoint3DPoint3DDouble() {
		point1 = new Point3D(0,0,0);
		point2 = new Point3D(1,2,3);
		double y = 4.0;
		assertEquals(2.0,Point3D.foundXIntersection(point1, point2, y),0.0);
		
	}

}
