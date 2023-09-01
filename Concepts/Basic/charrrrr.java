import java.util.Scanner;
 
public class charInput {
 
    public static void main(String [] args)
{
 
        Scanner sc = new Scanner(System.in);
 	System.out.println("give c value is: ");

        char c = sc.next().charAt(1);
                               
        System.out.println("c = "+c);
}
}
 