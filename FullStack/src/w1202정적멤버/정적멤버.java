package w1202�������;

class Counter{
	int x=0; //�ν��Ͻ� ����, ��ü�� ���� �� �޸𸮰� Ȯ���ȴ�.(������)
	
	static int count=0; //���� ����, Ŭ������ ������ �� �޸𸮰� Ȯ���ȴ�.(��������)
						//�����޸𸮷� ����ϰ�, ��ü�� ����� ���� �� �̹� �����Ѵ�. 
						//�����ڿ��� ���� �ʱ�ȭ�ϸ� xxxxx !! 
						//��ü�� ��� ���� ����(��ü ���� �����Ѵ�)
						//	��(����) Ŭ����.������ -> Counter.count
		// static �޼���� static�� ���� ���� ������ �Լ��� ����� �� ����.
		// �ν��Ͻ� ���� ���Ұ�, �ν��Ͻ� �Լ� ȣ��Ұ�
		// this �����ڸ� ����� �� ����. this�� ��ü�� ������ ��� �����ϴ�.
	
	public static void displayCount() {
		//System.out.println(x); // �ν��Ͻ� ���� x�� ��ü�� �־�� ��� ����
		System.out.println("���� ī��Ʈ : " + count); // �������� count�� ��ü�� ��� ��� ����
	}
}

public class ������� {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		System.out.println(c1.x);
		System.out.println(c1.count);
		
		System.out.println(Counter.count); //���������� Ŭ���������� �����ϴ� ���� ����
	}
}
