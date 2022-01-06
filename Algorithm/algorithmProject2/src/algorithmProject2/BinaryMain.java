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
			System.out.println("(1) ��ǰ ��� (2) ��ǰ ���� (3) ��ǰ �˻� (4) ��ü ��ǰ ��ȸ (5) ����");
			System.out.print("�޴� ���� : ");
			menu = sc.nextInt();
			
			switch(menu)
			{
				case 1: 
					System.out.println("��ǰ ���");
					System.out.print("��ǰ ��ȣ �Է� : ");
					key = sc.nextInt();
					System.out.print("��ǰ�� �Է� : ");
					temp = sc.next();
					bst.insert(key, temp);
					System.out.println();
					break;
					
				case 2:
					System.out.println("��ǰ ����");
					System.out.print("��ǰ ��ȣ �Է� : ");
					key = sc.nextInt();
					bst.delete(key);
					System.out.println("��ǰ ���� �Ϸ�");
					System.out.println();
					break;
					
				case 3:
					System.out.println("��ǰ �˻�");
					System.out.print("��ǰ ��ȣ �Է� : ");
					key = sc.nextInt();
					System.out.print("��ǰ�� : ");
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

