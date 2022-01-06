package w1125;
import java.util.Scanner;

public class Dowhile3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		int i=1;
		
		System.out.print("단을 입력하세요. ");
		dan = sc.nextInt();
		
		do {			
			System.out.println(dan + " X " + i + " = " + (dan * i));
			i++;
		}while(i<10);
	}
}


/*
	do {
		System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		i+=1;
	} while(i<10)
}
*/