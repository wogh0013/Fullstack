
public class DBUtil {
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	//8.0 이상부터 allowPublicKeyRetrieval=true 필요함 
	public static final String DB_URL = "jdbc:mysql://localhost:3306/myproject?allowPublicKeyRetrieval=true";
	// localhost - db아이피,  3306 포트번호  디비명 
	public static final String USERNAME = "root";  //계정만들기 
	public static final String PASSWORD = "1234"; 
}
