package treningsdagbok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
	Statement myStmt;
	
	public void connect() {
		String password = "";
		String username = "root";
		String URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
		
		
		
		try {
			//get a connection to database
			Connection myConn = DriverManager.getConnection(URL, username, password);
			// create a statement 
			myStmt = myConn.createStatement();
			
			
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	}
	
	public void seMal() {
		try {
			// execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from mal;");  
			//process the result set
			while (myRs.next()){
				System.out.println(myRs.getString("navn"));
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}