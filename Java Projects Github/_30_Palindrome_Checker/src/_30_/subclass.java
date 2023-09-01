package _30_;

public class subclass {
public boolean Palindrome(int n)
{
	int rev=0;
	while(n>0)
	{   
	{
		int rem=n%10;   //121
		rev=rem*10+rev;
		n=n/10;
		if (rev==n)
		{
		return true;
		}
	}
	
}
	return false;	

}
}
