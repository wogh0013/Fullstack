package w1125;
import java.util.Scanner;

public class Gcd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, max;
		
		System.out.print("두 개의 정수를 입력해주세요. ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		max = x>y? x : y;
		
		System.out.println(max);
	}
}
