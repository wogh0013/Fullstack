package w1123;

public class LightSpeed {
	public static void main(String[] args) {
		final double LIGHT_SPEED = 30e4;
		final long YEAR_SEC = 365 * 24 * 60 * 60;
		
		double distance = 40e12;
		double sec;
		double light_year;
		
		sec = distance/LIGHT_SPEED;
		light_year = sec/YEAR_SEC; //double, long
		// �ڵ�����ȯ : ū ���� �������� �ڵ�����ȯ�� �̷������. double/double
		
		System.out.println("�ɸ� �ð��� " + light_year + "�����Դϴ�.");
		//light_year double �� String (�ڵ�����ȯ)
		//�ڵ�����ȯ : ������ �����Ͱ� �ս��� �߻����� ���� ��, �ý����� �˾Ƽ� ���� ��ȯ�Ѵ�.
	}
}
