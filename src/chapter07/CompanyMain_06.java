package chapter07;

public class CompanyMain_06 {

	public static void main(String[] args) {
		// heap
		
		Company compnay1 =new Company();
		Company compnay2 =new Company();

		
		System.out.println(compnay1);
		System.out.println(compnay2);
		
		System.out.println("-----singleton-----");
		
		//MetaSpace 영역에서 객체가 생성 됨
		Company mycompnay1 =Company.getInstance();
		Company mycompnay2 =Company.getInstance();
		
		System.out.println(mycompnay1);
		System.out.println(mycompnay2);
		System.out.println(mycompnay1 == mycompnay2);
		
	}

}
