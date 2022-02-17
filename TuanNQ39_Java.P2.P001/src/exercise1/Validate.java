package exercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {
	public String checkPhone(String phone) {
		boolean check;
		try {
			Integer.parseInt(phone);
		} catch (NumberFormatException e) {
			return "Phone number must is number";
		}
		check = phone.matches("[0-9]{10}");
		if(check == false) {
			return "Phone number must be 10 digits";
		}
		return phone;
	}
	
	public String checkEmail(String email) {
		boolean check;
		check = email.matches("^[_A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@"
								+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		if(check == false) {
			return "Email must is correct format";
		}
		return email;
	}
	
	public String checkDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		{
			try {
				sdf.parse(date);
			} catch (ParseException e) {
				return "Date to correct format (dd/mm/yyyy)";
			}
			return date;
		}
	}
}