package w1123;

public class ConstantTest {
	public static void main(String[] args) {
		final double KM_PER_MILE = 1.609344;
		double km;
		
		double mile = 60;
		
		//KM_PER_MILE=1.61; ����� �� ����x
		
		km = mile * KM_PER_MILE;
		
		System.out.println("60������ " + km + "�Դϴ�.");
	}
}
