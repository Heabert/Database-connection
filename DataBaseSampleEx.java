package DataBaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseSampleEx {
	public static void main(String [] args) {
	 
		
		try {
			//Register database driver class with my driver manager, by writing this method, 
			//next step is to establish connection with database
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-UKQC1IN;databaseName=HR;integratedSecurity=true");
			
			//create statement of object
			Statement stmt=con.createStatement();
			
			System.out.println("created database connection");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
