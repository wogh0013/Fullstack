package 야구게임;

import java.util.Random;
import java.util.Scanner;

/* 
 * 사람(추상적 사고) <-----------> 컴퓨터(구체적, 분해적)
 */

class BaseBallGame
{
	// 1. 컴퓨터 숫자 3개를 랜덤하게 생성해서 갖고 있자.
	// 2. 사람으로부터 숫자 3개를 입력받는다.
	// 3. 컴퓨터의 숫자와 사람의 숫자를 비교해서 스트라이크, 볼, 아웃 계산.
	// 4. 스트라이크가 3개이거나 회수가 7번이면 끝난다.
	// 5. 끝날 때까지 2~4를 반복한다.
	
	Scanner sc = new Scanner(System.in);
	
	int[] computer;
	int[] person;
	int strike;
	int ball;
	int out;
	
	public BaseBallGame()
	{
		computer = new int[3];
		person = new int[3];
		strike = 0;
		ball = 0;
		out = 0;
		
		start();
	}
	
	// 1. 컴퓨터 숫자 3개를 랜덤하게 생성해서 갖고 있자.
	void start()
	{
		Random random = new Random();
		int cnt=0;
		while(cnt<3)
		{
			int temp = random.nextInt(10);
			if( !duplicateCheck(temp, cnt) )
			{
				computer[cnt] = temp;
				cnt++;
			}
		}
	}
	
	// 중복이 있으면 true 반환, 없으면 false 반환
	boolean duplicateCheck(int value, int cnt)
	{
		for(int i=0; i<cnt; i++)
		{
			if(computer[i] == value)
				return true;
		}
		return false;
	}
	
	// 정수 배열을 리턴하도록
	int[] getPerson()
	{
		String temp; //temporary
		
		System.out.println("숫자 3개를 입력하세요.");
		temp = sc.next();
		
		int[] nums = new int[3];
		for(int i=0; i<3; i++)
			nums[i] = temp.charAt(i)-'0';
		//String으로 받아서 int형으로 쪼갬
		
		return nums; // c/c++이라면 배열을 리턴x,
					 // 자바는 배열이 참조라서 반환 가능
	}
	
	boolean isMatch()
	{
		//멤버변수만
		strike=0;
		ball=0;
		out=0;
		
		int i, j;
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				if( computer[i] == person[j] )// 서로 같은 게 있으면 스트라이크 or 볼
				{
					if(i==j)
						strike++;
					else
						ball++;
				}
			}
			
			out = 3-(strike+ball);
		}
		if(strike==3)
			return true;
		else
			return false;
	}
	
	public void gameStart()
	{
		int cnt=0;
		boolean finish = false;
		
		do
		{
			// 1. 사람이 입력하고
			person = getPerson();
			finish = isMatch();
			System.out.printf("strike:%d  ball:%d  out:%d\n" , strike, ball, out);
			cnt++;
		} while(!finish && cnt<7);
		
		if(finish)
		{
			System.out.println("축하드립니다.");
		}
		else
		{
			System.out.println("아쉽습니다.");
		}
	}
}

public class BaseBallMain {
	public static void main(String[] args) {
		BaseBallGame game = new BaseBallGame();
		game.gameStart();
	}
}
