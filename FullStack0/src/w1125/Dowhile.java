package w1125;

public class Dowhile {
	public static void main(String[] args) {
		int i = 10;
		while(i<3) {
			System.out.println("while i=" + i);
			i+=1;
		}
		
		i=1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
	}
}

//dowhile은 적어도 한 번은 실행