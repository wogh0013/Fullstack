package w1202배열;
import java.util.Scanner;

class MyUtil{
	Scanner sc = new Scanner(System.in);
	
	public void readArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.printf("%d번째 : ", i+1);
			nums[i] = sc.nextInt();
		}
	}
	
	public void writeArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();
	}
	
	//배열 주면 최댓값 위치 반환함수
	int getMaxPos(int[] nums) {
		int max = nums[0]; //maximum // 기본 max값은 0번 배열부터 시작
		int pos = 0; //position // 초기 위치값은 0번 배열이므로 0
		
		for(int i=0; i<nums.length; i++) { // 배열을 하나하나 검사 후 최댓값이면 max에 대입
			if(max<nums[i]) {
				max = nums[i];
				pos=i; // i가 배열의 번호이므로, 위치도 i값으로 출력
			}
		}
		return pos; // 위치값을 반환하는 것이므로 return pos;
	}
	
	//배열 원소들의 평균값을 가져오는 함수
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

public class 배열전달하기 {
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
		System.out.println("최댓값의 위치 : " + pos);
		System.out.println("배열 원소들의 평균값 : " + avg);
	}
}
