package w1202�̱���;

class Singleton{
	//�̱��� : ��ü�� �ϳ��� ����� Ŭ���� ������ 
	//DB�� ���� �̱����� ������ �Ѵ� !
	
	//1. private �����ڸ� �����, Ŭ���� �ۿ��� ��ü�� �����ϴ� ���� ���´�.
	private Singleton() {}
	
	//2. ��ü ������ ������ ����
	private static Singleton inst = null; 
	
	//3. ��ü ������ ��ȯ�� static �޼���
	public static Singleton getInstance() {
		if(inst==null)
			inst = new Singleton();
		return inst;
	}
	int x; //�����ڿ�
}


public class SingletonMain {
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		s.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.x);
		
		
	}
}
