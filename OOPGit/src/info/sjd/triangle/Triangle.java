package info.sjd.triangle;

import info.sjd.AbstractShape;

public class Triangle extends AbstractShape {

	private int Side;

	private int Height;

	private int Side2;

	private int Side3;

	public int getSide() {
		return Side;
	}

	public void setSide(int side) {
		Side = side;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getSide2() {
		return Side2;
	}

	public void setSide2(int side2) {
		Side2 = side2;
	}

	public int getSide3() {
		return Side3;
	}

	public void setSide3(int side3) {
		Side3 = side3;
	}

	@Override
	public int getArea() {

		return (int) ((Side * Height) / 2);
	}

	@Override
	public int getPerimeter() {
		return (int) (Side + Side2 + Side3);
	}

}
