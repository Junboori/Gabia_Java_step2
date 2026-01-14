package chapter10.Interface;

public class MyClassMain_04 {

	public static void main(String[] args) {

//X타입
		X x = new MyClass();
		x.x();
		// Y클래스
		Y y = new MyClass();
		y.y();
		// MyInterFace
		MyInterface mi = new MyClass();
		mi.x();
		mi.y();
		mi.myMethod();

	}

}
