package ����;

//��ü���� ���α׷��ֿ��� �����ϴ� Ŭ���� ����⿡ ������
//������ push() ���ÿ� �����͸� �ϳ� �ִ´�
//		pop()  ������ �� ������ ������ �ϳ��� ������ ��ȯ�Ѵ�.
//		isEmpty() ������ ��� true, �ƴϸ� false ��ȯ
//		isFull() ������ �� ���� true, �ƴϸ� false�� ��ȯ
//		peak() ������ �ֻ��� �����͸� ��ȯ
public class Stack {
	private int stack[];
	private int top; //�迭�� �ε���
	
	public Stack()
	{
		stack = new int[10];
		top=-1; // ������ ����ִ� ��Ȳ
	}
	
	public Stack(int size)
	{
		if(size<10)
			size=10;
		stack = new int[size];
		top=-1; //������ ����ִ� ��Ȳ
	}
	
	public void push(int a)
	{
		if(isFull()) { // ����ó���� ���ʿ��� �ϸ� �Լ��� �������
			return;	   // �Լ��� �����Ѵ�. void�� ���� return;
		}
		top++;
		stack[top]=a;
	}
	
	public int pop()
	{
		if(isEmpty()) {
			return -1; // �Լ��� return�� �ؾ� �ϴµ� ���� ���� ���� ����
					   // -1�� ������ �� �Ϲ����̴�.
					   // ��ó�� void�� ���� �׳� return
					   // ������ ���⼱ int�� ��ȯ�̹Ƿ� -1�� return�ع�����.
		}
		int temp = stack[top];
		top--;
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
}
