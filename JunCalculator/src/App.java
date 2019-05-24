
public class App {
	public static void main(String[] args) {
		System.out.println(addition(8, 15));
		System.out.println(subtraction(20, 19));
		System.out.println(multiplication(6, 6));
		System.out.println(division(15, 7));
	}

	public static int addition(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int subtraction(int num3, int num4) {
		int result = num3 - num4;
		return result;
	}

	public static int multiplication(int num5, int num6) {
		int result = num5 * num6;
		return result;
	}

	public static double division(double num7, double num8) {
		double result = num7 / num8;
		return result;
	}
}
