package w1209����;
//������ �Լ��� �� �ڼ����ִ� ȥ���� �ô� -> ������ �Լ��� ��������(Ŭ����)
//���� ��� �� Ŭ���������� �ذ��� �� �ִ°��� ���� �ݼ��� �Ѵ�.
//�۰� ���� ���� ������(�͸��� Ŭ����, �͸��� �Լ��� ���� ���� ������)
//Ŭ������ ����� ���� ���� �κи� �츮�� �����ϸ� �ǵ��� �������̽��� �����Ŵ

import java.util.Arrays;
import java.util.List;

public class ���� {

	//usb��� �������̽��� ���ؼ� �����, ���콺, Ű���� ����
	//�츮�� ����Ʈ���������� �ذ��غ��� !
	
	@FunctionalInterface
	interface MyInterface{
		int compare(int x1, int x2); // �� �Լ��� �ܺη� �����Ű�� ���� �����̰� ��ü�� ����.
	}
	
	public static void main(String[] args) {
		MyInterface m1 = (x1, x2)->{return x1 - x2;};
		
		//m1�� ������ �������̽�
		//(x1, x2)->{return x1 - x2};   ��ü
		
		//��Ʈ�� ��� ���
		List<String> sList = Arrays.asList("apple", "banana", "coffee",
				"grape", "milk", "cheese", "kiwi", "berry");
		
		System.out.println(sList.stream().count());
		
		//�� ��Ͽ��� a�� c�� �����ϴ� �����͵鸸 �ɷ��� �ٸ� ����Ʈ��
		List<String> aList = sList.stream().filter(
				(n)->{
					if(n.startsWith("a") || n.startsWith("c"))
						return true;
					else
						return false;
				}
			).toList();
		
		System.out.println(aList);
//		 .forEach((n)->{
//				System.out.println(n);
//			});
	}
}
