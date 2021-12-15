import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 create user 'user01'@'localhost' identified by '1234';
 grant all privileges on mydb.* to 'user01'@'localhost';
 -- ����Ȯ��
 mysql -u root -p --port=3306
 1234
 
 use mysql;
 select host, user from user;
 
 drop table board;
 create table board(
 	id int primary key not null auto_increment,
 	title varchar(10),
 	writer varchar(10),
 	contents varchar(10),
 	wdate date
 );
 
 insert into board(title, writer, contents, wdate) values('����1', '�ۼ���1', '����1', now());
 insert into board(title, writer, contents, wdate) values('����2', '�ۼ���2', '����2', now());
 insert into board(title, writer, contents, wdate) values('����3', '�ۼ���3', '����3', now());
 insert into board(title, writer, contents, wdate) values('����4', '�ۼ���4', '����4', now());
 insert into board(title, writer, contents, wdate) values('����5', '�ۼ���5', '����5', now());
 
 
 ---
 cmdâ.
 mysql -u root -p --port=3306
 create user 'user02'@'localhost' identified by '1234';
 grant all privileges on classicmodels.* to 'user02'@'localhost';
 
 ��Ŭ����.
 ������Ʈ ���� ����� : TestJDBC2
 lib ���� �����, mysql-connector-java-8.0.27.jar ������ lib ���� �ȿ� �־��ֱ�
 
 ������Ʈ - ���콺 ��Ŭ�� - Properties - Java Build Path - Library - Modulepath - add jars - �� ���� Ŭ�� �� apply
 
 */


public class TestJDBC {
	   // mysql-connector-java-8.0.27.jar �� ���Ͼȿ�
	   // com.mysql.cj.jdbc.Driver Ŭ������ �����Ѵ�.
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	   //8.0 �̻���� allowPublicKeyRetrieval=true �ʿ��� 
	   static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?allowPublicKeyRetrieval=true";
	   // localhost - DB�� IP, 3306 - ��Ʈ��, DB��
	   static final String USERNAME = "user01"; // ���� ����
	   static final String PASSWORD = "1234"; 
	   
	   public static void main(String[] args) {
		//�ݵ�� ����ó���� �ʿ�
		try {
			Class.forName(JDBC_DRIVER); //�������� Ŭ������ �޸𸮷� �ε��Ѵ�
			System.out.println("����̺� �ε� ����");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		//java.sql. ***
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("DB ���� ����");
			
			stmt = conn.createStatement();
			String sql = "select * from board";
			rs = stmt.executeQuery(sql); // �����͸� DB�κ��� �����´�.
			while(rs.next()) { //rs.next - ������ �о�� �ٸ� �����Ͱ� ������ true, �����Ͱ� �ִ� ���� �ݺ��� ����
				//�÷��� 1���� �����Ѵ�
				System.out.printf("%s %s %s\n",  rs.getString(1), rs.getString(2), rs.getString(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}








