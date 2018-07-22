package info.sjd.triangle;

import info.sjd.AbstractShape;

public class Triangle extends AbstractShape {

	private int Base;

	private int Height;

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	@Override
	public int getArea() {

		return (int) ((Base * Height) / 2);
	}

}
