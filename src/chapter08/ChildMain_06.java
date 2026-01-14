package chapter08;

public class ChildMain_06 {

	public static void main(String[] args) {
		Child child = new Child();

		child.method1();// 부모꺼
		child.method2();// 내꺼
		child.method3();// 자식꺼
		System.out.println();
		
		Parent parent1=child;
		parent1.method1();//부모꺼
		parent1.method2();//자식꺼
		System.out.println();
		
		
		Parent parent2= new Parent();
		parent1.method1();//부모꺼
		parent1.method2();//부모꺼
		
	}

}
