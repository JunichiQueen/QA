
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World");
		greeting2("Helloworld");
		System.out.println(greeting());
	}

	public static String greeting() {
		return "Hello World";
	}

	public static String greeting2(String hellothere) {
		System.out.println(hellothere);
		return hellothere;

	}

}