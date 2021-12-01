package com.woori.game;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

//���� �� �� �з�
public class NumberGame {
	int computer;
	ArrayList<Integer> person = new ArrayList<Integer>();
	// ArrayList�� ��Ÿ��(ex. int)�� ���� ���Ѵ�.
	// Wrapper class : ��Ÿ�� -> ������ ��ȯ��Ű�� Ŭ���� (���� �ѷ��μ� ������ ��ȯ������)
	boolean match = false; //�������� ����
	int count=0;
	
	public NumberGame() {
		super();
		Random rand = new Random();
		computer = rand.nextInt((10)+1);
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		while(!match && count<5) {
			System.out.print("���� : ");
			int temp = sc.nextInt();
			
			if(temp==computer)
				match = true;
			else if(temp>computer)
				System.out.println("���ڰ� �ʹ� Ů�ϴ�.");
			else
				System.out.println("���ڰ� �ʹ� �۽��ϴ�.");
			count++;
		}
		
		if(match)
			System.out.printf("%d�� ���� �������ϴ�.\n" , count);
		else
			System.out.println("�ƽ����ϴ�. ��ȸ�� �� ����߽��ϴ�.");
		sc.close();
	}
}
