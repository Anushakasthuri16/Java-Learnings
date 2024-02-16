package jdbc;
import java.sql.*;
import java.util.Scanner;

public class BankProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="Anusha@16";
		int updateId = 0;
		int deleteId = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc");
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			
			PreparedStatement pst=null;
			acc(con,pst);
			update(con,pst,updateId);
			if(updateId==deleteId)
			{
				
			}
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void acc(Connection con,PreparedStatement pst) throws SQLException
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	
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
	public static void update(Connection con,PreparedStatement pst,int updateId) throws SQLException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student id");
		int id=scan.nextInt();
		System.out.println("Enter Student Name");
		String name=scan.next();
		System.out.println("Enter Student account");
		int amount=scan.nextInt();
		String query="Update student set name=? where phno=? ";
		pst= con.prepareStatement(query);
		updateId=id;
		pst.setInt(1,id);
	
	
		pst.executeUpdate();
		System.out.println("Rows are updated");
		
	}
	public static void delete(Connection con,PreparedStatement pst,int deleteId) throws SQLException
	{
		String query="delete from student where id=?";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student id");
		int id=scan.nextInt();
		pst= con.prepareStatement(query);
		
		pst.setInt(1,id);
		deleteId=id;
		pst.executeUpdate();
		System.out.println("Rows are deleted");
	
	}

}
