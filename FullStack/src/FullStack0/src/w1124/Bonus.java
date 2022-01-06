package w1124;
import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int perform;
		int bonus = 0;
		
		System.out.print("실적을 입력하시오(단위:만원) ");
		perform = sc.nextInt();
		
		int overpay = perform - 1000;
		
		if(perform>1000) {
			bonus = (int)(overpay * 0.1);
			System.out.println("실적 달성");
		}
		else {

		}
		
		System.out.println("보너스: " + bonus);
	}
}
