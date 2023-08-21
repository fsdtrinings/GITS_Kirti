package p1;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQueueDemo {

	public static void main(String[] args) {
		
		
		Queue<Integer> q = new PriorityQueue<>(5);
		
		q.add(101);
		q.add(102);
		q.add(103);
		q.add(104);
		q.add(105);
		
		System.out.println(q);
		
		q.remove();
		q.add(106);
		System.out.println(q);
		
		
		
	}
}
