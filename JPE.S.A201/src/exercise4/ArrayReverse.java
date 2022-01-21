package exercise4;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
	static void reverse(Integer myArray[]) {
		Collections.reverse(Arrays.asList(myArray));
		System.out.println("Reversed Array: "+ Arrays.asList(myArray));
	}
	
	public static void main(String[] args) {
		Integer[] myArray = {43, 32, 53, 23, 12, 34, 3, 12, 43, 32};
		System.out.println("Original Array: "+ Arrays.asList(myArray));
		reverse(myArray);
	}

}
