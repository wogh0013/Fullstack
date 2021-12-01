package w1201;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;		
		int rand = (int)(Math.random()*10)+1;
		
		for(i=0; i<5; i++) {
			System.out.print("숫자를 입력하세요. ");
			int x = sc.nextInt();
			
			if(rand == x) {
				System.out.println("맞혔습니다.");
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			else if(rand > x) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else {
				System.out.println("더 작은 수를 입력하세요.");
			}
		}
		System.out.println("컴퓨터의 난수는 : " + rand);
	}
}
