package chapter08;

public class StrawBerry extends Berry {

	private String color;
	private int price;

	// set
	public void Set3(String a, int b) {
		color = a;
		price = b;
	}

//get
	public void Disp3() {
		System.out.println("이름:" + color);
		System.out.println("크기:" + price);

	}

}
