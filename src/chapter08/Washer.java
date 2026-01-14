package chapter08;

public class Washer extends Appliance {
	
	public Washer(String brand) {
		super(brand);
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
		
		System.out.println("세탁기 전원을 켭니다");
	}
	
	

}
