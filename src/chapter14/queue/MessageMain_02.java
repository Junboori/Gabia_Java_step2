package chapter14.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain_02 {

	public static void main(String[] args) {

		Queue<Message> messageQueue = new LinkedList<Message>();

		Message lee = new Message("sendMail", "이호준");
		messageQueue.offer(lee);
		messageQueue.offer(new Message("sendSns", "김지영"));
		messageQueue.offer(new Message("sendKakaotalk", "김미주"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();// 출력 Queue -> 선입선출

			switch (message.command) {
			case "sendMail": {
				System.out.println(message.to + "님에게 메일을 보냈습니다.");
				break;

			}
			case "sendSns": {
				System.out.println(message.to + "님에게 sns을 보냈습니다.");
				break;

			}
			case "sendKakaotalk": {
				System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
				break;

			}

			}// switch

		} // while

	}// main
}// class
