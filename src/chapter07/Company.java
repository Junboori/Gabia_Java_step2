package chapter07;

public class Company {
	
	private static Company instance = new Company();
	
	public Company() {
		
		
	}
	
	public static Company getInstance() {
		
		//예외처리 -> 생성된 객체가 없으면 객체 생성
		if(instance ==null) {
			instance = new Company();
		}
		return instance;
	}
	

}
