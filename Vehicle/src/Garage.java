import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> garageList = new ArrayList<Vehicle>();

	public void calculateBill(ArrayList<Vehicle> garageList) {
		int bill = 0;
		for (Vehicle v : garageList) {
			// System.out.println(i.getClass().getCanonicalName());
			if (v.getClass().getCanonicalName().equals("Car")) {
				System.out.println("CAR BILL");
				bill = ((Car) v).getNumberOfWheels() * 50;
				if (((Car) v).getMakerCar().equals("Bugatti")) {
					bill = bill * 10;
				}
				if (v.getColour().equals("Blue")) {
					bill = bill + 150;
				}
				if (v.getFuelType().equals("Diesel")) {
					bill = bill + 300;
				}
				System.out.println(bill);
			}
			if (v.getClass().getCanonicalName().equals("Boat")) {
				System.out.println("BOAT BILL");
				bill = ((Boat) v).getMaxCrew() * 250;
				if (((Boat) v).getMakerBoat().equals("Flying Scotsman")) {
					bill = bill * 10;
				}
				if (v.getColour().equals("Black")) {
					bill = bill + 100;
				}
				if (v.getFuelType().equals("Coal")) {
					bill = bill - 200;
				}
				System.out.println(bill);
			}

			if (v.getClass().getCanonicalName().equals("SpaceShip")) {
				System.out.println("SPACESHIP BILL");
				bill = ((SpaceShip) v).getNumberOfRooms() * 25;
				if (((SpaceShip) v).getMakerShip().equals("KotorIndustries")) {
					bill = bill * 10;
				}
				if (v.getColour().equals("Purple")) {
					bill = bill + 1000000;
				}
				if (v.getFuelType().equals("Plasma")) {
					bill = bill * 50;
				}
				System.out.println(bill);
			}

		}
	}

	public ArrayList<Vehicle> addVehicle(ArrayList<Vehicle> garageList, Vehicle vehicle1) {
		garageList.add(vehicle1);
		setList(garageList);
		return garageList;
	}

	public ArrayList<Vehicle> removeVehicle(String colour) {

		ArrayList<Vehicle> removeList = new ArrayList<>();

		for (Vehicle v : garageList) {
			if (v.getColour().equals(colour)) {
				removeList.add(v);

			}
		}

		garageList.removeAll(removeList);

		// for (int i = garageList.size(); i > 0; i--) {
		// if (garageList.get(i).getColour().equals(colour)) {
		// garageList.remove(i);

		// }

		// }

		return garageList;
	}

	/*
	 * public void fixVehicle(int index) { int bill = 0;
	 * 
	 * for (Garage g : Garage.garageList) { if
	 * (g.getClass().getCanonicalName().equals("Car")) { bill = ((Car)
	 * g).getNumberOfWheels() * 2; if (((Car) g).getColour().equals("Blue")) { bill
	 * = bill + 100; } if (((Car) g).getFuelType().equals("Diesel")) { bill = bill +
	 * 150; } if (((Car) g).getMakerCar().equals("Bugatti")) { bill = bill + 110000;
	 * }
	 * 
	 * 
	 * System.out.println(bill);
	 * 
	 * if (g.getClass().getCanonicalName().equals("Boat")) { bill = ((Boat)
	 * g).getMaxCrew() * 3;
	 * 
	 * if (((Boat) g).getColour().equals("Black")) { bill = bill + 250; } if
	 * (((Boat) g).getFuelType().equals("Coal")) { bill = bill + 1; } if (((Boat)
	 * g).getMakerBoat().equals("PirateInc")) { bill = bill + 9999999; }
	 * 
	 * System.out.println(bill);
	 * 
	 * if (g.getClass().getCanonicalName().equals("SpaceShip")) { bill =
	 * ((SpaceShip) g).getNumberOfRooms() * 8; if (((SpaceShip)
	 * g).getColour().equals("Purple")) { bill = bill + 900; } if (((SpaceShip)
	 * g).getFuelType().equals("Plasma")) { bill = bill + 150; } if (((SpaceShip)
	 * g).getMakerShip().equals("KotorIndustries")) { bill = bill + 9999999; }
	 * System.out.println(bill); } } }
	 */

	public ArrayList<Vehicle> emptyGarage() {
		for (Vehicle v : garageList) {
			garageList.remove(v);
		}
		return garageList;
	}

	public ArrayList<Vehicle> getList() {
		return garageList;
	}

	public ArrayList<Vehicle> setList(ArrayList<Vehicle> garageList) {
		return this.garageList = garageList;
	}

}