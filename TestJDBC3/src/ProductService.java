import java.util.List;
import java.util.Scanner;

public class ProductService {
	ProductDao dao = new ProductDao();
	Scanner sc = new Scanner(System.in);
	void menuDisplay()
	{
		System.out.println("1.목록보기");
		System.out.println("2.추가하기");
		System.out.println("3.수정하기");
		System.out.println("4.삭제하기");
	}
	void start()
	{
		while(true) {
			menuDisplay();
			System.out.print("선택 : ");
			int sel = sc.nextInt();
			switch(sel)
			{
			case 1: output(); break;
			case 0: return;
			}
		}
	}
	
	void output()
	{
		List<ProductDto> list = dao.selectProduct();
		for(ProductDto dto : list)
		{
			System.out.printf("%s\t", dto.getProduct_id());
			System.out.printf("%s\t", dto.getProduct_name());
			System.out.printf("%s\t", dto.getProduct_model());
			System.out.printf("%s\t", dto.getMaker());
			System.out.printf("%s\t", dto.getPrice());
		}
	}
}
