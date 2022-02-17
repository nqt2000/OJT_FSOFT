package exercise1;

public class NormalCalculate {
	public double calculate(double a, Operator operator, double b) throws ArithmeticException {
		switch (operator.getOperator()) {
		case '+':
			a = a + b;
			break;
		case '-':
			a = a - b;
			break;
		case '*':
			a = a * b;
			break;
		case '/':
			if (b == 0) {
				throw new ArithmeticException("Cannot Divide By 0");
			}
			a = a / b;
			break;
		case '^':
			a = Math.pow(a, b);
			break;
		}
		return a;
	}
}
