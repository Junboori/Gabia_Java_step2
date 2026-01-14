package chapter09;

public class Wizard extends GameCharacter {

	@Override
	protected void attack() {
		System.out.println("마법사가 파이어볼을 사용합니다");
	}

	@Override
	protected void useUItimate() {
		System.out.println("마법사가 메토오 스톰을 시전합니다");

	}

}
