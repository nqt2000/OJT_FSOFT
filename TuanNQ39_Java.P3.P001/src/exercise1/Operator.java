package exercise1;

public class Operator {
	private static char operator;

	public static char getOperator() {
		return operator;
	}

	public static void setOperator(char operator) {
		Operator.operator = operator;
	}

	public Operator(char operator) {
		this.operator = operator;
	}
}
