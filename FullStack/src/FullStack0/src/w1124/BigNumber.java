package w1124;
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, max;
		
		System.out.print("ù ��° ���� ");
		a = sc.nextInt();
		
		System.out.print("�� ��° ���� ");
		b = sc.nextInt();
		
		if(a>b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println("ū ���� " + max);
	}
}
