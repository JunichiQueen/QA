public class App {
	public static void main(String[] args) {
		Person jun = new Person("jun", 24, "software engineer");
		Person chris = new Person("chris", 28, "game developer");
		Person geoff = new Person("geoff", 26, "mechanic");
		System.out.println(jun.makeString("jun", 24, "software engineer"));

		PersonManager pm = new PersonManager();
		pm.stringList.add(jun);
		pm.stringList.add(chris);
		pm.stringList.add(geoff);

		System.out.println(pm.stringList.toString());

		pm.stringList.stream().forEach(i -> System.out.println(i));

		System.out.println(pm.nameFinder("jun"));

	}

}
