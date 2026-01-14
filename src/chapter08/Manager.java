package chapter08;

public class Manager extends Employee {

	String departemt;

//생성지
	public Manager(String name, int salary, String departemt) {
		super(name, salary);
		this.departemt = departemt;
	}

	@Override
	public void work() {
		System.out.println(name + "팀장이" + departemt + "부서를 관리하고 있습니다.");
	}

	public void approvelLeave(String employeeName) {
		System.out.println(name + "팀장이" + employeeName + "부서의 휴가를 승인했습니다.");

	}

}
