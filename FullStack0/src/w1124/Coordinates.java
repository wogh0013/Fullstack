package w1124;
import java.util.Scanner;

public class Coordinates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("x의 좌표: ");
		x = sc.nextInt();
		
		System.out.print("y의 좌표: ");
		y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1사분면");
		}
		else if(x<0 && y>0) {
			System.out.println("2사분면");
		}
		else if(x<0 && y<0) {
			System.out.println("3사분면");
		}
		else {
			System.out.println("4사분면");
		}
	
	}
}
