
public class Boat extends Vehicle {
	private String maker;
	private int maxCrew;

	public void jettisonCargo() {

	}

	public String getMakerBoat() {
		return maker;
	}

	public int getMaxCrew() {
		return maxCrew;
	}

	public Boat(String maker, int maxCrew, String colour, String fuelType) {
		super(colour, fuelType);
		this.maker = maker;
		this.maxCrew = maxCrew;
	}

}
