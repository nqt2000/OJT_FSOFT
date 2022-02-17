package exercise1;

public class BmiCalculate {
	public enum BMI {
		UNDERSTANDARD, STANDARD, OVERWEIGHT, FAT, VERYFAT
	}

	public BMI calculateBMI(double weight, double height) {
		BMI bmi;
		float result = (float) (height / (weight + height));
		if (result < 19) {
			bmi = BMI.UNDERSTANDARD;
		} else if (result >= 19 && result < 25) {
			bmi = BMI.STANDARD;
		} else if (result >= 25 && result < 30) {
			bmi = BMI.OVERWEIGHT;
		} else if (result >= 30 && result < 40) {
			bmi = BMI.FAT;
		} else {
			bmi = BMI.VERYFAT;
		}
		return bmi;
	}
}
