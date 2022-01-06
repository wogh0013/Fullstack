package algorithmProject2;

import java.util.Scanner;

public class BinaryMain {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		 
		int menu, key;
		String temp="";
		Scanner sc = new Scanner(System.in); 
		do
		{
			System.out.println("(1) 상품 등록 (2) 상품 삭제 (3) 상품 검색 (4) 전체 상품 조회 (5) 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			switch(menu)
			{
				case 1: 
					System.out.println("상품 등록");
					System.out.print("상품 번호 입력 : ");
					key = sc.nextInt();
					System.out.print("상품명 입력 : ");
					temp = sc.next();
					bst.insert(key, temp);
					System.out.println();
					break;
					
				case 2:
					System.out.println("상품 삭제");
					System.out.print("상품 번호 입력 : ");
					key = sc.nextInt();
					bst.delete(key);
					System.out.println("상품 삭제 완료");
					System.out.println();
					break;
					
				case 3:
					System.out.println("상품 검색");
					System.out.print("상품 번호 입력 : ");
					key = sc.nextInt();
					System.out.print("상품명 : ");
					bst.search(key);
					System.out.println();
					break;
				
				case 4: 	
					bst.inorder(bst.root);
					System.out.println();
					break;
			}
		} while(menu!=5);
	}
}

