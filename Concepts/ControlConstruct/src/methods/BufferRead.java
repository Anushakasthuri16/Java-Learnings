package methods;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRead {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter age: ");
	
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int n = Integer.parseInt(br.readLine());
		System.out.println("Your age is "+n);
		System.out.println("Enter name ");
		String s = br.readLine();
		System.out.println("Your name is "+s);
		System.out.println("your percentage: ");
		float f=Float.parseFloat(br.readLine() );
		System.out.println("Your name is "+f);
		System.out.println("your height: ");
		double d=Double.parseDouble(br.readLine() );
		System.out.println("Your name is "+d);
		System.out.println("your marks: ");
		long l=Long.parseLong(br.readLine());
		System.out.println("Your name is "+l);
		System.out.println("Are you married: ");
		boolean b=Boolean.parseBoolean(br.readLine() );
		System.out.println(b+" is your marital status");



		

	}

}
