package treningsdagbok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Driver {
	Statement myStmt;
	String password;
	String username;
	String URL;
	Connection myConn;
	
	public Driver() {
		password = "";
		username = "root";
		URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";

		
		
		try {
			//get a connection to database
			myConn = DriverManager.getConnection(URL, username, password);
			// create a statement 
			myStmt = myConn.createStatement();
			
			
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	}
	public void connect(){
		password = "";
		username = "root";
		URL = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";

		
		
		try {
			//get a connection to database
			myConn = DriverManager.getConnection(URL, username, password);
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
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM mal");
			//process the result set
			while (myRs.next()){
				System.out.println(myRs.getString("navn"));
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}
	
	public void leggTilOvelse(String navn, String beskrivelse){
		PreparedStatement test = null;
		
		try {
			String ovelsequery = String.format("INSERT INTO ovelse (ovelseid, navn, beskrivelse) VALUES (1, %s, %s)",navn,beskrivelse);
			test.executeQuery(ovelsequery);
		}
		catch(Exception exc) {
			exc.printStackTrace();
		
	}
	}
}
	
	
	
	