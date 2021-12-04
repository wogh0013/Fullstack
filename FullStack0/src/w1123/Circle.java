package w1123;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		
		final float PI=3.141592f; // final을 붙이면 상수, 값을 변경할 수 x
								// 상수는 대문자로만
		float radius;
		float surface;
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 : ");
		radius = sc.nextFloat();
		sc.close();
		
		surface = PI * radius * radius;
		System.out.println("넓이 : " + surface);
	}
}
