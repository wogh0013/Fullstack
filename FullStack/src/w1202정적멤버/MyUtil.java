//���ڸ� �ָ� �� ���ڿ� ���ؼ� �Ǵ� 
//
//isAlpha('a');    true false
//isDigit('0');    true false
//toUpper('a');    �ҹ��ڸ� �ָ� �빮�ڷ� ��ȯ
//toLower('A');    �빮�ڸ� �ָ� �ҹ��ڷ� ��ȯ
//parseInt("123"); 123���� ��ȯ�ϱ�

package w1202�������;

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
			return (char)(c-32); // �ҹ��ڸ� �빮�ڷ� ��ȯ(�빮�ڰ� �ҹ��ڰ� ���ڰ� ����)
								 // (char)(c-('a'-'A')); �� ����
		return c;
	}
	
	public static char toLower(char c) {
		if(c>='A' && c<='Z')
			return (char)(c+32); // �ҹ��ڿ� �빮�ڴ� 32�� ���̳���.
								 // (char)(c+('a'-'A')); �� ����
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
