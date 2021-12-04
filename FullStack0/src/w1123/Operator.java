package w1123;

public class Operator {
	public static void main(String[] args) {
		int a,b;
		
		a=7;
		b=2;
		
		//문자열을 더해서 더하지 않고 숫자 문자 막 섞어서 문장을 만들 때 사용
		//%d:정수, %f:실수, %c:문자, %s:문자열
		//format 스트링
		// %기호는 특수목적으로 쓰고 있어서, 별도로 %기호를 출력하고 싶으면 두 번 써야 한다.(%%)
		System.out.printf("%05d + %05d = %05d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		
		System.out.printf("%.2f\n", 12.455666); // %.2f → 소숫점 두 자리까지(반올림)
		
	}
}
