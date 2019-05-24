
public class App {

	public static void main(String[] args) {

		stringChecker("I am a Java pro");

		stringChecker2("I suck at Java", "Im pretty good at Java");
	}

	public static void stringChecker(String string1) {
		String stringGod = "I am a Java pro";
		if (string1.equals(stringGod)) {
			System.out.println(string1);
		}

	}

	public static void stringChecker2(String string2, String string3) {
		if (string2.equals(string3)) {
			System.out.println("They are the same");
		} else {
			System.out.println("They are NOT the same");
		}
	}

}
