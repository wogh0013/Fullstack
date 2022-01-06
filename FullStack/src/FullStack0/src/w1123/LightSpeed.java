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
		// 자동형변환 : 큰 것을 기준으로 자동형변환이 이루어진다. double/double
		
		System.out.println("걸린 시간은 " + light_year + "광년입니다.");
		//light_year double → String (자동형변환)
		//자동형변환 : 원래의 데이터가 손실이 발생하지 않을 때, 시스템이 알아서 형을 변환한다.
	}
}
