package w1124;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("짝수입니다");
			}
		else {
			System.out.println("홀수입니다");
		}
	}
}
