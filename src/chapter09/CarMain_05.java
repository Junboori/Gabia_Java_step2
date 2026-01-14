package chapter09;

public class CarMain_05 {

	public static void main(String[] args) {
		
//		method(new AICar());
//		System.out.println();
//		method(new ManualCar());
		
		System.out.println("---AI 자동차---");
		AICar mycar = new AICar();
		mycar.run();
		System.out.println("---사람이 운전하는 차---");
		ManualCar mycar1 =new ManualCar();
		mycar1.run();
		
		
		
	}

	public static void method(Car car) {
		car.run();

}
}
