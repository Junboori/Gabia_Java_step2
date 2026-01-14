package chapter08;

import java.util.Scanner;

public class calculatorsMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수 A를 입력하세요:");
		int a = scan.nextInt();
		System.out.print(" 정수 B를 입력하세요:");
		int b = scan.nextInt();

		Example[] calculators = { new CalPlus(), new CalMinus() };

//        Example plus = new CalPlus();
//        Example minus = new CalMinus();

//        System.out.println("Calplus:"+plus.getResult(a, b));
//        System.out.println("CalMinus:"+minus.getResult(a, b));

		System.out.print("n1: ");
		a = scan.nextInt();

		System.out.print("n2: ");
		b = scan.nextInt();

		for (int i = 0; i < calculators.length; i++) {
			System.out.println(calculators[i].getClass().getSimpleName() + ": " + calculators[i].getResult(a, b));
		}
		System.out.println();

		// 방법2:메서드 활용

		int plus = calc(new CalPlus(), a, b);
		System.out.println("두 수의 합:" + plus);

		int minus = calc(new CalMinus(), a, b);
		System.out.println("두 수의 차:" + minus);

		System.out.println();
		System.out.println("두 수의 합:" + calc(new CalPlus(), a, b));
		System.out.println("두 수의 차:" + calc(new CalMinus(), a, b));

	}

	public static int calc(Example exam, int n1, int n2) {
		return exam.getResult(n1, n2);
	}

}
