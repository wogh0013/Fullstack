package w1126;
import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		int i, total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		// 1.�Է�
		for(i=0; i<scores.length; i++) {
			System.out.print("���� : ");
			scores[i] = sc.nextInt();
		}
		
		// 2.���
		total = 0;
		for(i=0; i<scores.length; i++) {
			total+=scores[i];
		}
		avg = total/5.0;
		
		// 3.���
		for(i=0; i<scores.length; i++) {
			System.out.printf("%4d", scores[i]);
		}
		System.out.println();
		System.out.println("��� : " + avg);
	}
}
