package com.woori.game;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberGameMgr {
	ArrayList<NumberGame> list = new ArrayList<NumberGame>();
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		do {
			System.out.println("1. 게임시작");
			System.out.println("2. 전적   ");
			System.out.println("3. 종료   ");
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
				System.out.println("게임이 종료되었습니다.");
				return;
			}
		}while(true);
	}

	public void displayHistory() {
		//컴퓨터		사람		맞춤여부		count
		// 5	   3 4 5     맞춤			  3
		// 8     4 5 6 7 9  못 맞춤         6
		for(NumberGame game : list) {
			System.out.print(game.computer + "\t");
			for(int a : game.person) // ArrayList<Integer> ... Integer <-> int 서로 특별한 처리없이 변환됨.
				System.out.print(a + "\t");
			System.out.print(game.match + "\t");
			System.out.println(game.count);
		}
		
		int cnt=0;
		for(NumberGame game : list) {
			if(game.match)
				cnt++;
		}
		//총 n번 시도해서 m번 맞혔습니다. 승률은 (m/n)*100 %입니다.
		System.out.printf("총 %d번 시도해서 %d번 맞혔습니다.\n", list.size(), cnt);
	}
	
}
