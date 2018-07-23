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

		logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea() + " and has perimeter " + circle.getPerimeter());
		logger.info("Circle with radius " + circle2.getRadius() + " has area " + circle2.getArea() + " and has perimeter " + circle2.getPerimeter());
		

		Triangle triangle = new Triangle();
		triangle.setBase(15);
		triangle.setHeight(14);
		triangle.setBase2(16);
		triangle.setBase3(18);

		Triangle triangle2 = new Triangle();
		triangle2.setBase(7);
		triangle2.setHeight(8);
		triangle2.setBase2(9);
		triangle2.setBase3(10);

		logger.info("Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() + " has area "
				+ triangle.getArea());
		logger.info("Triangle with bases " + triangle.getBase() + " , " + triangle.getBase2() + " , " + triangle.getBase3() + " has perimeter "
				+ triangle.getPerimeter());

		logger.info("Triangle with base " + triangle2.getBase() + " and height " + triangle2.getHeight() + " has area "
				+ triangle2.getArea());
		logger.info("Triangle with bases " + triangle2.getBase() + " , " + triangle2.getBase2() + " , " + triangle2.getBase3() + " has perimeter "
				+ triangle2.getPerimeter());

		
		Trapezoid trapezoid = new Trapezoid();
		trapezoid.setBaseA(5);
		trapezoid.setBaseB(10);
		trapezoid.setBaseC(11);
		trapezoid.setBaseD(12);
		trapezoid.setHeight(20);
		
		logger.info("Trapezoid with base " + trapezoid.getBaseA() + " and " + trapezoid.getBaseB() + " and height "
				+ trapezoid.getHeight() + " has area " + trapezoid.getArea());
		logger.info("Trapezoid with bases " + trapezoid.getBaseA() + " , " + trapezoid.getBaseB() + " , " + trapezoid.getBaseC() + " , " + trapezoid.getBaseD() + " has perimeter " + trapezoid.getPerimeter());

		Trapezoid trapezoid2 = new Trapezoid();
		trapezoid2.setBaseA(77);
		trapezoid2.setBaseB(13);
		trapezoid2.setBaseC(17);
		trapezoid2.setBaseD(18);
		trapezoid2.setHeight(99);

		logger.info("Trapezoid with base " + trapezoid2.getBaseA() + " and " + trapezoid2.getBaseB() + " and height "
				+ trapezoid2.getHeight() + " has area " + trapezoid2.getArea());
		logger.info("Trapezoid with bases " + trapezoid2.getBaseA() + " , " + trapezoid2.getBaseB() + " , " + trapezoid2.getBaseC() + " , " + trapezoid2.getBaseD() + " has perimeter " + trapezoid2.getPerimeter());
	}
}