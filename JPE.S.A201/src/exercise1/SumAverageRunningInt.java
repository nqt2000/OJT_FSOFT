package exercise1;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		for (int number = lowerbound; number <= upperbound; number++) {
			sum += number;
		}
		
		average = sum/upperbound;
		System.out.println("Average of all 100 first numbers: "+average);

	}

}
