import java.util.ArrayList;

public class PersonManager {

	public ArrayList<Person> stringList = new ArrayList<Person>();

	public Person nameFinder(String inputperson) {
		return stringList.stream().filter(p -> p.getName().equals(inputperson)).findFirst().get();

	}
}