package w1124;
import java.util.Scanner;

public class Coordinates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("x�� ��ǥ: ");
		x = sc.nextInt();
		
		System.out.print("y�� ��ǥ: ");
		y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1��и�");
		}
		else if(x<0 && y>0) {
			System.out.println("2��и�");
		}
		else if(x<0 && y<0) {
			System.out.println("3��и�");
		}
		else {
			System.out.println("4��и�");
		}
	
	}
}
