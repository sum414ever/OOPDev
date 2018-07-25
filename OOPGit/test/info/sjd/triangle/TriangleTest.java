package info.triangle;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import info.sjd.triangle.Triangle;

public class TriangleTest {

	@Test
	public void testGetArea() {
		Triangle triangle = new Triangle();
		triangle.setSide(15);
		triangle.setHeight(14);

		assertNotNull(triangle.getArea());

		assertTrue(triangle.getArea() > 100 && triangle.getArea() < 110);

		assertEquals(105, triangle.getArea());

	}

	@Test
	public void testGetPerimeter() {
		Triangle triangle = new Triangle();
		triangle.setSide(15);
		triangle.setSide2(16);
		triangle.setSide3(18);
		triangle.setHeight(14);

		assertNotNull(triangle.getPerimeter());

		assertTrue(triangle.getPerimeter() > 48 && triangle.getPerimeter() < 50);

		assertEquals(49, triangle.getPerimeter());

	}

}
