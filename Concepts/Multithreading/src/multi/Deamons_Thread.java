package multi;

public class Deamons_Thread {

	public static void main(String[] args) {
		Typing t=new Typing();
		Compilation c=new Compilation();
		Saving s=new Saving();
		t.start();
		c.start();
		s.start();

	}

}
