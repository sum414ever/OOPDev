package info.sjd;

import java.util.logging.Logger;

import info.sjd.circle.Circle;
import info.sjd.trapezoid.Trapezoid;
import info.sjd.triangle.Triangle;
// мантра для вызова импорта Логгера
public class AppRunner {
	//публичный класс который через метод мейн и будет запускать все
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	//Создаем статический логгер
	public static void main(String[] args) {
		//Метод в теле которого и прописнаы все действия
		Circle circle = new Circle();
		circle.setRadius(15);
		//Создание новых обьектов, в данном случае круга с указанием радиуса 15 и отправкой его
		Circle circle2 = new Circle();
		circle2.setRadius(20);

		logger.info("Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
		logger.info("Circle with radius " + circle2.getRadius() + " has area " + circle2.getArea());
		//Логгер выводит в консоль запись и результаты решения по прописанной формуле площади

		Triangle triangle = new Triangle();
		triangle.setBase(15);
		triangle.setHeight(14);

		Triangle triangle2 = new Triangle();
		triangle2.setBase(7);
		triangle2.setHeight(8);

		logger.info("Triangle with base " + triangle.getBase() + " and height " + triangle.getHeight() + " has area "
				+ triangle.getArea());

		logger.info("Triangle with base " + triangle2.getBase() + " and height " + triangle2.getHeight() + " has area "
				+ triangle2.getArea());
		Trapezoid trapezoid = new Trapezoid();
		
		logger.info("Trapezoid with base " + trapezoid.getBaseA() + " and " + trapezoid.getBaseB() + " and height "
				+ trapezoid.getHeight() + " has area " + trapezoid.getArea());

		Trapezoid trapezoid2 = new Trapezoid();
		trapezoid2.setBaseA(77);
		trapezoid2.setBaseB(13);
		trapezoid2.setHeight(99);

		logger.info("Trapezoid with base " + trapezoid2.getBaseA() + " and " + trapezoid2.getBaseB() + " and height "
				+ trapezoid2.getHeight() + " has area " + trapezoid2.getArea());
	}
}