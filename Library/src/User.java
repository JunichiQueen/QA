
public class User implements CheckInable, CheckOutable {
	private String ID;
	private String name;
	private String address;

	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(String ID, String name, String adress) {
		this.ID = ID;
		this.name = name;
		this.address = address;
	}

	public void CheckInItem() {

	}

	public void CheckOutable() {

	}

}
