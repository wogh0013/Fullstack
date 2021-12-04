package w1125;

public class multiFor2 {
	public static void main(String[] args) {
		int i, j;
		int k=2;
		
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				System.out.printf("%4d", k);
				k+=2;
			}
			System.out.println();
		}
	}
}
