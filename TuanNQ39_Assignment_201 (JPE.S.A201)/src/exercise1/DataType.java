package exercise1;

public class DataType {

	public static void main(String[] args) {
		//a) (101 + 0)/3
		int result;
		result = (101 + 0)/3;
		System.out.println("((101 + 0) / 3)-> " + result);
		
		//b) 3.0e-6 * 10000000.1
		double x;
		x = 3.0e-6 * 10000000.1;
		System.out.println("(3.0e-6 * 10000000.1)-> " + x);
		
		String a = "true";
		String b = "false";
		//c)true && true
		if(a == a)
			System.out.println("(true && true)-> " +a);
		
		//d) false && true
		if(a == b)
			System.out.println("(false && true)->" +b);
		
		//e) (false && false) || (true && true)
		if(b == b)
			if(a == a)
				System.out.println("((false && false) || (true && true))-> "+a);
		
		//f) (false || false) && (true && true)
				System.out.println("((false || false) && (true && true))-> "+b);
		
	}

}
