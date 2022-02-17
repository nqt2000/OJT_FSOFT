package exercise2;

import java.util.Scanner;

public class ManageEastAsisCountries {
	static String code;
	static String name;
	static float area;
	static String terrain;
	static Country[] contries = new Country[11];

	public static int menu() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.format("                        MENU\n");
		System.out.println("====================================================");
		System.out.println("1. Input the information of 11 countries in East Asia");
		System.out.println("2. Display the information of country you've just input");
		System.out.println("3. Search the information of country by user-entered name");
		System.out.println("4. Display the information of countries sorted name in ascending order");
		System.out.println("5. Exit");
		System.out.println("====================================================");
		int choose = sc.nextInt();

		return choose;
	}

	public void addCountryInformation(EastAsiaCountries country) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code of country : ");
		code = sc.next();
		System.out.println("Enter name of country : ");
		name = sc.next();
		System.out.println("Enter total Area : ");
		area = sc.nextFloat();
		System.out.println("Enter terrain of country : ");
		terrain = sc.next();

		country.setCountryCode(code);
		country.setCountryName(name);
		country.setTotalArea(area);
		country.setCountryTerrain(terrain);

		this.menu();
	}

	public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
		EastAsiaCountries ea = new EastAsiaCountries(code, name, area, terrain);
		ea.display();

		this.menu();
		return new EastAsiaCountries(code, name, area, terrain);
	}

	public EastAsiaCountries[] searchInformationByName(String name) throws Exception {
		EastAsiaCountries[] es = new EastAsiaCountries[11];
		return new EastAsiaCountries[] { es[1] };
	}

	public EastAsiaCountries[] sortInformationByAscendingOrder() throws Exception {
		EastAsiaCountries[] es = new EastAsiaCountries[11];
		return new EastAsiaCountries[] { es[1] };
	}
}
