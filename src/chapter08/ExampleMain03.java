package chapter08;

import java.util.Scanner;

public class ExampleMain03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("기본 공격력을 입력하세요: ");
		int power = scan.nextInt();

		// 메서드 활용

		System.out.println("전사의 스킬:" + useSkill(new Warrior(), power));
		System.out.println("마법사의 스킬:" + useSkill(new Mage(), power));
	}

	// -------------------
	// 메서드(다향성 핵심)
	public static int useSkill(Character c, int dmg) {
		return c.attack(dmg);

	}// useSkill
}
