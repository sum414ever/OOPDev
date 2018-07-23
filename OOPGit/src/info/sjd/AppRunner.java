package info.sjd;

import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.trapezoid.Trapezoid;
import info.sjd.triangle.Triangle;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setRadius(15);

		Circle circle2 = new Circle();
		circle2.setRadius(20);

		logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea() + " and has perimeter "
				+ circle.getPerimeter());
		logger.info("Circle with radius " + circle2.getRadius() + " has area " + circle2.getArea()
				+ " and has perimeter " + circle2.getPerimeter());

		Triangle triangle = new Triangle();
		triangle.setSide(15);
		triangle.setHeight(14);
		triangle.setSide2(16);
		triangle.setSide3(18);

		Triangle triangle2 = new Triangle();
		triangle2.setSide(7);
		triangle2.setHeight(8);
		triangle2.setSide2(9);
		triangle2.setSide3(10);

		logger.info("Triangle with side " + triangle.getSide() + " and height " + triangle.getHeight() + " has area "
				+ triangle.getArea());
		logger.info("Triangle with sides " + triangle.getSide() + " , " + triangle.getSide2() + " , "
				+ triangle.getSide3() + " has perimeter " + triangle.getPerimeter());

		logger.info("Triangle with side " + triangle2.getSide() + " and height " + triangle2.getHeight() + " has area "
				+ triangle2.getArea());
		logger.info("Triangle with sides " + triangle2.getSide() + " , " + triangle2.getSide2() + " , "
				+ triangle2.getSide3() + " has perimeter " + triangle2.getPerimeter());

		Trapezoid trapezoid = new Trapezoid();
		trapezoid.setSideA(5);
		trapezoid.setSideB(10);
		trapezoid.setSideC(11);
		trapezoid.setSideD(12);
		trapezoid.setHeight(20);

		logger.info("Trapezoid with side " + trapezoid.getSideA() + " and " + trapezoid.getSideB() + " and height "
				+ trapezoid.getHeight() + " has area " + trapezoid.getArea());
		logger.info("Trapezoid with sides " + trapezoid.getSideA() + " , " + trapezoid.getSideB() + " , "
				+ trapezoid.getSideC() + " , " + trapezoid.getSideD() + " has perimeter " + trapezoid.getPerimeter());

		Trapezoid trapezoid2 = new Trapezoid();
		trapezoid2.setSideA(77);
		trapezoid2.setSideB(13);
		trapezoid2.setSideC(17);
		trapezoid2.setSideD(18);
		trapezoid2.setHeight(99);

		logger.info("Trapezoid with side " + trapezoid2.getSideA() + " and " + trapezoid2.getSideB() + " and height "
				+ trapezoid2.getHeight() + " has area " + trapezoid2.getArea());
		logger.info("Trapezoid with sides " + trapezoid2.getSideA() + " , " + trapezoid2.getSideB() + " , "
				+ trapezoid2.getSideC() + " , " + trapezoid2.getSideD() + " has perimeter " + trapezoid2.getPerimeter());
	}
}