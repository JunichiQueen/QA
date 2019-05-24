
public class App {
	public static void main(String[] args) {
		// oneToTen();
		// hundredToNine();
		oneToTenWords();
	}

	public static void oneToTen() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}

	public static void hundredToNine() {
		for (int i = 100; i < 1000; i++) {
			System.out.println(i);
		}
	}

	public static void oneToTenWords() {
		for (int number = 1; number < 11; number++)
			switch (number) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			case 10:
				System.out.println("ten");
				break;
			}
	}

}
