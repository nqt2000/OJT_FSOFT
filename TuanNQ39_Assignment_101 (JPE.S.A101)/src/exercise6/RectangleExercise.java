package exercise6;

import java.util.Scanner;

public class RectangleExercise {

	public static void main(String[] args) {
		double w, h, A, P;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Width = ");
		w = sc.nextDouble();
		System.out.print("Height = ");
		h = sc.nextDouble();
		
		//Area
		A = w * h;
		System.out.println("Area is "+ w +" * "+ h + " = " + A);
		
		//Perimeter
		P = (w + h) * 2;
		System.out.println("Perimeter is 2 * ("+ w +" + " + h +") = "+ P);

	}

}
