package w1124;
import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int perform;
		int bonus = 0;
		
		System.out.print("������ �Է��Ͻÿ�(����:����) ");
		perform = sc.nextInt();
		
		int overpay = perform - 1000;
		
		if(perform>1000) {
			bonus = (int)(overpay * 0.1);
			System.out.println("���� �޼�");
		}
		else {

		}
		
		System.out.println("���ʽ�: " + bonus);
	}
}
