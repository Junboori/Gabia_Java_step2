package chapter12.wrapper;

public class InterMain_01 {

	public static void main(String[] args) {

		// int:기본형 | Integer:참조형
		Integer i = new Integer(100); // int i=100;

		Integer num = 100; // 참조형 변수(오토박싱)

		int iNUm = num.intValue();// 언박싱: 클래스(참조형)-> 일반형

		int jNUm = 200;
		
		//언박싱(Integer -> int ) 다운캐스팅
		int sum=iNUm+jNUm;
		System.out.println(sum);
		int total=num.intValue()+jNUm;
		System.out.println(total);
		
		//오토박싱(int -> Integer ) 업캐스팅
		
		Integer x=jNUm;
		Integer y =Integer.valueOf(jNUm);
		System.out.println(x);
		System.out.println(y);
	
	}

}
