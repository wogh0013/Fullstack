package w1130;
import java.util.ArrayList;

public class �÷��� {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ŀ��");
		list.add("�����ֽ�");
		list.add("�������ֽ�");
		list.add("�ڸ����̵�");
		list.add("ļ��ḶŰ�ƶ�");
		
		System.out.println("������ ī��Ʈ : " + list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //����� ������ ��������
		}
		
		int pos = list.indexOf("�����ֽ�"); // �迭 ��ȣ�� ��ȯ
		System.out.println(pos);
		
		pos = list.indexOf("�����ֽ�");  //�ڹٴ� �Լ��� ���� ������ ���� �� -1 ��ȯ
		System.out.println(pos);      //������ ���� null��
				
		list.sort(null); // abc��, �����ٶ������ �þ���� �� = ����(sort)
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------���� ��------");
		list.remove(1); //��ġ��
		list.remove("ļ��ḶŰ�ƶ�"); //�̸���
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("-----��ü���� ��------");
		list.clear();
		for(String s : list) {
			System.out.println(s);
		}
	}
}
