package w1123;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		
		final float PI=3.141592f; // final�� ���̸� ���, ���� ������ �� x
								// ����� �빮�ڷθ�
		float radius;
		float surface;
		Scanner sc = new Scanner(System.in);

		System.out.print("������ : ");
		radius = sc.nextFloat();
		sc.close();
		
		surface = PI * radius * radius;
		System.out.println("���� : " + surface);
	}
}
