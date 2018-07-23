package info.sjd.triangle;

import info.sjd.AbstractShape;

public class Triangle extends AbstractShape {

	private int Base;

	private int Height;

	private int Base2;

	private int Base3;

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

	public int getBase2() {
		return Base2;
	}

	public void setBase2(int base2) {
		Base2 = base2;
	}

	public int getBase3() {
		return Base3;
	}

	public void setBase3(int base3) {
		Base3 = base3;
	}

	@Override
	public int getArea() {

		return (int) ((Base * Height) / 2);
	}

	@Override
	public int getPerimeter() {
		return (int) (Base + Base2 + Base3);
	}

}
