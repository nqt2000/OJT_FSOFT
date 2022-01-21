package exercise3;

import java.util.Scanner;

public class FrequentNumber {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		int len;
		int value = 5;
		int count = 0;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter size of array: ");
			len = sc.nextInt();
		} while (len <= 0 || len > 5);
		
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < len; i++) {
			System.out.print("array["+ i + "] = ");
			intArray[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < len; i++) {
			if(intArray[i] == value) {
				count++;
				index = i;
			}
		}
		System.out.println("Amount of frequence: "+ count);
		System.out.println("Index: "+ index);	
	}

}
