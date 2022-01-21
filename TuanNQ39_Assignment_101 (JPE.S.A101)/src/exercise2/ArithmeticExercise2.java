package exercise2;

import java.util.Scanner;

public class ArithmeticExercise2 {

	public static void main(String[] args) {
		int a, b, result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		a = sc.nextInt();
		System.out.print("Input second number: ");
		b = sc.nextInt();
		
		//Addition
		result = a+b;
		System.out.println(a + " + " + b + " = " + result);
		
		//Subtract
		result = a-b;
		System.out.println(a + " - " + b + " = " + result);
		
		//Multiply
		result = a*b;
		System.out.println(a + " x " + b + " = " + result);
		
		//Divide
		result = a/b;
		System.out.println(a + " / " + b + " = " + result);
		
		//Remainder
		result = a%b;
		System.out.println(a + " % " + b + " = " + result);

	}

}
