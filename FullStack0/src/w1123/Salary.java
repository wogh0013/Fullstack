package w1123;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MONEY = 10000;

		System.out.print("���� �ð��� ");
		int time = sc.nextInt();
		
		int weeklypay = MONEY * time;

		System.out.println("�ֱ��� " + weeklypay);
		
	}
}
