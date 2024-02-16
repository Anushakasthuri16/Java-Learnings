
package jdbc;
//Import java.sql package
import java.sql.*;

public class JDBCProgram {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myjdbc";  //database is sql ip adress localhost 3306 port number of mysql myjdbc is a database craeted by you in sql
		String username="root";
		String password="Anusha@16";
		//String query="create table student(name varchar(30), email varchar(100),phnNo int, message varchar(40))";
		String query="Insert into student values('Anusha','anu2gmail.com',98,'I love you')";
		
		try
		{
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded Succesfully");
		
		//Establish the connection
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Get Connected");
		
		//Create statement
		Statement stmt=con.createStatement();
		System.out.println("Statement created");
		
		//Execute query
		stmt.execute(query);
		System.out.println("Query Executed");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
