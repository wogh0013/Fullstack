import java.util.List;
import java.util.Scanner;

public class ProductService {
	ProductDao dao = new ProductDao();
	Scanner sc = new Scanner(System.in);
	void menuDisplay()
	{
		System.out.println("1.��Ϻ���");
		System.out.println("2.�߰��ϱ�");
		System.out.println("3.�����ϱ�");
		System.out.println("4.�����ϱ�");
	}
	void start()
	{
		while(true) {
			menuDisplay();
			System.out.print("���� : ");
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
	
	void append()
	{
		ProductDto dto = new ProductDto();
		System.out.print("�ڵ� : ");
		dto.setProduct_id(sc.next());
		System.out.print("��ǰ�� : ");
		dto.setProduct_name(sc.next());
		System.out.print("��ǰ�� : ");
		dto.setProduct_model(sc.next());
		System.out.print("������ : ");
		dto.setMaker(sc.next());
		System.out.print("���� : ");
		dto.setPrice(sc.next());
	}
}
