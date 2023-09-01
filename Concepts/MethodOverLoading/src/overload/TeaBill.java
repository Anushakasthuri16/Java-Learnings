package overload;

public class TeaBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teaBill();
		teaBill(10);
		teaBill("Ginger");
		teaBill("green",5);
		

	}
	public static void teaBill()
	{
		System.out.println("Bill of single normal tea is 10Rs");
	}
	public static void teaBill(int n)
	{
		System.out.println("Bill of " +n+ " normal teas is "+n);
	}
	public static void teaBill(String type)
	{
		System.out.println("Bill of " +type+ " normal tea is 15Rs");
	}
	public static void teaBill(String type,int n)
	{
		System.out.println("Bill of " +n+ " " +type+ " teas is "+(n*15));
	
	}

}
