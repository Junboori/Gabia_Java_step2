package chapter08;

import chapter07.Company;

public class CompanyMain_09 {

	public static void main(String[] args) {
		// Employee 객체 생성

		Employee employee = new Employee("김철수", 1000);
		employee.work();
		employee.getInfo();
		System.out.println("--------------");
		// Manger 객체 생성후 메서드 사용

		Manager manager = new Manager("박철수", 500,  "개발");
		System.out.println();
		manager.work();
		manager.getInfo();
		manager.approvelLeave("신철수");
		// 상속개념이 보이게 객체 생성후 메서드 사용(Employee 와 Manager 교집합 기능만 
		
		Employee employee2=new Manager("최팀장",2000, "개발");
		employee2.work();
		employee2.getInfo();
//		employee2.approvelLeave();  //컴파일 에러(객체의 주체 Employee 타입으로 간주 Manager 고유 기능으로 안됨)

	}

}
