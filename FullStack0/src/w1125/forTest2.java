package w1125;
import java.util.Scanner;

public class forTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, num2;
		int sum=0;
		int result=1;
		char a = 'a';
		
//		for(i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		System.out.println();
//		
//		sum=0;
//		System.out.print("정수를 입력하세요. ");
//		num = sc.nextInt();
//		for(i=1; i<=num; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		System.out.println();
//		
//		System.out.print("정수2를 입력하세요. ");
//		num2 = sc.nextInt();
//		for(i=1; i<=10; i++) {
//			result = num2 * i; //result = num2 * i
//			System.out.print(result + " ");
//		}
//		System.out.println();
//		
//		for(a='a'; a<='z'; a++) {
//			System.out.print(a);
//		}
//		System.out.println();
		
//		for(a='a'; a<='z'; a++) {
//			System.out.print(a);
//		}
//		System.out.println();
//		
//		for(a='A'; a<='Z'; a++) {
//			System.out.print(a);
//		}
//		System.out.println();
//		
//		for(i=1; i<=100; i++) {
//			System.out.printf("%3d", i);
//			if(i%10==0)
//				System.out.println();
//		}
//		
		System.out.print("숫자 ");
		int m = sc.nextInt();
		
		for(i=1; i<=m; i++) {
			if(m%i==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
