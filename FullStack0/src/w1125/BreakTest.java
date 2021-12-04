package w1125;

public class BreakTest {
	public static void main(String[] args) {
		int i;
		for(i=1; i<=10; i++) {
			if(i==6) {
				break; // for블럭을 찾아서 빠져나간다
			}
			System.out.println(i);
		}
		
		int j;
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
				if(j==6) {
					continue; //continue는 해당 문장만 건너 뜀
					
					//break; // for블럭을 찾아서 빠져나간다
					//break문으로는 for블럭을 한 개만 빠져나갈 수 있다.
					//따라서 행 기준에서 6에서 멈추지만, 열은 10개 모두 실행된다.
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
