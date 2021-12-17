package 스택;

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
		//들어가는 순서(push)와 나오는 순서(pop)이 반대임 
	}
}
