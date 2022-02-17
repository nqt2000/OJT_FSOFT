package exercise2;
import java.util.ArrayList;
import java.util.*;

public class ManagerCountry {
	public static void main(String[] args) {
		ManageEastAsisCountries ms = new ManageEastAsisCountries();
		EastAsiaCountries ea = new EastAsiaCountries();
		int choose = ms.menu();
		switch (choose) {
		case 1:
			ms.addCountryInformation(ea);
			break;
		case 2:
			ms.getRecentlyEnteredInformation();
			break;
		}
	}
}
