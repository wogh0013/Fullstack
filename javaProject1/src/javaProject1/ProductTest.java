package javaProject1;

import java.util.ArrayList;

public class ProductTest {
	public static void main(String[] args) {
		
		// ũ�Ⱑ ������ ���� ���� ��� 
		ArrayList<Product> list = new ArrayList<>();
		
		list.add(new Product(001, "��Ʈ��", 1200000, 2021, "�Ｚ")); 	// 0��°
		list.add(new Product(002, "�����", 300000, 2021, "LG")); 	// 1��°
		list.add(new Product(003, "���콺", 30000, 2020, "������"));	// 2��°
		
		
		System.out.println("��ǰ��ȣ   ��ǰ��     ����       ����      ������");
		System.out.println("----------------------------------------");
		
		for(Product prd : list) {
			System.out.println(prd.toString());			
		}
//		
		
		
	
		// 1��° ���
//		Product prd = new Product(001, "��Ʈ��", 1200000, 2021, "�Ｚ");
//		Product prd2 = new Product(002, "�����", 300000, 2021, "LG");
//		Product prd3 = new Product(003, "���콺", 30000, 2020, "������");
//		System.out.println(prd.toString());
//		System.out.println(prd2.toString());
//		System.out.println(prd3 .toString());
		
		
		// 2��° ���
//		for(int i=0; i<list.size(); i++) {
//			Product prd = list.get(i);
//			System.out.println(prd.toString());
//	}
		
	}
}
