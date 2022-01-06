package w1125;

public class multiFor4 {
	public static void main(String[] args) {
//		int i,j;
//		int k=1;
//		
//		for(i=1; i<=5; i++) {
//			for(j=1; j<=k; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			k+=2;
//		}
		int i,j;
		int line=6;
		
		for(i=1; i<=line; i++) {
			for(j=1; j<=line-i; j++)
				System.out.print(" ");
			for(j=1; j<=2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		line = line -1;
		
		for(i=1; i<=line; i++) {
			for(j=1; j<=i; j++)
				System.out.print(" ");
			for(j=1; j<=(line-i)*2+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
