package _21_WrapperClass;


import java.util.Scanner;

public class Main {
	public static void main(String[] args)

	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(" enter a character");
		char ch=scanner.next().charAt(0);
		 scanner.close();
        identifyCharacter(ch);
        
	}

	public static void identifyCharacter(char ch)

	{

	// your code here
		if(Character.isDigit(ch))
		{
			System.out.println("the entered character"+ch+" is Digit");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("Entered Character "+ch+" is soecial Character");
		}
		else
			switch(Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
				{
					System.out.println(" entered Character is "+ch+" is Lower case vowel");
				}
				else
				{
					System.out.println(" entered Character is "+ch+" is Uppercase vowel");
				}
				break;
            default:
            {
            	if(Character.isLowerCase(ch))
            	{
            		System.out.println(" entered Character is "+ch+" is LowerCase Consonant");
            	}
            	else
            	{
            		System.out.println(" entered Character is "+ch+" is Uppercase Consonant");
            	}
            }
          
	}
	}
}
        
	


