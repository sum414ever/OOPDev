package info.sjd.trapezoid;

import info.sjd.AbstractShape;

public class Trapezoid extends AbstractShape {

	private int SideA;

	private int SideB;

	private int SideC;

	private int SideD;
	
	private int Height;

	public int getSideA() {
		return SideA;
	}

	public void setSideA(int sideA) {
		SideA = sideA;
	}

	public int getSideB() {
		return SideB;
	}

	public void setSideB(int sideB) {
		SideB = sideB;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getSideC() {
		return SideC;
	}

	public void setSideC(int sideC) {
		SideC = sideC;
	}

	public int getSideD() {
		return SideD;
	}

	public void setSideD(int sideD) {
		SideD = sideD;
	}

	@Override
	public int getArea() {
		return (int) ((SideA + SideB) * Height / 2);
	}

	@Override
	public int getPerimeter() {
		return (int) (SideA + SideB + SideC + SideD);
	}

}
