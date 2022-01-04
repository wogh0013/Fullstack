package w1123;

public class CharTest {
	public static void main(String[] args) {
		char c;
		c = 'A';
		System.out.println(c);

		String word = "단어";
		System.out.println(word);
		
		System.out.println("문장을\n나누자"); //줄바꿈
		System.out.println("문장을\t나누자"); //탭
		System.out.println("문장을\b나누자"); //앞으로 한 칸
		System.out.println("문장을\r\n나누자"); // \r\n 줄바꿈   \n os마다
	
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
		System.out.println((int)'1');
		
		
		boolean b;
		b = true;
		System.out.println(b);
		
		b = false;
		System.out.println(b);
		
		b = 1>2;
		System.out.println(b);
		
		//c=null; //값형 타입에는 null 리터럴을 줄 수 없다.
		word=null;
	}
}
