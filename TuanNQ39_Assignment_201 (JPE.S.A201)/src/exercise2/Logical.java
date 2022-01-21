package exercise2;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		int num1, num2, num3, num4;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		num1 = sc.nextInt();
		System.out.print("Input second number: ");
		num2 = sc.nextInt();
		System.out.print("Input third number: ");
		num3 = sc.nextInt();
		System.out.print("Input fourth number: ");
		num4 = sc.nextInt();
		
		if(num1 == num2 && num2 == num3 && num3 == num4)
			System.out.println("Number are equal!");
		else
			System.out.println("Number are not equal!");

	}

}
