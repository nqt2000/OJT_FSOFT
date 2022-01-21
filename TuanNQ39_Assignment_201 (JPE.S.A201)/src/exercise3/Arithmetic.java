package exercise3;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		num1 = sc.nextInt();
		System.out.print("Input second number: ");
		num2 = sc.nextInt();
		System.out.print("Input third number: ");
		num3 = sc.nextInt();
		System.out.print("Input fourth number: ");
		num4 = sc.nextInt();
		System.out.print("Input fifth number: ");
		num5 = sc.nextInt();
		
		sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("The sum is "+ sum);
		
	}

}
