package jdbc;
import java.net.MulticastSocket;
import java.sql.*;
import java.util.Scanner;

public class UserInputRows {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number of rows to be inserted: ");
	int n=scan.nextInt();
	String url="jdbc:mysql://localhost:3306/myjdbc";
	String username="root";
	String password="Anusha@16";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		PreparedStatement pst=null;
		
		for(int i=1;i<=n;i++)
		{
			String query="Insert into person values(?,?,?)";
			pst=con.prepareStatement(query); 
			System.out.println("Enter the id of person "+i+" : ");
			int id=scan.nextInt();
			System.out.println("Enter Name of person "+i+" : ");
			String name=scan.next();
			System.out.println("Enter Age of person "+i+" : ");
			int age=scan.nextInt();
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, age);
			pst.addBatch();
			
		}
			pst.execute();
		System.out.println("Rows are Inserted");
		} 
	catch (Exception e) 
		{
			e.printStackTrace();
		}

}
	
	
}