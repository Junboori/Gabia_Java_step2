package chapter08;

public class ApplianceMain_05 {

	public static void main(String[] args) {

		Appliance tv = new TV("Samsung");
		tv.turnOn();
		System.out.println("-----------");
		Appliance washer = new Washer("LG");
		washer.turnOn();
		System.out.println("-----------");
		Appliance[] list = new Appliance[3];
		list[0] = new Washer("LG");
		list[1] = new TV("SamSung");
		list[2] = new Washer("DaeWoo");

		for (Appliance a : list) {

			a.turnOff();

		}

	}
}
