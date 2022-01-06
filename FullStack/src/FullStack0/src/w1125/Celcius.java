package w1125;

public class Celcius {
	public static void main(String[] args) {
		int C=1;
		
		for(C=0; C<=100; C++) {
			float F = (float)((C * 1.8) + 32);
			System.out.println(C + " --> " + F );
		}
	}
}
