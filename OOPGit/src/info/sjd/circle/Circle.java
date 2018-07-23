package info.sjd.circle;

import info.sjd.AbstractShape;

public class Circle extends AbstractShape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return (int) (radius * radius * Math.PI);
	}
	public int getPerimeter() {
		return (int) (radius*Math.PI*Math.PI);
	}

}
