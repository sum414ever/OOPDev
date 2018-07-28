package info.sjd;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

import info.sjd.circle.Circle;
import info.sjd.trapezoid.Trapezoid;
import info.sjd.triangle.Triangle;

public class AppRunnerCollections {

	private static Logger logger = Logger.getLogger(AppRunnerCollections.class.getName());

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(15);

		Triangle triangle = new Triangle();
		triangle.setSide(15);
		triangle.setHeight(14);
		triangle.setSide2(16);
		triangle.setSide3(18);

		Trapezoid trapezoid = new Trapezoid();
		trapezoid.setSideA(5);
		trapezoid.setSideB(10);
		trapezoid.setSideC(11);
		trapezoid.setSideD(12);
		trapezoid.setHeight(20);

		List<Shape> shapes = new ArrayList<>();
		shapes.add(circle);
		shapes.add(trapezoid);
		shapes.add(triangle);

		Shape maxShape = null;
		Shape minShape = null;

		if (!shapes.isEmpty()) {
			maxShape = shapes.get(0);
			minShape = shapes.get(0);

		}
		for (int i = 0; i < shapes.size(); i++) {
			if (maxShape.getArea() < shapes.get(i).getArea()) {
				maxShape = shapes.get(i);
			}

			if (minShape.getArea() > shapes.get(i).getArea()) {
				minShape = shapes.get(i);
			}

			
		}
		logger.log(Level.INFO,
				"Shape " + maxShape.getClass().getSimpleName() + " has maximal area " + maxShape.getArea());

		logger.log(Level.INFO,
				"Shape " + minShape.getClass().getSimpleName() + " has minimal area " + minShape.getArea());
	}
}
