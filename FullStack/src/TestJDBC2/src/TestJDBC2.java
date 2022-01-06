import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {
	public static void main(String[] args) {
		
		try {
			Class.forName(DBUtil.JDBC_DRIVER);
			System.out.println("드라이브 로딩 성공");
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
		
		Connection conn = null;	// DB 연결
		Statement stmt = null;	// 쿼리 실행
		ResultSet rs = null;	// 결과를 담고 있다.
		
		try {
			conn = DriverManager.getConnection(DBUtil.DB_URL, DBUtil.USERNAME, DBUtil.PASSWORD);
			stmt = conn.createStatement();
			String sql = "select * from customers";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.printf("%s\t",  rs.getString("customerNumber"));
				System.out.printf("%s\t",  rs.getString("contactLastName"));
				System.out.printf("%s\t",  rs.getString("contactFirstName"));
				System.out.printf("%s\t",  rs.getString("phone"));
				System.out.printf("%s\t",  rs.getString("addressLine1"));
				System.out.printf("%s\t",  rs.getString("addressLine2"));
				System.out.printf("%s\t",  rs.getString("city"));
				System.out.printf("%s\t",  rs.getString("state"));
				System.out.printf("%s\t",  rs.getString("postalCode"));
				System.out.printf("%s\t",  rs.getString("country"));
				System.out.printf("%s\t",  rs.getString("salesRepEmployeeNumber"));
				System.out.printf("%s\n",  rs.getString("creditLimit"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs!=null) rs.close();
				if (stmt!=null) stmt.close();
				if (conn!=null) conn.close();	
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

