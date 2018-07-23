package info.sjd.trapezoid;

import info.sjd.AbstractShape;

public class Trapezoid extends AbstractShape {

	private int BaseA;

	private int BaseB;

	private int Height;

	private int BaseC;

	private int BaseD;

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

	public int getBaseC() {
		return BaseC;
	}

	public void setBaseC(int baseC) {
		BaseC = baseC;
	}

	public int getBaseD() {
		return BaseD;
	}

	public void setBaseD(int baseD) {
		BaseD = baseD;
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

	@Override
	public int getPerimeter() {
		return (int) (BaseA + BaseB + BaseC + BaseD);
	}

}
