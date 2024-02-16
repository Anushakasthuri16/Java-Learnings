package multi;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		
		t.setName("My Thread");
		t.setPriority(9);
		System.out.println(t);
		
		

	}

}
