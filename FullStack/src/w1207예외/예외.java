package w1207����;

public class ���� {
	public static void main(String[] args) {
		
		try {
			
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			//�����ͺ��̽��� �ݰų� ������ �ݰų�
			System.out.println("�� �κ��� �ݵ�� ��ģ��.");
			//������ �߻��� �ߴ� �߻����� �ʾҴ� �ݵ�� �ؾ� �� ��
		}
	}
}
