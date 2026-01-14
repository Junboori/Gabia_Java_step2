package chapter10.Multiinterface;

import java.util.Scanner;

public class SchedulerMain_01 {

	public static void main(String[] args) {

/*		Scanner scan = new Scanner(System.in);
		while (true) {
			while (true) {
				System.out.println();
				System.out.println("R or r : 한명씩 차례로 할당");
				System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
				System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
				System.out.println("S or s : 종료");
				System.out.print("전화 상담 방식을 선택하세요 : ");

				// toUpperCase(): 대소문자 구분하지 않음
				// 방법1(char)
				char input = scan.next().toUpperCase().charAt(0);
				int ch = (int) input;
				

				switch (input) {

				case 'R':
					scheduler = new RoundRobin();
					break;

				case 'L':
					scheduler = new LeastJob();
					break;

				case 'P':
					scheduler = new PriorityAllocation();

				case 'S':
					System.out.println("프로그램을 종료합니다.");
					scan.close();
					return;

				default:
					System.out.println("지원하지 않는 서비스 입니다.");

				}

				scheduler.getNextCall();
				scheduler.sendCallToAgent();
			}
		}
	}
}
*/
		
		
		Scheduler priorityAllocation = new PriorityAllocation();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");

			char input = scan.next().toUpperCase().charAt(0);
			int ch = (int) input;

			if (ch == 'R'||ch =='r') {
				System.out.println("한명씩 차례로 할당");
			} else if (ch == 'L') {
				System.out.println("쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			} else if (ch == 'P') {
				priorityAllocation.sendCallToAgent();
			} else if (ch == 'S') {
				break;
			} else {
				System.out.println("지원하지 않는 서비스 입니다.");
			}

		}
		System.out.println("종료");
	}
}
