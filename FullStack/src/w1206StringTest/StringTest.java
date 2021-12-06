package w1206StringTest;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("Hello java");
		
		//String Ŭ������ ����Լ��� ��û����.
		//ó���� ��ü�� ����� ������ �� �ٲ۴�.
		for(int i=0; i<s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
			
		String s2 = s1.replace("java", "python");	
		System.out.println(s1); // s1�� �״�� ���
		System.out.println(s2); // s2�� replace�� �ŷ� ���
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.compareTo(s2)); 
		// ���� : s1�� s2���� �տ� �ִ�
		// ��� : s1�� s2���� �ڿ� �ִ�.
		// 0�� �� : ���� ������ ����
		
		int pos = s1.indexOf("java");
		System.out.println(pos);
		
		pos = s2.indexOf("java");
		System.out.println(pos);
		
		s1 = "c:\\temp\\test.txt";
		pos = s1.indexOf(".");
		String filename = s1.substring(0, pos);
		String ext = s1.substring(pos+1);
		System.out.println("���ϸ� : " + filename);
		System.out.println("Ȯ���ڸ� : " + ext);
		
		s1 = "C:\\�ڹ�Ǯ����\\�ڹ�\\workspace_2021\\test.txt";
		pos = s1.lastIndexOf("\\");
		System.out.println(pos);
		
		String path = s1.substring(0, pos);
		filename = s1.substring(pos+1);
		System.out.println("���ϸ� : " + filename);
		System.out.println("Ȯ���ڸ� : " + ext);
		System.out.println(pos);
		
		
		
		StringBuffer buffer = new StringBuffer();
		//���ڿ��� �߰��� �� String�� ��ü�� ���� �����.
		//StringBuffer ���ο� �迭�� �־ �ʿ��ϸ� �޸𸮸� ��� �÷�����.
		//�߰������� ���� �� ���� StringBuffer�� �� �پ��.
		
		buffer.append("flower");
		buffer.append("rainbow");
		buffer.append("cloud");
		buffer.append("rain");
		buffer.append("snow");
		buffer.append("wind");
		
		buffer.setCharAt(0, 'F');
		System.out.println(buffer);
				
		//
		LocalTime lt = LocalTime.now(); //���� �ð��� �и��ʱ���
		System.out.println("���۽ð� : " + lt);
		s1 = new String("");
		for(int i=1; i<=10000; i++)
			s1 = s1+i;
		
		System.out.println("����ð� : " + LocalTime.now());
		
		//
		System.out.println("���۽ð� : " + LocalTime.now());

		buffer = new StringBuffer();
		for(int i=1; i<10000; i++)
			buffer.append(i);
		
		System.out.println("����ð� : " + LocalTime.now());
		
		
		//Wrapper
		//List<int> list = new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);         // 7 -> Integer�� ��ȯ : �ڽ�
		int n = list.get(0); // Integer -> int�� ��ȯ : ��ڽ�
		System.out.println(n);
		
		
	}
}

