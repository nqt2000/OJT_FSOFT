package exercise5;

import java.util.Scanner;

public class CircleExercise {

	public static void main(String[] args) {
		double x, y, r;
		double pi = Math.PI;
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius = ");
		r = sc.nextDouble();
		
		//Perimeter
		x = r * 2 * pi;
		System.out.println("Perimeter is = "+ x);
		
		//Area
		y = r * r * pi;
		System.out.println("Area is = "+ y);

	}

}
