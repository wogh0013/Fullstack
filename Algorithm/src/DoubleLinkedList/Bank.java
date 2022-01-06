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
			System.out.println("1. 손님");
			System.out.println("2. 은행원");
			System.out.println("3. 종료");
			System.out.println("선택 : ");
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
		System.out.printf("손님의 번호는 %d이고, 현재 대기자가 %d명 있고, 대기예상시간은 %d입니다. \n",
				+ number, q.getCount(), q.getCount()*2);
		number++;
	}
	
	public void Banker()
	{
		int temp = 0;
		if(q.isEmpty())
			System.out.println("대기 중인 손님이 없습니다.");
		else
		{
			temp = q.get();
			System.out.printf("%d번 손님 창구 앞으로 와주세요.", temp);
		}
	}
}
