package info.sjd.trapezoid;

import info.sjd.AbstractShape;

public class Trapezoid extends AbstractShape {
	
	private int BaseA;
	
	private int BaseB;

	private int Height;

	public int getBaseA() {
		return BaseA;
	}

	public void setBaseA(int baseA) {
		BaseA = baseA;
	}
	
	public int getBaseB() {
		return BaseB;
	}

	public void setBaseB(int baseB) {
		BaseB = baseB;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	@Override
	public int getArea() {
		return (int) ((BaseA + BaseB) * Height / 2);
	}
	
}
