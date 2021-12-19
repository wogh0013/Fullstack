package 이차원배열;
import java.util.Scanner;
//그해 경과 일수를 구함

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

public class 날짜계산하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DayOfYear dy = new DayOfYear();
		
		int year, month, day;
		
		System.out.println("그해 경과 일수를 구합니다.");
		System.out.print("년 : ");
		year = sc.nextInt();
		System.out.print("월 : ");
		month = sc.nextInt();
		System.out.print("일 : ");
		day = sc.nextInt();
		
		System.out.println("그해 경과 일수는 " + dy.calc(year, month, day)
							+ "일입니다.");
		
	}
}
