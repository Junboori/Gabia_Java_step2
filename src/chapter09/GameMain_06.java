package chapter09;

public class GameMain_06 {

	public static void main(String[] args) {

	/*
		System.out.println("===전사전투===");
		System.out.println("[입장] 캐릭터가 전장에 등장");
		Warrior fight = new Warrior();
		fight.attack();
		fight.useUItimate();
		System.out.println("[퇴장] 캐릭터가 전장을 떠남");
		System.out.println("===마법사전투===");
		System.out.println("[입장] 캐릭터가 전장에 등장");
		Wizard fight1 = new Wizard();
		fight1.attack();
		fight1.useUItimate();
		System.out.println("[퇴장] 캐릭터가 전장을 떠남");
		*/
		
		System.out.println("====전사 전투====");
		GameCharacter warrir = new Warrior();
		warrir.fight();
		System.out.println("\n====마법사 전투====");
		GameCharacter wizard = new Wizard();
		wizard.fight();

	}

}
