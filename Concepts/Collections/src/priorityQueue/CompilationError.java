package priorityQueue;

import java.util.PriorityQueue;

public class CompilationError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		pq1.add(20);
		pq1.add(40);
		//pq1.add("Java");
		//pq1.add('A');          
		//pq1.add(60.4);           Errors
		//pq1.add(true);
		System.out.println(pq1);
		
		PriorityQueue<String> pq2=new PriorityQueue<String>();
		//pq2.add(20);
		//pq2.add(40);
		pq2.add("Java");
		//pq2.add('A');        Error  
		//pq2.add(60.4);
		//pq2.add(true);
		System.out.println(pq2);

	}

}
