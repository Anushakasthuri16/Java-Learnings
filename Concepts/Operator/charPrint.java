import java.util.Scanner;
class charprint
{
public static void main(String []args)
{

Scanner scan = new Scanner(System.in);
System.out.println("Enter char: ");
char ch=scan.next().charAt(0);
System.out.println(" Given char is: "+ch);
}
}
