package chapter11;

class OutterRun {

	// 익명의 클래스 runnerable
	Runnable getRunnerable(int i) {
		int num = 100;

		return new Runnable() {

			@Override
			public void run() {
//				num=200;
//				i=10;
				System.out.println(i);
				System.out.println(num);

			}// run
		};

	}// Runnerable

}// OutterRun

public class AnonymousInnerMain_05 {

	public static void main(String[] args) {

		OutterRun out = new OutterRun();
		Runnable runnable = out.getRunnerable(10);
		runnable.run();

	}

}
