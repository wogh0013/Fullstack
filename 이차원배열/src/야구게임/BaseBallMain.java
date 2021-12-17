package �߱�����;

import java.util.Random;
import java.util.Scanner;

/* 
 * ���(�߻��� ���) <-----------> ��ǻ��(��ü��, ������)
 */

class BaseBallGame
{
	// 1. ��ǻ�� ���� 3���� �����ϰ� �����ؼ� ���� ����.
	// 2. ������κ��� ���� 3���� �Է¹޴´�.
	// 3. ��ǻ���� ���ڿ� ����� ���ڸ� ���ؼ� ��Ʈ����ũ, ��, �ƿ� ���.
	// 4. ��Ʈ����ũ�� 3���̰ų� ȸ���� 7���̸� ������.
	// 5. ���� ������ 2~4�� �ݺ��Ѵ�.
	
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
	
	// 1. ��ǻ�� ���� 3���� �����ϰ� �����ؼ� ���� ����.
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
	
	// �ߺ��� ������ true ��ȯ, ������ false ��ȯ
	boolean duplicateCheck(int value, int cnt)
	{
		for(int i=0; i<cnt; i++)
		{
			if(computer[i] == value)
				return true;
		}
		return false;
	}
	
	// ���� �迭�� �����ϵ���
	int[] getPerson()
	{
		String temp; //temporary
		
		System.out.println("���� 3���� �Է��ϼ���.");
		temp = sc.next();
		
		int[] nums = new int[3];
		for(int i=0; i<3; i++)
			nums[i] = temp.charAt(i)-'0';
		//String���� �޾Ƽ� int������ �ɰ�
		
		return nums; // c/c++�̶�� �迭�� ����x,
					 // �ڹٴ� �迭�� ������ ��ȯ ����
	}
	
	boolean isMatch()
	{
		//���������
		strike=0;
		ball=0;
		out=0;
		
		int i, j;
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				if( computer[i] == person[j] )// ���� ���� �� ������ ��Ʈ����ũ or ��
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
			// 1. ����� �Է��ϰ�
			person = getPerson();
			finish = isMatch();
			System.out.printf("strike:%d  ball:%d  out:%d\n" , strike, ball, out);
			cnt++;
		} while(!finish && cnt<7);
		
		if(finish)
		{
			System.out.println("���ϵ帳�ϴ�.");
		}
		else
		{
			System.out.println("�ƽ����ϴ�.");
		}
	}
}

public class BaseBallMain {
	public static void main(String[] args) {
		BaseBallGame game = new BaseBallGame();
		game.gameStart();
	}
}
