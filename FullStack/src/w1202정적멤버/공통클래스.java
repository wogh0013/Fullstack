package w1202�������;

//MyUtil�� main�Լ�

public class ����Ŭ���� {
	public static void main(String[] args) {
		
		System.out.println(MyUtil.isAlpha('a')); // true
		System.out.println(MyUtil.isAlpha('@')); // false
		
		System.out.println(MyUtil.isDigit('5')); // true
		System.out.println(MyUtil.isDigit('a')); // false
		
		System.out.println(MyUtil.toUpper('a')); // A
		System.out.println(MyUtil.toUpper('A')); // A
		
		System.out.println(MyUtil.toLower('a')); // a
		System.out.println(MyUtil.toLower('A')); // a
		
		System.out.println(MyUtil.parseInt("1234") + MyUtil.parseInt("432"));
	}
}
