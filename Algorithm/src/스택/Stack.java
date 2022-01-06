package ����;

//��ü���� ���α׷��ֿ��� �����ϴ� Ŭ���� ����⿡ ������
//������ push() ���ÿ� �����͸� �ϳ� �ִ´�
//		pop()  ������ �� ������ ������ �ϳ��� ������ ��ȯ�Ѵ�.
//		isEmpty() ������ ��� true, �ƴϸ� false ��ȯ
//		isFull() ������ �� ���� true, �ƴϸ� false�� ��ȯ
//		peak() ������ �ֻ��� �����͸� Ȯ��
public class Stack<T> {
	private T stack[];
	private int top; //�迭�� �ε��� - ������ �ֻ����� �����Ѿ� �Ѵ�.
	
	@SuppressWarnings("unchecked")
	public Stack()
	{
		stack = (T[])new Object[10];
		top=-1; // ������ ����ִ� ��Ȳ
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int size)
	{
		if(size<10)
			size=10;
		stack = (T[])new Object[size];
		top=-1; //������ ����ִ� ��Ȳ
	}
	
	public void push(T a)
	{
		if(isFull()) { // ����ó���� ���ʿ��� �ϸ� �Լ��� �������
			System.out.println("Stack Overflow");
			return;	   // �Լ��� �����Ѵ�. void�� ���� return;
		}
		top++;
		stack[top]=a;
	}
	
	public T pop()
	{
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return null; // �Լ��� return�� �ؾ� �ϴµ� ���� ���� ���� ����
					   // -1�� ������ �� �Ϲ����̴�.
					   // ��ó�� void�� ���� �׳� return
					   // ������ ���⼱ int�� ��ȯ�̹Ƿ� -1�� return�ع�����.
		}
		T temp = stack[top]; // �ֻ��� �����͸� ������
		top--; // �ϳ� ����� ����
		return temp;
	}
	
	boolean isFull()
	{
		if(top==stack.length-1) 
			return true;
		else
			return false;
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	//���� ���ٰ� ������ ������ �ʱ�ȭ
	public void init()
	{
		top=-1;
	}
	
	public T peak()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return null;
		}
		
		T temp = stack[top]; // �ֻ��� �����͸� ������ - ���� ���� �ֻ��� ������ Ȯ��
		top--;
		return null;
	}
}
