package w1201;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;		
		int rand = (int)(Math.random()*10)+1;
		
		for(i=0; i<5; i++) {
			System.out.print("���ڸ� �Է��ϼ���. ");
			int x = sc.nextInt();
			
			if(rand == x) {
				System.out.println("�������ϴ�.");
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}
			else if(rand > x) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}
			else {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
		}
		System.out.println("��ǻ���� ������ : " + rand);
	}
}
