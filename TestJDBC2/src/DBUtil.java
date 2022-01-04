
public class DBUtil {
	   // mysql-connector-java-8.0.27.jar 이 파일안에
	   // com.mysql.cj.jdbc.Driver 클래스가 존재한다.
	   public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	   //8.0 이상부터 allowPublicKeyRetrieval=true 필요함 
	   static final String DB_URL = "jdbc:mysql://localhost:3306/classicmodels?allowPublicKeyRetrieval=true";
	   // localhost - DB의 IP, 3306 - 포트명, DB명
	   static final String USERNAME = "user02"; // 계정 생성
	   static final String PASSWORD = "1234"; 
}
