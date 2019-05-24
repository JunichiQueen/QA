import java.util.ArrayList;

public class Registry {
	private ArrayList<User> registry = new ArrayList<User>();

	public ArrayList<User> getRegistry() {
		return registry;
	}

	public void setRegistry(ArrayList<User> reg) {
		this.registry = reg;
	}

	public void registerPerson(User user, User user2, User user3) {
		registry.add(user);
		registry.add(user2);
		registry.add(user3);
	}

	public void deletePerson(User user) {
		registry.remove(user);
	}

	public void updatePerson(String inputName, String address) {
		registry = getRegistry();
		for (User u : registry) {
			if (u.getClass().getCanonicalName().equals(inputName)) {
				u.setAddress(address);
			}

		}

	}

}
