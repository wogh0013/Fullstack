
public class DBUtil {
	   // mysql-connector-java-8.0.27.jar �� ���Ͼȿ�
	   // com.mysql.cj.jdbc.Driver Ŭ������ �����Ѵ�.
	   public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	   //8.0 �̻���� allowPublicKeyRetrieval=true �ʿ��� 
	   static final String DB_URL = "jdbc:mysql://localhost:3306/classicmodels?allowPublicKeyRetrieval=true";
	   // localhost - DB�� IP, 3306 - ��Ʈ��, DB��
	   static final String USERNAME = "user02"; // ���� ����
	   static final String PASSWORD = "1234"; 
}
