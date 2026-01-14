package chapter09;

public class PhoneMain_04 {

	public static void main(String[] args) {
		//추상클라스이므로 객체 생성 안됨
		//Phone phone=new Phone();
		
		SmartPhone smartPhone=new SmartPhone("김자바");
		
		System.out.println(SmartPhone.owner+"님");
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOff();

	}

}
