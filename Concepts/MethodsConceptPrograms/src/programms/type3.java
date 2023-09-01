package programms;

public class type3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		int y=20;
		
		int res=add(x,y);
		System.out.println(res);
		int res1=sub(x,y);
		System.out.println(res1);
		int res2=mul(x,y);
		System.out.println(res2);
		int res3=div(x,y);
		System.out.println(res3);
		int res4=mod(x,y);
		System.out.println(res4);
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int mod(int a, int b)
	{
		return a%b;

	}






	}

