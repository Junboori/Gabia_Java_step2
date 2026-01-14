package chapter08;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student("홍길홍", "11", 1000);
		System.out.println("이름:" + student.name);
		System.out.println("번호:" + student.ssn);
		System.out.println("숫자:" + student.studentNo);

	}

}
