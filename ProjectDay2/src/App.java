
public class App {
	public static void main(String[] args) {
		System.out.println(method1(10));
	}

	public static int method1(int input1) {
		int counter = 0;
		for (; counter < 10;) {
			if (input1 % 5 == 0) {
				counter += 1;
				break;
			}

		}
		return counter;
	}
}