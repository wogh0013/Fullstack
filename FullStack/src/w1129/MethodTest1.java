package w1129;

//Ŭ���� ���� �޼������ ��ü�� �� ����� ��ü�� ��� ȣ���� �ȵ�
public class MethodTest1 {
	
	//displayLine�̶�� �޼��� ����
	public void displayLine() {
		System.out.println("=======");
		}
	
	public void displayLine2(int line) {
		for(int i=1; i<=line; i++) {
			System.out.println("-------");
		}
	}
	
	//���μ���, ����, ���ڸ� ���� -> �Ű�����
	//�Ű����� : �Ű�ü�� �Ǵ� ������
	//�Լ� �ܺηκ��� �Լ��� ���� ������ �������� ����ϴ� �������̴�.
	//displayLine3(3, 10, '*')
	public void displayLine3(int line, int cnt, char mark) {
		for(int i=1; i<=line; i++) {
			for(int j=1; j<=cnt; j++) 
				System.out.print(mark);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//displayLine(); //�̰͸� ���� ������ �翬�� ȣ���� �ȵ�.
		
		//Ŭ���� ���� �޼��� -> ��ü�� �������� ��ü�� ���� -> �޼��� ȣ�� ����
		MethodTest1 t1 = new MethodTest1(); 
		t1.displayLine(); //�Լ��� ȣ��
		
		t1.displayLine();
		t1.displayLine(); // �޼��尪�� �ٲٸ� ��� ȣ�Ⱚ�� �ٲ� good
		t1.displayLine(); // �޼����� ���� : ���뼺 !!!
		System.out.println();
		
		t1.displayLine2(3);
		System.out.println();
		
		t1.displayLine3(3, 10, '*');
		t1.displayLine3(2, 5, '%');
	}
}
