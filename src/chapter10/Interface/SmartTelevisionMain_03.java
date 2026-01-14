package chapter10.Interface;

public class SmartTelevisionMain_03 {

	public static void main(String[] args) {

		System.out.println("스마트 텔레비전");
		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.search("www.naver.com");
		tv.setVolume(10);
		tv.turnOff();
		
		System.out.println("-----");

		Remote re = new SmartTelevision();
		re.turnOn();
		re.setVolume(10);
		re.turnOff();
		System.out.println("-----");
		
		Remote rc=tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		System.out.println("------");
		
		
//		Searchable se=new SmartTelevision();
		Searchable se=tv;
		se.search("www.google.com");
			
		

	}

}
