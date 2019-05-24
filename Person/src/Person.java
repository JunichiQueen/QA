public class Person {
	public String name;
	public int age;
	public String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String makeString(String name, int age, String jobTitle) {
		return name + (age + "") + jobTitle;
	}

	@Override
	public String toString() {
		return name + " " + age + " " + jobTitle;
	}

	public String getName() {
		return name;
	}

	public int getage() {
		return age;
	}

	public String getjobTitle() {
		return jobTitle;
	}

}
