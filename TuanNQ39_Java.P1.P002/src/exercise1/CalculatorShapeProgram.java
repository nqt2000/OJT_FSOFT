package exercise1;

import java.util.Scanner;

public class CalculatorShapeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====Calculator Shape Programmer=====");
		System.out.println("Please input side width of Rectangle : ");
		double width = sc.nextDouble();
		System.out.println("Please input length of Rectangle : ");
		double length = sc.nextDouble();
		System.out.println("Please input radius of Circle : ");
		double radius = sc.nextDouble();
		System.out.println("Please input side A of Triangle : ");
		double a = sc.nextDouble();
		System.out.println("Please input side B of Triangle : ");
		double b = sc.nextDouble();
		System.out.println("Please input side C of Triangle : ");
		double c = sc.nextDouble();

		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(width);
		rectangle.setLength(length);
		rectangle.printResult();

		Circle circle = new Circle();
		circle.setRadius(radius);
		circle.printResult();

		Triangle triangle = new Triangle();
		triangle.setA(a);
		triangle.setB(b);
		triangle.setC(c);
		triangle.printResult();

	}

}
