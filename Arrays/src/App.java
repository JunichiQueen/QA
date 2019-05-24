
public class App {
	public static void main(String[] args) {
		int[] array2 = new int[900];

	}

	public static int[] addNumbersToArray() {
		int[] array1 = new int[100];
		int counter = 1;
		for (int i : array1) {
			i += counter;
			counter += 1;
			System.out.println(i);
		}
		return array1;
	}

	public static int[] addMoreNumbersToArray(int[] inputArray) {
		int counter = 100;
		for (int i : inputArray) {
			i += counter;
			counter += 1;
			System.out.println(i);
		}
		return inputArray;
	}

	public static int[] timesArrayTen(int inputArray[]) {
		int counter = 100;
		for (int i : inputArray) {
			i = i * 10;
			System.out.println(i);
			counter++;
		}
		return inputArray;
	}

}