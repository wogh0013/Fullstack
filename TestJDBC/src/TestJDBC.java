import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 create user 'user01'@'localhost' identified by '1234';
 grant all privileges on mydb.* to 'user01'@'localhost';
 -- 계정확인
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
 
 insert into board(title, writer, contents, wdate) values('제목1', '작성자1', '내용1', now());
 insert into board(title, writer, contents, wdate) values('제목2', '작성자2', '내용2', now());
 insert into board(title, writer, contents, wdate) values('제목3', '작성자3', '내용3', now());
 insert into board(title, writer, contents, wdate) values('제목4', '작성자4', '내용4', now());
 insert into board(title, writer, contents, wdate) values('제목5', '작성자5', '내용5', now());
 
 
 ---
 cmd창.
 mysql -u root -p --port=3306
 create user 'user02'@'localhost' identified by '1234';
 grant all privileges on classicmodels.* to 'user02'@'localhost';
 
 이클립스.
 프로젝트 새로 만들기 : TestJDBC2
 lib 폴더 만들고, mysql-connector-java-8.0.27.jar 파일을 lib 폴더 안에 넣어주기
 
 프로젝트 - 마우스 우클릭 - Properties - Java Build Path - Library - Modulepath - add jars - 위 파일 클릭 후 apply
 
 */


public class TestJDBC {
	   // mysql-connector-java-8.0.27.jar 이 파일안에
	   // com.mysql.cj.jdbc.Driver 클래스가 존재한다.
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	   //8.0 이상부터 allowPublicKeyRetrieval=true 필요함 
	   static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?allowPublicKeyRetrieval=true";
	   // localhost - DB의 IP, 3306 - 포트명, DB명
	   static final String USERNAME = "user01"; // 계정 생성
	   static final String PASSWORD = "1234"; 
	   
	   public static void main(String[] args) {
		//반드시 예외처리가 필요
		try {
			Class.forName(JDBC_DRIVER); //동적으로 클래스를 메모리로 로딩한다
			System.out.println("드라이브 로딩 성공");
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
			System.out.println("DB 연결 성공");
			
			stmt = conn.createStatement();
			String sql = "select * from board";
			rs = stmt.executeQuery(sql); // 데이터를 DB로부터 가져온다.
			while(rs.next()) { //rs.next - 다음에 읽어올 다른 데이터가 있으면 true, 데이터가 있는 동안 반복문 실행
				//컬럼이 1부터 존재한다
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








