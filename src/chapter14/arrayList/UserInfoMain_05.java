package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfoMain_05 {

	public static void main(String[] args) {
		// UserInfo타입의 ArrayList -> arr
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();

		outer: while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디 생성(exit입력시 종료): ");
			String id = scan.next();

			UserInfo ui = new UserInfo();
			ui.setId(id);
			// --------------------------------------------
			// exit 입력시
			if (ui.getId().equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}

			// 아이디 중복 입력시 메세지 출력후 무시후(continue outer) 다시 입력시도
			for (int i = 0; i < arr.size(); i++) {
				if (ui.getId().equals(arr.get(i).getId())) {
					System.out.println("아이디가 중복되었습니다. 다른 아이디를 입력하세요!");
					continue outer;
				}
			}
			// ---------------------------------------------
			System.out.print("패스워드 입력: ");
			ui.setPwd(scan.next());

			arr.add(ui);

			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println();
			}
			System.out.println("--------------------");

		} // while

	}
}