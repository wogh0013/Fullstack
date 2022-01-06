package w1126;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] s = null; // null이라는 의미는 메모리가 할당되지 않았다 ! (꽁백과 다름)
						// 참조형변수는 배열, 객체의 초기화 값은 null이다.
		
		s = new int[10]; // 힙공간에 정수 10개 저장할 메모리를 만들고, 그 메모리의 시작번지를 준다.

		s[0] = 1;
		s[1] = 2;
		s[2] = 3;
		s[3] = 4;
		s[4] = 5;
		s[5] = 6;
		s[6] = 7;
		s[7] = 8;
		s[8] = 9;
		s[9] = 10;
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println(s[5]);
		System.out.println(s[6]);
		System.out.println(s[7]);
		System.out.println(s[8]);
		System.out.println(s[9]);
	}
}
