package w1125;
import java.util.Scanner;

public class Gcd { //최대공약수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, max, min, r;

		System.out.print("두 개의 정수를 입력해주세요. ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>y) {
			max = x;
			min = y;
		}
		else {
			max = y;
			min = x;
		}
		
		while(y!=0) {
			r = max % min;
			max = min;
			min = r;
		}
		
		System.out.println("최대공약수는 " + max + "입니다.");
	}
}
