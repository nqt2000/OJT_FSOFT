package exercise1;

public class Circle extends Shape {
	protected double radius;
	double pi = Math.PI;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * pi * radius;
	}

	@Override
	public double getArea() {
		return pi * radius * radius;
	}

	@Override
	public void printResult() {
		System.out.println("-----Circle-----");
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter: " + this.getPerimeter());
	}

}
