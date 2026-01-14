package chapter08;

public class DriverMain_10 {

	public static void main(String[] args) {

		Driver driver = new Driver();
		// Vehicle vehicleBus = new Bus();
		// driver.drive(vehicleBus);
		driver.drive(new Bus());

		driver.drive(new Taxi());

//		Taxi taxi=new Taxi();
//		taxi.run();

	}

}
