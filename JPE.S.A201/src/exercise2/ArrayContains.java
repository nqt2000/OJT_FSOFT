package exercise2;

import java.util.Arrays;

public class ArrayContains {
	public static void main(String[] args) {
		String[] stringArray = new String[] {"FPT", "Fresher", "Academy", "2018"};
		String sValue="Fresher";
		
		if(Arrays.asList(stringArray).contains(sValue))
			System.out.println("Check 'Fresher' ub Array: Contained!");
		else
			System.out.println("No Contain");
	}
}
