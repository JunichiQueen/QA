
public class Car extends Vehicle {
	private String maker;
	private int numberOfWheels;

	public String getMakerCar() {
		return maker;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public Car(String maker, int numberOfWheels, String colour, String fuelType) {
		super(colour, fuelType);
		this.maker = maker;
		this.numberOfWheels = numberOfWheels;

	}

}
