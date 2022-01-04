package ���ȣ��;

//���ȣ�� 
//- �Լ��� �ڱ� �ڽ��� ȣ���Ѵ�.
//- �ڽ��� ������ ȣ�� ���� -> ���� ������ ����ؾ� ��.
//- �ӵ��� ������.
//- ���ð����� �Լ��� ���� ������ ����ž� �Ѵ�.
//- ���ȣ��� ���� �ڵ尡 ����������. (Ʈ�� ��ȸ �˰���, ������)

class Recursive
{
	//1~10���� ���ȣ���
	void display(int limit)
	{
		if(limit==0) return;
		//�Լ��� ȣ���� �� ���� ���̰ų� �ø��ų�
		//��� ������ �����ϸ� ��������

		System.out.println(limit);
		display(limit-1);
	}
	
	void display2(int limit)
	{
		if(limit==0) return;
		//�Լ��� ȣ���� �� ���� ���̰ų� �ø��ų�
		//��� ������ �����ϸ� ��������

		display2(limit-1); // ���� return�� �ȵǰ� ����������
		System.out.println(limit);
	}
	
	// ���丮�� -> 5! = 5*4*3*2*1
	int factorial(int limit)
	{
		if(limit==1)
			return 1;
		else
			return limit * factorial(limit-1);
	}
}
public class ���ȣ�� {
	public static void main(String[] args) {
		Recursive rs = new Recursive();
		rs.display(10); // 10 display(9), 9 display(8)
		rs.display2(10);
		System.out.println(rs.factorial(5));
	}
}
