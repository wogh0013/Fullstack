package w1123;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		int meter;
		int km;
		int m;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ʹ� ? ");
		meter = sc.nextInt();
		
		km = meter/1000;
		m = meter%1000;
		
		System.out.printf("%d ���ʹ� %dkm ų�ι��� %dm �Դϴ�\n", meter, km, m);
	}
}
