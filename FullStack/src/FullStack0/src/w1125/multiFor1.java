package w1125;
import java.util.Scanner;

public class multiFor1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int a, b;
		
		System.out.print("가로의 개수는 ");
		a = sc.nextInt();
		System.out.print("세로의 개수는 ");
		b = sc.nextInt();
		
		for(i=1; i<=b; i++) {
			for(j=1; j<=a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
