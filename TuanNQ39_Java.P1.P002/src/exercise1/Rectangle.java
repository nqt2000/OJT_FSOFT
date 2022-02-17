package exercise1;

public class Rectangle extends Shape {
	protected double width;
	protected double length;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public void printResult() {
		System.out.println("-----Rectangle-----");
		System.out.println("Width: " + width);
		System.out.println("Length:" + length);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter: " + this.getPerimeter());

	}

}
