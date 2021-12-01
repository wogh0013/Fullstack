package com.woori.game;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

//게임 한 번 분량
public class NumberGame {
	int computer;
	ArrayList<Integer> person = new ArrayList<Integer>();
	// ArrayList는 값타입(ex. int)을 받지 못한다.
	// Wrapper class : 값타입 -> 참조로 전환시키는 클래스 (값을 둘러싸서 참조로 변환시켜줌)
	boolean match = false; //맞혔는지 여부
	int count=0;
	
	public NumberGame() {
		super();
		Random rand = new Random();
		computer = rand.nextInt((10)+1);
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		while(!match && count<5) {
			System.out.print("숫자 : ");
			int temp = sc.nextInt();
			
			if(temp==computer)
				match = true;
			else if(temp>computer)
				System.out.println("숫자가 너무 큽니다.");
			else
				System.out.println("숫자가 너무 작습니다.");
			count++;
		}
		
		if(match)
			System.out.printf("%d번 만에 맞혔습니다.\n" , count);
		else
			System.out.println("아쉽습니다. 기회를 다 사용했습니다.");
		sc.close();
	}
}
