package w1124;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("¦���Դϴ�");
			}
		else {
			System.out.println("Ȧ���Դϴ�");
		}
	}
}
