package w1124;
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, max;
		
		System.out.print("첫 번째 정수 ");
		a = sc.nextInt();
		
		System.out.print("두 번째 정수 ");
		b = sc.nextInt();
		
		if(a>b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println("큰 수는 " + max);
	}
}
