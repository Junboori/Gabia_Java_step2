package chapter13;

public class GenericContainerMain04 {

	public static void main(String[] args) {
		// 문자열 아이템을 저장하는 객체(StringContainer)

		GenericContainer<String> stringContainer = new GenericContainer<String>(5);
		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		stringContainer.printItems();

		// 타입제한으로 사용 불가능
//		String[] stringArray = { "1", "2", "3", "4", "5" };
//		System.out.println("Sum of int array:"+stringContainer.sum(stringArray));

		GenericContainer<Integer> integerContainer = new GenericContainer<Integer>(5);
		integerContainer.printItems();
		integerContainer.addItem(10);
		integerContainer.addItem(20);
		integerContainer.addItem(30);
		integerContainer.printItems();

		// 실수 아이템을 저장하는 객체
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array:" + integerContainer.sum(intArray));

		GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);
		doubleContainer.printItems();
		doubleContainer.addItem(10.1);
		doubleContainer.addItem(20.1);
		doubleContainer.addItem(30.1);
		doubleContainer.printItems();

		// 실수 아이템을 저장하는 객체
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		System.out.println("Double of int array:" + doubleContainer.sum(doubleArray));

	}

}
