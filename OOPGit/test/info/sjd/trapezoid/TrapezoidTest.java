package info.sjd.trapezoid;

import static org.junit.Assert.*;

import org.junit.Test;

import info.sjd.trapezoid.Trapezoid;

public class TrapezoidTest {

	@Test
	public void testGetArea() {
		Trapezoid trapezoid = new Trapezoid();
		trapezoid.setHeight(20);
		trapezoid.setSideA(5);
		trapezoid.setSideB(10);

		assertNotNull(trapezoid.getArea());

		assertTrue(trapezoid.getArea() > 145 && trapezoid.getArea() < 155);

		assertEquals(150, trapezoid.getArea());

	}

	@Test
	public void testGetPerimeter() {
		Trapezoid trapezoid = new Trapezoid();
		trapezoid.setHeight(20);
		trapezoid.setSideA(5);
		trapezoid.setSideB(10);
		trapezoid.setSideC(11);
		trapezoid.setSideD(12);

		assertNotNull(trapezoid.getPerimeter());

		assertTrue(trapezoid.getPerimeter() > 35 && trapezoid.getPerimeter() < 40);

		assertEquals(38, trapezoid.getPerimeter());
	}
}
