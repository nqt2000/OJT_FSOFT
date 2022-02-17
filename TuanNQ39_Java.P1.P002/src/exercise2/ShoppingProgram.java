package exercise2;

import java.time.Period;
import java.util.Scanner;

public class ShoppingProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== Shopping program ==========");
		System.out.printf("input number of bull:");
		int bill = sc.nextInt();
		int[] totalBill = new int[bill];
		for (int i = 0; i < bill; i++) {
			System.out.printf("input value of bill %s:", i + 1);
			int billInput = sc.nextInt();
			totalBill[i] = billInput;
		}

		System.out.printf("input value of wallet:");
		int walletInput = sc.nextInt();
		Person person = new Person();
		Person.Wallet wallet = person.new Wallet();
		wallet.setTotalMoney(walletInput);

		int total = person.calcTotal(totalBill);
		boolean status = person.payMoney(total);
		if (status) {
			System.out.println("this is total of bill:" + total);
			System.out.println("You can buy it.");
		} else {
			System.out.println("this is total of bill:" + total);
			System.out.println("You can't buy it.");
		}
	}

}
