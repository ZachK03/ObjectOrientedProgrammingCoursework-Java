package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/Test";
		String uname = "root";
		String pword = "Smfst.012";
		String query = "SELECT * from DatabaseConnectModule";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url,uname,pword);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				String out = "";
				for(int i = 1; i <= 2; i++) {
					out += result.getString(i) + " : ";
				}
				System.out.println(out);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
