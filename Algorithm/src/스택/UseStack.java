package ����;

public class UseStack {
	
	//���ڿ� ������ �Լ�
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
	
	//���� ������ �Լ�
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		
		//char - �� Character - wrapperclass
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
		//���� ����(push)�� ������ ����(pop)�� �ݴ��� - ����
		
		////////
		System.out.println(reverse("���ڿ� ������"));
		
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
