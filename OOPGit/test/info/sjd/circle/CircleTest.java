package info.sjd.circle;

import static org.junit.Assert.*;

import org.junit.Test;

import info.sjd.circle.Circle;
import javafx.geometry.Side;

public class CircleTest {

	@Test
	public void testGetArea() {
		Circle circle = new Circle();
		circle.setRadius(10);

		assertNotNull(circle.getArea());

		assertTrue(circle.getArea() > 300 && circle.getArea() < 400);

		assertEquals(314, circle.getArea());

	}

	@Test
	public void testGetPerimeter() {
		Circle circle = new Circle();
		circle.setRadius(15);

		assertNotNull(circle.getPerimeter());

		assertTrue(circle.getPerimeter() > 140 && circle.getPerimeter() < 150);

		assertEquals(148, circle.getPerimeter());
	}

}
