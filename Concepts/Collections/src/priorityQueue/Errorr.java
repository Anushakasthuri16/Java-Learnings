package priorityQueue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Errorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.add(20);
		pq.add(40);
		pq.add("Java");
		pq.add('A');          //ClassCastException -bcz we can store homogenous data in priority queue , Priority queue is an comparision
		pq.add(60.4);
		pq.add(true);
		System.out.println(pq);

	}

}
