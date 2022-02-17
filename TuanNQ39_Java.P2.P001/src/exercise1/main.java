package exercise1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String phone;
		String email;
		String date;
		Validate validate = new Validate();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Phone number: ");
			phone = sc.next();
			if (!validate.checkPhone(phone).equals(phone)) {
				System.out.println(validate.checkPhone(phone));
			}
		} while (!validate.checkPhone(phone).equals(phone));

		do {
			System.out.printf("Email: ");
			email = sc.next();
			if (!validate.checkEmail(email).equals(email)) {
				System.out.println(validate.checkEmail(email));
			}
		} while (!validate.checkEmail(email).equals(email));

		do {
			System.out.printf("date: ");
			date = sc.next();
			if (!validate.checkDate(date).equals(date)) {
				System.out.println(validate.checkDate(date));
			}
		} while (!validate.checkDate(date).equals(date));
	}
}
