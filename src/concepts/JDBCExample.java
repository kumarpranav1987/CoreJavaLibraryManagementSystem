package concepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/schooldatabase";
	static final String USER = "root";
	static final String PASS = "password";
	public static void main(String[] args) {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null;
		//PreparedStatement stmt = null;
		try {
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println("Id="+rs.getInt("id")+" Name="+rs.getString("name")+" Age="+rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
