package exercise1;

public class Triangle extends Shape {
	protected double a;
	protected double b;
	protected double c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public double getPerimeter() {
		return a + b + c;
	}

	@Override
	public double getArea() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public void printResult() {
		System.out.println("-----Triangle-----");
		System.out.println("Side A: " + a);
		System.out.println("Side B: " + b);
		System.out.println("Side C: " + c);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter: " + this.getPerimeter());

	}

}
