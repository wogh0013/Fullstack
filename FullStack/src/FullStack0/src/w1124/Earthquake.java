package w1124;
import java.util.Scanner;

public class Earthquake {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float m;
		
		System.out.print("����: ");
		m = sc.nextFloat();
		
		if(m>=7.5) {
			System.out.println("���, ��κ��� �ǹ��� �ر���");
		}
		else if(m>=6.5) {
			System.out.println("����, �� �Ǵ� �ǹ��� �ر��� �� ����");
		}
		else if(m>=5.5) {
			System.out.println("�ߴ��� ����, ���� �μ����ų� ������");
		}
		else if(m>=5.0) {
			System.out.println("�ణ�� ����");
		}
		else {
			System.out.println("����ϰų� ���� ���� ����");
		}
		
	}
}
