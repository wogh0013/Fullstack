package w1126;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		int nums[] = new int[50];
		int count; //���� �Է¹��� ������ ������ ������ ����
		char again; //��� �� ���� �� ������ �Է¹ޱ� ���� ����
		Scanner sc = new Scanner(System.in);
		
		count=0; // ù ��° �迭 �غ�
		do
		{
			System.out.print("���� : ");
			nums[count] = sc.nextInt();
			count++; // ���� �迭�� !
			if(count>=50) { //�迭�� �޸� ũ�� ����
				System.out.println("�޸𸮰� �����մϴ�.");
				break;
			}
			System.out.print("���? ");
			again = (char)sc.next().charAt(0); // �� ���ھ� �� �а�, next().charAt(0)�� �Է��� ������ ù ��° ���ڸ� ���� !!
		}while(again=='y' || again=='Y');
		
		for(int i=0; i<count; i++) {
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();
	}
}
