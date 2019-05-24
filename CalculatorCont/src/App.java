
public class App {
	public static void main(String[] args) {
		System.out.println(calculatorMax(3, "*", 7));
	}

	public static double calculatorMax(double num1, String Ope, double num2) {
		if (Ope.equals("+")) {
			double num3 = num1 + num2;
			return num3;
		}
		if (Ope.equals("-")) {
			double num3 = num1 - num2;
			return num3;
		}
		if (Ope.equals("*")) {
			double num3 = num1 * num2;
			return num3;
		}
		if (Ope.equals("/")) {
			double num3 = num1 / num2;
			return num3;
		} else {
			return 0;
		}
	}
}