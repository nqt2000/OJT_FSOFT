package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.type.ArrayType;

public class Calculator {
	public static void main(String[] args) {
		int choose;
		Scanner sc = new Scanner(System.in);
		System.out.println("========= Calculator Program =========");
		System.out.println("1.Normal Calculator\n2.BMI Calculator\n3.Exit");
		System.out.println("Please choice one option: ");
		choose = sc.nextInt();
		if (choose == 1) {
			int stop = 0;
			System.out.println("----- Normal Calculator -----");
			System.out.printf("Enter number: ");
			int num1 = sc.nextInt();
			while (stop == 0) {
				System.out.printf("Enter Operator: ");
				char operatorCheck = sc.next().charAt(0);
				Character[] operatorArray = new Character[] { '+', '-', '*', '/', '^', '=' };
				List<Character> charList = new ArrayList<>(Arrays.asList(operatorArray));
				while (!charList.contains(operatorCheck)) {
					System.out.println("Please input (+, -, *, /, ^)");
					System.out.printf("Enter Operator: ");
					operatorCheck = sc.next().charAt(0);
				}
				System.out.printf("Enter number: ");
				int num2 = sc.nextInt();

				Operator operator = new Operator(operatorCheck);
				NormalCalculate nc = new NormalCalculate();
				double result = nc.calculate(num1, operator, num2);
				num1 = (int) result;

				if (operatorCheck == '=') {
					System.out.println("Result: " + result);
					stop = 1;
				} else {
					System.out.println("Memory: " + result);
				}
			}
		}
		if (choose == 2) {
			System.out.println("----- BMI Calculator -----");
			System.out.printf("Enter Weight(kg): ");

			while (!sc.hasNextInt()) {
				System.out.println("Weight is digit");
				System.out.printf("Enter Weight(kg): ");
				sc.next();
			}
			int weight = sc.nextInt();
			System.out.printf("Enter Height(cm): ");
			while (!sc.hasNextInt()) {
				System.out.println("Height is digit");
				System.out.printf("Enter Height(cm): ");
				sc.next();
			}
			int height = sc.nextInt();

			BmiCalculate bmiStatus = new BmiCalculate();
			String status = String.valueOf(bmiStatus.calculateBMI(weight, height));
			float result = (float) (height / (weight * weight));

			System.out.println("BMI number: " + result);
			System.out.println("BMI status: " + status);
		}
	}
}
