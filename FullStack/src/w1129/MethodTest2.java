package w1129;

class MyMethod{
	
	//�Լ��� �� ���� ������ �Է¹޾Ƽ� ����� ��ȯ�ϴ� �Լ�
	//�Լ��� �տ� void�� ������ �ٸ� Ÿ���� ������, �ݵ�� return ������ �ۼ��ؾ� �Ѵ�.
	int add(int x, int y) {
		return x+y;
	}
	
	void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	void displayGugu(int dan) {
		for(int i=1; i<=9; i++) {
			int result = dan*i;
				System.out.println(dan + "*" + i + " = " + result);
		}
	}
	
	int sigma(int limit) {
		int i, sum=0; // �Լ� �ȿ� ������ ����� �Լ� �ȿ����� ���� (��������)
		for(i=1; i<=limit; i++) {
			sum += i; // sum = sum + i
		}
		return sum;
	}
	
	//������ �Է¹޾Ƽ� �����̸� true, �ƴϸ� false�� ��ȯ�ϴ� �Լ� �����
	//4�� ����̸鼭 100�� ����� �Ǹ� �ȵȴ�, �׸��� 400�� ����� �����̴�  isLeap(2000);
	boolean isLeap(int year) {
		//���� : not -> and -> or
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		else 
			return false;
	}
	
	void diamondDisplay(int line) {
		//1.���࿡ line�� ¦���� Ȧ���� �ٲ㼭
		
		if(line%2==0) // ¦���� �� Ȧ���� �����
			line = line+1;
		
		line = line/2+1; // 9/2 -> 4 -> +1 = 5
		
		System.out.println(line);
		
		int i, j;
		for(i=1; i<=line; i++) {
			for(j=1; j<=line-i; j++)
				System.out.print(" ");
			for(j=1; j<=2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
		for(i=1; i<=line-1; i++) {
			for(j=1; j<=i; j++)
				System.out.print(" ");
			for(j=1; j<=2*(line-i)-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
} 


public class MethodTest2 {
	public static void main(String[] args) {
		MyMethod mm = new MyMethod();
		int a = mm.add(3, 5);
		System.out.println(a);
		
		//System.out.println(mm.sub(1,5)); void�� ��� ���Ѵ�.
		mm.sub(5, 3);
		
		mm.displayGugu(4);
		
		//1~n������ �հ踦 ���ؼ� ��ȯ�ϴ� �Լ�
		System.out.println(mm.sigma(10));
	
		int cnt=0;
		for(int i=0; i<=2021; i++) {
			if(mm.isLeap(i))
				cnt++;
		}
		System.out.println(cnt);
		
		mm.diamondDisplay(9);
	}
}
