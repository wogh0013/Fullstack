package w1125;

public class BreakTest {
	public static void main(String[] args) {
		int i;
		for(i=1; i<=10; i++) {
			if(i==6) {
				break; // for���� ã�Ƽ� ����������
			}
			System.out.println(i);
		}
		
		int j;
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				if(j==6) {
					continue; //continue�� �ش� ���常 �ǳ� ��
					
					//break; // for���� ã�Ƽ� ����������
					//break�����δ� for���� �� ���� �������� �� �ִ�.
					//���� �� ���ؿ��� 6���� ��������, ���� 10�� ��� ����ȴ�.
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
