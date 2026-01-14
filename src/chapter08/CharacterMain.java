package chapter08;

import java.util.Scanner;

public class CharacterMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("기본 공격력을 입력하세요: ");
		int power = scan.nextInt();

		Character[] characters = { new Warrior(), new Mage() };
for(Character c: characters) {
//		for (int i = 0; i < characters.length; i++) {
//			System.out.println(characters[i].getClass().getSimpleName() + " : " + characters[i].attack(power));
		}

	}
}
