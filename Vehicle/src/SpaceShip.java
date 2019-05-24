
public class SpaceShip extends Vehicle {
	private String maker;
	private int numberOfRooms;

	public String getMakerShip() {
		return maker;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public SpaceShip(String maker, int numberOfRooms, String colour, String fuelType) {
		super(colour, fuelType);
		this.maker = maker;
		this.numberOfRooms = numberOfRooms;
	}

}
