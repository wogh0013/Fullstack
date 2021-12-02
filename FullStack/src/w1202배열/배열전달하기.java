package w1202�迭;
import java.util.Scanner;

class MyUtil{
	Scanner sc = new Scanner(System.in);
	
	public void readArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.printf("%d��° : ", i+1);
			nums[i] = sc.nextInt();
		}
	}
	
	public void writeArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();
	}
	
	//�迭 �ָ� �ִ� ��ġ ��ȯ�Լ�
	int getMaxPos(int[] nums) {
		int max = nums[0]; //maximum // �⺻ max���� 0�� �迭���� ����
		int pos = 0; //position // �ʱ� ��ġ���� 0�� �迭�̹Ƿ� 0
		
		for(int i=0; i<nums.length; i++) { // �迭�� �ϳ��ϳ� �˻� �� �ִ��̸� max�� ����
			if(max<nums[i]) {
				max = nums[i];
				pos=i; // i�� �迭�� ��ȣ�̹Ƿ�, ��ġ�� i������ ���
			}
		}
		return pos; // ��ġ���� ��ȯ�ϴ� ���̹Ƿ� return pos;
	}
	
	//�迭 ���ҵ��� ��հ��� �������� �Լ�
	double valueAvg(int[] nums) {
		int value = nums[0];  
		int i, sum=0;
		double avg=0;
		
		for(i=0; i<nums.length; i++) {
			sum += nums[i]; // sum = sum + nums[i];
			avg = (double)sum/nums.length;
		}
		return avg;
	}
}

public class �迭�����ϱ� {
	public static void main(String[] args) {
		MyUtil util = new MyUtil();
		
//		int[] a = new int[10];
//		util.readArray(a);
//		util.writeArray(a);
//		
//		int[] b = new int[5];
//		util.readArray(b);
//		util.writeArray(b);
//		
//		int[] c = new int[7];
//		util.readArray(c);
//		util.writeArray(c);
		
		int[] d = new int[] {2,3,4,5,6,7,1,2,3,4};
		int pos = util.getMaxPos(d);
		double avg = util.valueAvg(d);
		System.out.println("�ִ��� ��ġ : " + pos);
		System.out.println("�迭 ���ҵ��� ��հ� : " + avg);
	}
}
