package w1126;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] s = null; // null�̶�� �ǹ̴� �޸𸮰� �Ҵ���� �ʾҴ� ! (�ǹ�� �ٸ�)
						// ������������ �迭, ��ü�� �ʱ�ȭ ���� null�̴�.
		
		s = new int[10]; // �������� ���� 10�� ������ �޸𸮸� �����, �� �޸��� ���۹����� �ش�.

		s[0] = 1;
		s[1] = 2;
		s[2] = 3;
		s[3] = 4;
		s[4] = 5;
		s[5] = 6;
		s[6] = 7;
		s[7] = 8;
		s[8] = 9;
		s[9] = 10;
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println(s[5]);
		System.out.println(s[6]);
		System.out.println(s[7]);
		System.out.println(s[8]);
		System.out.println(s[9]);
	}
}
