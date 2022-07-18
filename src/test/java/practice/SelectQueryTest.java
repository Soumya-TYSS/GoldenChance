package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {

	public static void main(String[] args) throws Throwable {
		Driver driverRef=new Driver();
		//Register to the Database
		DriverManager.registerDriver(driverRef);
		//connect to the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		System.out.println("connection is done");
		System.out.println("added by chandan");
		System.out.println("This statment is added by sanjay");
		System.out.println("Another statment added by sanjay.");
		//create query statemnet
		Statement stat = conn.createStatement();
		//execute the query
		try {
		ResultSet result = stat.executeQuery("select * from students_info");
		while(result.next())
		{
			System.out.println(result.getInt(1) + "\t" + result.getString(2));

		}
		}
		catch(Exception e)
		{
			
			
		}
		finally
		{
		conn.close();
	}
	}

}
