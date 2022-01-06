package w1125;

public class multiFor3 {
	public static void main(String[] args) {
		char a;
		int i, j;
		
		for(i=0; i<26; i++) {
			int k=i;
			for(j=0; j<26; j++) {
				System.out.print((char)(k+'A'));
				k++;
				if(k>=26)
					k=0;
			}
			System.out.println();
		}
	}
}
