import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//db�� �����͸� �а� ���� ���� ����Ѵ� 
public class ProductDao {

	public ProductDao() {
		super();
		//����̺� ��� �ҷ�����
		try {
			Class.forName(DBUtil.JDBC_DRIVER);
			System.out.println("����̺� �ε� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public List<ProductDto> selectProduct()
	{
		Connection conn=null;  //db����
		Statement stmt = null; //��������
		ResultSet rs=null; //����� ��� �ִ� 
		List<ProductDto> list = new ArrayList<ProductDto>();
		
		try {
			conn = DriverManager.getConnection(DBUtil.DB_URL, DBUtil.USERNAME, DBUtil.PASSWORD);
			stmt = conn.createStatement();
			String sql = "select * from product";		
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				ProductDto dto = new ProductDto();
				dto.setProduct_id(rs.getString("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setProduct_model(rs.getString("product_model"));
				dto.setMaker(rs.getString("maker"));
				dto.setPrice(rs.getString("price"));
				
				list.add( dto );	
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
				try {
					if (rs!=null) rs.close();
					if (stmt!=null) stmt.close();
					if (conn!=null) conn.close();
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
		
		return list;
	}
	
	
	public void insertProduct(ProductDto dto)
	{
		Connection conn=null;  //db����
		Statement stmt = null; //��������
		
		try {
			conn = DriverManager.getConnection(DBUtil.DB_URL, DBUtil.USERNAME, DBUtil.PASSWORD);
			stmt = conn.createStatement();
			String sql =  "insert into product( product_id, product_name, product_model, maker, price) ";
			sql = sql + "values(";
			sql = sql + " '" + dto.getProduct_id()+"' ";
			sql = sql + " ,'" + dto.getProduct_name()+"' ";
			sql = sql + " ,'" + dto.getProduct_model()+"' ";
			sql = sql + " ,'" + dto.getMaker()+"' ";
			sql = sql + " ,'" + dto.getPrice()+"') ";
			
			System.out.println(sql);
			
			stmt.execute(sql);  //insert, update, delete
			
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
				try {
					if (stmt!=null) stmt.close();
					if (conn!=null) conn.close();
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		}
	}
}
