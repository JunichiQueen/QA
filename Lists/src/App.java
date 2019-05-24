import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		// System.out.println(numberChecker(11));
		// System.out.println(stringChecker("Hello"));
		// System.out.println(divFiveTimesTen());
		System.out.println(checkStringCount(createStringList(), "Hello"));
		System.out.println(sumIntList(createList()));
	}

	public static ArrayList<Integer> createList() {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			intList.add(i);
		}
		return intList;
	}

	public static boolean numberChecker(int num) {
		ArrayList<Integer> intList = createList();
		return intList.contains(num);

	}

	public static ArrayList<String> createStringList() {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Hello");
		stringList.add("World");
		stringList.add("Hi");
		stringList.add("Hello");
		return stringList;
	}

	public static boolean stringChecker(String stringinput) {
		ArrayList<String> stringList = createStringList();
		return stringList.contains(stringinput);
	}

	public static ArrayList<Integer> divFiveTimesTen() {
		ArrayList<Integer> intList = createList();
		int counter = 0;
		if (intList.get(counter) % 5 == 0) {
			intList.set(counter, intList.get(counter) * 10);
			counter += 1;
		}
		return intList;
	}

	public static long checkStringCount(ArrayList<String> listname, String input) {
		return listname.stream().filter(i -> i == input).count();

	}

	public static int sumIntList(ArrayList<Integer> listname) {
		int sum = 0;
		for (int i = 0; i < listname.size(); i++) {
			sum += listname.get(i);
		}
		return sum;
	}

	// public static int largestValue(ArrayList<Integer> listname) {
	// listname.
}
