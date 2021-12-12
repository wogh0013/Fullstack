package javaProject1;

import java.util.ArrayList;

public class ProductTest {
	public static void main(String[] args) {
		
		// 크기가 정해져 있지 않은 경우 
		ArrayList<Product> list = new ArrayList<>();
		
		list.add(new Product(001, "노트북", 1200000, 2021, "삼성")); 	// 0번째
		list.add(new Product(002, "모니터", 300000, 2021, "LG")); 	// 1번째
		list.add(new Product(003, "마우스", 30000, 2020, "로지텍"));	// 2번째
		
		
		System.out.println("상품번호   상품명     가격       연도      제조사");
		System.out.println("----------------------------------------");
		
		for(Product prd : list) {
			System.out.println(prd.toString());			
		}
//		
		
		
	
		// 1번째 방법
//		Product prd = new Product(001, "노트북", 1200000, 2021, "삼성");
//		Product prd2 = new Product(002, "모니터", 300000, 2021, "LG");
//		Product prd3 = new Product(003, "마우스", 30000, 2020, "로지텍");
//		System.out.println(prd.toString());
//		System.out.println(prd2.toString());
//		System.out.println(prd3 .toString());
		
		
		// 2번째 방법
//		for(int i=0; i<list.size(); i++) {
//			Product prd = list.get(i);
//			System.out.println(prd.toString());
//	}
		
	}
}
