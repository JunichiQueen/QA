
public class App {
	public static void main(String[] args) {
		Car chiron = new Car("Bugatti", 4, "Blue", "Diesel");
		Boat flyingScotsman = new Boat("PirateInc", 300, "Black", "Coal");
		SpaceShip ebonHawke = new SpaceShip("KotorIndustries", 7, "Purple", "Plasma");

		Garage garage = new Garage();

		// garage.getList().add(chiron);
		// garage.getList().add(flyingScotsman);
		// garage.getList().add(ebonHawke);

		// garage.calculateBill(garage.getList());

		garage.getList();
		garage.addVehicle(garage.getList(), chiron);
		System.out.println(garage.getList());

		garage.removeVehicle("Blue");

		System.out.println(garage.getList());

		System.out.println(garage.emptyGarage());

	}
}
