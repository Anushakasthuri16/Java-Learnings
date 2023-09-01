package programms;

public class type2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		int y=20;
		
		add(x,y);
		sub(x,y);
		mul(x,y);
		div(x,y);
		mod(x,y);
	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void mod(int a, int b)
	{
		System.out.println(a%b);
	}

}
