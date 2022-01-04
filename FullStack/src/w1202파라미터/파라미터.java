package w1202�Ķ����;

// parameter, �μ�, argument
// �޼��忡 ���� ������ �������� ����Ѵ�
// �������� ������ ���� �������� ���� �� �ٸ� ��Ȳ�� ��������

class MyType{
	int x;
	int y;
	
	//�⺻ ������
	public MyType() {} // m1 = new MyType();
	
	// �Ű����� ������
	public MyType(int x, int y) { // m2 = new MyType(10,20); 
		this.x = x;
		this.y = y;
	}
}

public class �Ķ���� {

	//�Ķ���Ͱ� �� Ÿ���̴�.
	void display(int x, int y) {
		// display.x = main.x
		// display.y = main.y
		// �����Լ��� �ִ� x, y���� display���� ���Ե�.
		System.out.printf("x=%d, y=%d\n", x, y);
	}
	
	void add(int x, int y) {
		// �Լ������� �μ��� ���� ������ ���� ������, �������� �ʴ´�.
		x = x*2;
		y = y*2;
		
		// return ��ɾ�� ���� �� �����ų�, �ϳ��� ���� �� �ִ�.
		// �׷��� �� ���� return���� �� ��ȯ x
	}
	
	void add2(Integer x, Integer y) { //��������
		x = x*2;
		y = y*2;
	}
	
	public void add(MyType m) { //���������� ������
		//add.m = main.m1; -> �� ���� ���� ���� �޸�
		m.x *= 2;
		m.y *= 2;
	}
	
	public static void main(String[] args) {
		int x=10, y=20; // main�Լ��� �ִ� ��������
		�Ķ���� obj = new �Ķ����();
		obj.add(x, y); // 10, 20�� ��µ�
		obj.display(x, y); // x, y ������ ���� ����
		
		obj.add2(x, y); // 10, 20�� ��µ�
		obj.display(x, y); // x, y ������ ���� ����
		
		MyType m2 = new MyType(10, 20);
		obj.add(m2);
		System.out.println(m2.x + "  " + m2.y);
	}
}
