package w1123;

public class Operator {
	public static void main(String[] args) {
		int a,b;
		
		a=7;
		b=2;
		
		//���ڿ��� ���ؼ� ������ �ʰ� ���� ���� �� ��� ������ ���� �� ���
		//%d:����, %f:�Ǽ�, %c:����, %s:���ڿ�
		//format ��Ʈ��
		// %��ȣ�� Ư���������� ���� �־, ������ %��ȣ�� ����ϰ� ������ �� �� ��� �Ѵ�.(%%)
		System.out.printf("%05d + %05d = %05d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		
		System.out.printf("%.2f\n", 12.455666); // %.2f �� �Ҽ��� �� �ڸ�����(�ݿø�)
		
	}
}
