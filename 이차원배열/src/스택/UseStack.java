package ����;

public class UseStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push('A');
		s.push('B');
		s.push('C');
		s.push('D');
		s.push('E');
		
		System.out.println( (char)s.pop());
		System.out.println( (char)s.pop());
		System.out.println( (char)s.pop());
		System.out.println( (char)s.pop());
		System.out.println( (char)s.pop());
		//���� ����(push)�� ������ ����(pop)�� �ݴ��� 
	}
}
