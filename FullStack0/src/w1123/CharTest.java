package w1123;

public class CharTest {
	public static void main(String[] args) {
		char c;
		c = 'A';
		System.out.println(c);

		String word = "�ܾ�";
		System.out.println(word);
		
		System.out.println("������\n������"); //�ٹٲ�
		System.out.println("������\t������"); //��
		System.out.println("������\b������"); //������ �� ĭ
		System.out.println("������\r\n������"); // \r\n �ٹٲ�   \n os����
	
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
		System.out.println((int)'1');
		
		
		boolean b;
		b = true;
		System.out.println(b);
		
		b = false;
		System.out.println(b);
		
		b = 1>2;
		System.out.println(b);
		
		//c=null; //���� Ÿ�Կ��� null ���ͷ��� �� �� ����.
		word=null;
	}
}
