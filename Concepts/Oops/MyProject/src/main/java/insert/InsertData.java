package insert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertData")
public class InsertData extends HttpServlet{
	private static final long serialVersionUID = 1L;

    public InsertData() {
        // TODO Auto-generated constructor stub
    	super();
    }

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("Name");
		String email=request.getParameter("Email");
		String phNo=request.getParameter("Number");
		String msg=request.getParameter("msg");
		
		System.out.println("Name "+name);
		System.out.println("Email "+email);
		System.out.println("Phone Number "+phNo);
		System.out.println("Message "+msg);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String url="jdbc:mysql://localhost:3306/myjdbc";  
			String username="root";
			String password="Anusha@16";
			String query="Insert into students (Name,Email,PhNo,Message) values (?,?,?,?)";
			Connection con=DriverManager.getConnection(url,username,password);
			
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, phNo);
			pst.setString(4, msg);
			
			//Execute Query
			int count=pst.executeUpdate();
			if(count==0)
			{
				pw.println("Record not Submitted");
	
			}
			else
			{
				pw.println("Record Submitted");
			}
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}

}
