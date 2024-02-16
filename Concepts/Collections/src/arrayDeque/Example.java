package arrayDeque;

import java.util.ArrayDeque;


public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque pq=new ArrayDeque();
		pq.add(20);
		pq.add(40);
		pq.add("Java");
		pq.add('A');
		pq.add(60.4);
		pq.add(true);
		System.out.println(pq);
	}
}
