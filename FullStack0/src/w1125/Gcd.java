package w1125;
import java.util.Scanner;

public class Gcd { //�ִ�����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, max, min, r;

		System.out.print("�� ���� ������ �Է����ּ���. ");
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
		
		System.out.println("�ִ������� " + max + "�Դϴ�.");
	}
}
