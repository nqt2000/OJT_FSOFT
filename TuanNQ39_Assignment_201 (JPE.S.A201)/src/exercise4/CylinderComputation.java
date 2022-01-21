package exercise4;

import java.util.Scanner;

public class CylinderComputation {

	public static void main(String[] args) {
		double r, h, sa, ba, v;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input radius: ");
		r = sc.nextDouble();
		System.out.print("Input height: ");
		h = sc.nextDouble();
		double pi = Math.PI;
		
		//Surface Area
		sa = 2 * pi * r * r + 2 * pi * r * h;
		System.out.println("Surface Area = "+ sa);
		
		//Base Area
		ba = pi * r * r;
		System.out.println("Base Area = "+ ba);
		
		//Volume
		v = pi * r * r * h;
		System.out.println("Volume = "+ v);

	}

}
