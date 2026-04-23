package Selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databasetesting {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		String URL="jdbc:mysql://127.0.0.1:3306/batch11to1march";
		String username="root";
		String password="password";
		String add="insert into softwaretesting(studid,studname,studper,DateofBirth) values (10,\"newdata\",75.87,2020);";
		 String update="update softwaretesting set studname=\"pooja\",studper=88.9 where studid=10;";
          String remove="delete  from softwaretesting where studid=10;";
//		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(URL, username, password);
		
		Statement stmt=con.createStatement();
		
//		int ins=stmt.executeUpdate(add);
//		int change=stmt.executeUpdate(update);
//		int dele=stmt.executeUpdate(remove);
		ResultSet rs=stmt.executeQuery("select * from softwaretesting where studname like 'a%';");
		
		while(rs.next())
		{
			int id=rs.getInt(1);
			String fname=rs.getString(2);
			double per=rs.getDouble(3);
			
			System.out.println(id+"||"+fname+"||"+per);
		}
	}
	
	
}
