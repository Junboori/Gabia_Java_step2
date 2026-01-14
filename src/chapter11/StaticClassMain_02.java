package chapter11;

import javax.swing.JOptionPane;

//멤버변수
class Out2 {
	static int a = 1; // 정적변수로 모든 객체가 공류
	int b;

	public static class In {
		String Infun() {
			return a + " 번째 static 내부 클래스 ";
		}
	}

	public class StaticClassMain_02 {

		public static void main(String[] args) {
			Out2.In obj1 = new Out2.In();
			String str = obj1.Infun();
			JOptionPane.showMessageDialog(null, str + "\n Success");

		}

	}
}
