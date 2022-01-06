package 스택;

public class UseStack {
	
	//문자열 뒤집기 함수
	public static String reverse(String keyword)
	{
		Stack<Character> stack = new Stack<Character>(100);
		for(int i=0; i<keyword.length(); i++)
			stack.push(keyword.charAt(i));
		
		String result = "";
		while( !stack.isEmpty() )
		{
			result += stack.pop(); // result = result + stack.pop()
		}
		
		return result;
	}
	
	//문자 뒤집기 함수
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		
		//char - 값 Character - wrapperclass
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
		//들어가는 순서(push)와 나오는 순서(pop)이 반대임 - 스택
		
		////////
		System.out.println(reverse("문자열 뒤집기"));
		
		////////
		Queue<Character> q = new Queue<Character>();
		q.put('A');
		q.put('B');
		q.put('C');
		q.put('D');
		q.put('E');
		q.put('F');
		
		//q.display();
		while(!q.isEmpty())
			System.out.println(q.get());
		
	}
}
