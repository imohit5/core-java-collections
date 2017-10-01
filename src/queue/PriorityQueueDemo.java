package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>();
		
		System.out.println(pq);
		System.out.println(pq.peek());
		//System.out.println(pq.element());
		
		System.out.println(pq.poll());
		//System.out.println(pq.remove());
		
		for (int i = 41; i <= 50; i++) {
			pq.offer(i);
		}
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.element());
		
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		
		System.out.println(pq);
		
	}

}
