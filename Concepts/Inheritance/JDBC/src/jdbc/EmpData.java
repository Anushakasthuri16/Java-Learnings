package jdbc;
import java.sql.*;
import java.util.Scanner;

public class EmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Press 1 for Insert");
		System.out.println("Press 2 for Update");
		System.out.println("Press 3 for Delete");
		System.out.println("Press 4 for Fetch");
		System.out.println("Enter Your Choice from above: ");
		int choice=scan.nextInt();
		
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="Anusha@16";
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Get Connected");
			
		
		
		while(true)
		{
			switch(choice)
			{
			case 1:
			
				insert(con);
				break;
			
			case 2:
			{
				update(con);
				break;
			}
			case 3:
			
				delete(con);
				break;
			
			case 4:
			
				fetchData(con);
				break;
			
			default:
			
				System.out.println("Your Choice is not presented");
			break;
			
		}
			break;
		} 
		}
		
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void insert(Connection con) throws SQLException
	{
		//for user input
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name=scan.next();
		System.out.println("Enter Student Email");
		String email=scan.next();
		System.out.println("Enter Student Phone Number");
		int phno=scan.nextInt();
		System.out.println("Enter Message");
		String msg=scan.next();
		
		//To insert
		String query="Insert into student values(?,?,?,?)";
		
		PreparedStatement pst= con.prepareStatement(query);
		
		pst.setString(1,name);
		pst.setString(2,email);
		pst.setInt(3,phno);
		pst.setString(4,msg);
		
		pst.execute();
		System.out.println("Rows are inserted");
		//to dispaly
		fetchData(con);
	}
	public static void update(Connection con) throws SQLException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name=scan.next();
		System.out.println("Enter Student Email");
		String email=scan.next();
		System.out.println("Enter Student Phone Number");
		int phno=scan.nextInt();
		System.out.println("Enter Message");
		String msg=scan.next();
		String query="Update student set name=? where phno=? ";
		PreparedStatement pst= con.prepareStatement(query);
		
		pst.setString(1,name);
		pst.setString(2,email);
		pst.setInt(3,phno);
		pst.setString(4,msg);
		
		pst.executeUpdate();
		System.out.println("Rows are updated");
		fetchData(con);
	}
	public static void delete(Connection con) throws SQLException
	{
		String query="delete from student where name=?";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name=scan.next();
		
		PreparedStatement pst= con.prepareStatement(query);
		
		pst.setString(1,name);
		pst.executeUpdate();
		System.out.println("Rows are deleted");
		fetchData(con);
	}
	public static void fetchData(Connection con) throws SQLException
	{
		String query="select * from student";
		
		PreparedStatement pst= con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
	}
	
}
