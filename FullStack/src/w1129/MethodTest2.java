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
	
	void displayGugu(int x) {
		for(int i=1; i<=9; i++) {
			int result = x*i;
				System.out.println(x + "*" + i + " = " + result);
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
	
	}
}
