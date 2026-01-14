package chapter09;

public class Warrior extends GameCharacter {

	@Override
	protected void attack() {
		System.out.println("전사가 검을 휘두릅니다.");

	}

	@Override
	protected void useUItimate() {
		System.out.println("전사가 분노의 광란 스킬을 사용합니다.");

	}

}
