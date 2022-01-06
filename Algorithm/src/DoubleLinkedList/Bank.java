package DoubleLinkedList;

import java.util.Scanner;

public class Bank {
	int number=1;
	MyQueue q = new MyQueue();
	Scanner sc = new Scanner(System.in);
	
	public void start()
	{
		while(true)
		{
			System.out.println("1. �մ�");
			System.out.println("2. �����");
			System.out.println("3. ����");
			System.out.println("���� : ");
			int menu = sc.nextInt();
			switch(menu)
			{
			case 1: callCustomer(); break;
			case 2: Banker();		break;
			case 3: return;
			}
		}
	}
	
	public void callCustomer()
	{
		q.put(number++);
		System.out.printf("�մ��� ��ȣ�� %d�̰�, ���� ����ڰ� %d�� �ְ�, ��⿹��ð��� %d�Դϴ�. \n",
				+ number, q.getCount(), q.getCount()*2);
		number++;
	}
	
	public void Banker()
	{
		int temp = 0;
		if(q.isEmpty())
			System.out.println("��� ���� �մ��� �����ϴ�.");
		else
		{
			temp = q.get();
			System.out.printf("%d�� �մ� â�� ������ ���ּ���.", temp);
		}
	}
}
