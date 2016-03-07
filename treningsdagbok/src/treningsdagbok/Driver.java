package treningsdagbok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {

		String password = "";
		String username = "root";
		String URL = "jdbc:mysql://localhost:3306/mydb";
		
		try {
			//get a connection to database
			Connection myConn = DriverManager.getConnection(URL, username, password);
			// create a statement 
			Statement myStmt = myConn.createStatement();
			// execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from kondis;");  
			//process the result set
			while (myRs.next()){
				System.out.println(myRs.getString("belastning"));
			}
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	}

}