package com.woori.game;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberGameMgr {
	ArrayList<NumberGame> list = new ArrayList<NumberGame>();
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		do {
			System.out.println("1. ���ӽ���");
			System.out.println("2. ����   ");
			System.out.println("3. ����   ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				NumberGame ng = new NumberGame();
				list.add(ng);
				ng.start();
				break;
			case 2: 
				displayHistory();
				break;
			case 3:
				System.out.println("������ ����Ǿ����ϴ�.");
				return;
			}
		}while(true);
	}

	public void displayHistory() {
		//��ǻ��		���		���㿩��		count
		// 5	   3 4 5     ����			  3
		// 8     4 5 6 7 9  �� ����         6
		for(NumberGame game : list) {
			System.out.print(game.computer + "\t");
			for(int a : game.person) // ArrayList<Integer> ... Integer <-> int ���� Ư���� ó������ ��ȯ��.
				System.out.print(a + "\t");
			System.out.print(game.match + "\t");
			System.out.println(game.count);
		}
		
		int cnt=0;
		for(NumberGame game : list) {
			if(game.match)
				cnt++;
		}
		//�� n�� �õ��ؼ� m�� �������ϴ�. �·��� (m/n)*100 %�Դϴ�.
		System.out.printf("�� %d�� �õ��ؼ� %d�� �������ϴ�.\n", list.size(), cnt);
	}
	
}
