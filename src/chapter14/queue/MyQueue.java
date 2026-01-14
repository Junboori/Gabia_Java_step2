package chapter14.queue;

import java.util.ArrayList;

public class MyQueue {
	ArrayList<String> queue=new ArrayList<String>();

	public void enQueue(String a) {
		queue.add(a);
		
	}

	public String deQueue() {
		int len=queue.size();
		
		if(len==0) {
			System.out.println("큐가 비어 있습니다.");
			return null;
		}
		return(queue.remove(0));
	}//deQueue

	@Override
	public String toString() {
		return queue.toString();
		
	}
	

}
