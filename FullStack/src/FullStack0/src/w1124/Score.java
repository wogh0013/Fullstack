package w1124;
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		String grade;
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if(score>=90) {
			grade = "A";
		}
		else if(score>=80) {
			grade = "B";
		}
		else if(score>=70) {
			grade = "C";
		}
		else if(score>=60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		System.out.println("성적은: " + grade + "입니다.");
	}
}
