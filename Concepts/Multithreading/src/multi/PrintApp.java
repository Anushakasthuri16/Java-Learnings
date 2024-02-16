package multi;

public class PrintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p1=new Print();
	
		Thread t1=new Thread(p1);
		Thread t2=new Thread(p1);
		t1.setName("Number");
		t2.setName("char");
		t1.start();
		t2.start();
		
		

	}

}

