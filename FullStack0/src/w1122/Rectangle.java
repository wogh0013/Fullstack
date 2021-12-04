package w1122;
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int width, height, surface;
		
		
		System.out.print("∆¯ : ");
		width = sc.nextInt();
		
		System.out.print("≥Ù¿Ã : ");
		height = sc.nextInt();
		
		surface = width * height;
		
		System.out.println("≥–¿Ã : " + surface);
		
	}
}
