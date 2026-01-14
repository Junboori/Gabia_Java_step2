package chapter08;

public class DmbCellPhoneMain_07 {

	public static void main(String[] args) {

		// 11, Java폰 ,블랙
		DmbCellPhone dmbCellPhone = new DmbCellPhone(11, "Java폰", "검정");

		// 상속받은 필드
		System.out.println("모델:" + dmbCellPhone.model);
		System.out.println("색상:" + dmbCellPhone.color);

		// 자식클래스 필드
	
		System.out.println("채널:" + dmbCellPhone.channel);
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();

		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("여보세요");
		dmbCellPhone.hangUp();
		System.out.println("-----------");

	}

}
