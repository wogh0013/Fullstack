package w1125;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int i, ran, cnt;
		int sum=0;
		
		System.out.print("������ ������ ");
		cnt = sc.nextInt();
		
		for(i=1; i<=cnt; i++) {
			ran = random.nextInt(100);
			sum += ran;
		}
		System.out.println("���� " + cnt + "���� ���� " + sum + "�Դϴ�.");
	}
}
