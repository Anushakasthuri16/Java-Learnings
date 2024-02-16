package producerConsumer;

public class FactoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f=new Factory();
		Producer p=new Producer(f);
		Consumer c=new Consumer(f);
		p.start();
		c.start();
		
		

	}

}
