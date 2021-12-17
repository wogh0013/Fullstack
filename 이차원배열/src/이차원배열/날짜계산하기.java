package �������迭;
import java.util.Scanner;
//���� ��� �ϼ��� ����

class DayOfYear
{
	public boolean isLeap(int year)
	{
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		return false;
	}
	
	public int calc(int year, int month, int day){
		int[] lastdays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeap(year))
			lastdays[2]=29;
		
		int result=0;
		for(int i=1; i<month; i++)
		{
			result += lastdays[i]; // result = result + lastdays[i];
		}
		result += day;
		
		return result;
	}
}

public class ��¥����ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DayOfYear dy = new DayOfYear();
		
		int year, month, day;
		
		System.out.println("���� ��� �ϼ��� ���մϴ�.");
		System.out.print("�� : ");
		year = sc.nextInt();
		System.out.print("�� : ");
		month = sc.nextInt();
		System.out.print("�� : ");
		day = sc.nextInt();
		
		System.out.println("���� ��� �ϼ��� " + dy.calc(year, month, day)
							+ "���Դϴ�.");
		
	}
}
