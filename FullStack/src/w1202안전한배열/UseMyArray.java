package w1202�����ѹ迭;

public class UseMyArray {
	public static void main(String[] args) {
		MyArray arr = new MyArray();
		
		arr.setValue(0, 1);
		arr.setValue(10, 11);
		
		// 1. �����Ϳ� �ܼ�����
		int[] arr2 = new int[10];
//		arr2[10] = 11; // �̰� ���� �߻� because 10�� ���� �����Ƿ�
		
		// 2. �Լ��� �̿��Ͽ� �����Ϳ� ����
		System.out.println(arr.getValue(0));
		System.out.println(arr.getValue(10)); // �������� -1 ��ȯ
		System.out.println(arr.getValue(100)); // �������� -1 ��ȯ
		
		// 1���� 2�� ����ϴ� ���� !
		// �Լ��� �̿��� �����Ϳ� �����ϸ�, ���ٱ����� ����� �پ��� ������� �����͸� ��ȣ����
		// �̰��� �Լ��� ����Ͽ� �����Ϳ� �����ϴ� �����̴�.
		
		MyArray arr3 = new MyArray(30);
	}
}
