package w1123;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		
		int input_money;
		int m50000, m10000, m5000, m1000, m500, m100, m50, m10;
		int temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ž������� ");
		input_money = sc.nextInt();
		sc.close();
		
		temp = input_money;
		
		m50000 = temp/50000;
		temp = temp % 50000;
		
		m10000 = temp/10000;
		temp = temp % 10000;
		
		m5000 = temp/5000;
		temp = temp % 5000;
		
		m1000 = temp/1000;
		temp = temp % 1000;
		
		m500 = temp/500;
		temp = temp % 500;
		
		m100 = temp/100;
		temp = temp % 100;

		m50 = temp/50;
		temp = temp % 50;
		
		m10 = temp/10;
		temp = temp % 10;
		
		System.out.printf("50000 �� %d��\n", m50000);
		System.out.printf("10000 �� %d��\n", m10000);
		System.out.printf("5000  �� %d��\n", m5000);
		System.out.printf("1000  �� %d��\n", m1000);
		System.out.printf("500   �� %d��\n", m500);
		System.out.printf("100   �� %d��\n", m100);
		System.out.printf("50    �� %d��\n", m50);
		System.out.printf("10    �� %d��\n", m10);
	}
}
