package exercise7;

import java.util.Scanner;

public class LogicalExcersice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		//Input
		System.out.print("Input first integer: ");
		x = sc.nextInt();
		System.out.print("Input second integer: ");
		y = sc.nextInt();
		
		//Compare
		if(x==y) {
			System.out.println(x + " = " + y);
		} else {
			System.out.println(x + " != " + y);
			if(x<y) {
				System.out.println(x + " < " + y);
				System.out.println(x + " <= " + y);
			} else {
				System.out.println(x + " > " + y);
				System.out.println(x + " >= " + y);
				
			}
		}

	}

}
