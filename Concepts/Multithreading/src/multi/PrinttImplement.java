package multi;

public class PrinttImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumPrint np=new NumPrint();
		CharPrint cp=new CharPrint();
		Thread t1=new Thread(np);
		Thread t2=new Thread(cp);
		t1.start();
		t2.start();
	}

}
