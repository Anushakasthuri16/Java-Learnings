package encapsulation;

public class LaptopApp {

	public static void main(String[] args) {
		Laptop l1=new Laptop(8,"i5");
		System.out.println(l1.size()+" "+l1.processor());

		Laptop l2=new Laptop(16,"i7");
		System.out.println(l2.size()+" "+l2.processor());
		
		Laptop l3=new Laptop(8,"i7");
		System.out.printf("%d%3s",l3.size(),l3.processor());

	}

}
