package w1123;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		int meter;
		int km;
		int m;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("미터는 ? ");
		meter = sc.nextInt();
		
		km = meter/1000;
		m = meter%1000;
		
		System.out.printf("%d 미터는 %dkm 킬로미터 %dm 입니다\n", meter, km, m);
	}
}
