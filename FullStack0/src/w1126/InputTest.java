package w1126;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		int nums[] = new int[50];
		int count; //실제 입력받을 데이터 개수를 저장할 변수
		char again; //계속 할 건지 말 건지를 입력받기 위한 변수
		Scanner sc = new Scanner(System.in);
		
		count=0; // 첫 번째 배열 준비
		do
		{
			System.out.print("정수 : ");
			nums[count] = sc.nextInt();
			count++; // 다음 배열로 !
			if(count>=50) { //배열의 메모리 크기 한정
				System.out.println("메모리가 부족합니다.");
				break;
			}
			System.out.print("계속? ");
			again = (char)sc.next().charAt(0); // 한 글자씩 못 읽고, next().charAt(0)은 입력한 글자의 첫 번째 글자를 읽음 !!
		}while(again=='y' || again=='Y');
		
		for(int i=0; i<count; i++) {
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();
	}
}
