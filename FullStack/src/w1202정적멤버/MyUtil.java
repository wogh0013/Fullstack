//문자를 주면 그 문자에 대해서 판단 
//
//isAlpha('a');    true false
//isDigit('0');    true false
//toUpper('a');    소문자를 주면 대문자로 반환
//toLower('A');    대문자를 주면 소문자로 반환
//parseInt("123"); 123으로 반환하기

package w1202정적멤버;

public class MyUtil {
	
	public static boolean isAlpha(char c) {
		if(c>='A' && c<='Z' || c>='a' && c<='z')
			return true;
		return false;
	}
	
	public static boolean isDigit(char c) {
		if(c>='0' && c<='9')
			return true;
		return false;
	}
	
	public static char toUpper(char c) {
		if(c>='a' && c<='z')
			return (char)(c-32); // 소문자를 대문자로 변환(대문자가 소문자가 숫자가 작음)
								 // (char)(c-('a'-'A')); 와 동일
		return c;
	}
	
	public static char toLower(char c) {
		if(c>='A' && c<='Z')
			return (char)(c+32); // 소문자와 대문자는 32씩 차이난다.
								 // (char)(c+('a'-'A')); 와 동일
		return c;
	}
	
	public static int parseInt(String s) {
		// "123" -> 123
		// '1' - '0' = 49-48 = 1
		int sum=0;
		
//		sum = sum*10 + s.charAt(0)-'0';		//0*10 + 1 
//		sum = sum*10 + s.charAt(1)-'0';		//1*10 + 2 = 12
//		sum = sum*10 + s.charAt(2)-'0'; 	//12*10 + 3 = 123
	
		for(int i=0; i<s.length(); i++) {
			if(isDigit(s.charAt(i))) {
				return -1;
			}
		}
		
		for(int i=0; i<s.length(); i++) {
			sum = sum*10 + s.charAt(i)-'0';
		}
		
		return sum;
	}
}
