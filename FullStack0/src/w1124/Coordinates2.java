package w1124;
import java.util.Scanner;

public class Coordinates2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int x, y;
			int coordi;
			
			System.out.print("xÀÇ ÁÂÇ¥: ");
			x = sc.nextInt();
			
			System.out.print("yÀÇ ÁÂÇ¥: ");
			y = sc.nextInt();
			
			if(x>0 && y>0) {
				coordi = 1;
			}
			else if(x<0 && y>0) {
				coordi = 2;
			}
			else if(x<0 && y<0) {
				coordi = 3;
			}
			else {
				coordi = 4;
			}
		System.out.println(coordi + "»çºÐ¸é");
	}
}

