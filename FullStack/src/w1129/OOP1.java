package w1129;

class Person{ // Ŭ������ ù ���ڴ� �빮�� !
	String name; //������� �ʵ� �Ӽ�
	String phone;
	String address;
	int age; //���� �߰��ϱ�
	
	//������ - �޼����� ����, ��ü�� ���� �� �ڵ����� ȣ��
	//�� �޼���� �̸��� �������ִ�. Ŭ������� �����ؾ� ��.
	//�����ڴ� ���ٱ����� public�̾�� ��
	//���������� ������ �� ���� �� ���� �⺻�� �� ���� �־��ְų� ��Ÿ ��� �غ��۾��� �� �� ����
	//�����ڴ� ��Ȳ�� �� ��
	//�����ڴ� ���� �� ���� ���� (�ڹٰ� overloading ����� �־�, �Լ����� ������ ���°� �ٸ� �Լ� ���� �� ���� ����)
	public Person() { // Person �ۡ� = new Person(); �� ������ �����ڰ� ȣ���� ��
		name = "";
		phone = "";
		address = "";
		age = 20;
		System.out.println("�����ڰ� ȣ��Ǿ���");
	}
	
	public Person(String name, int age, String phone, String address) {
		
		//�Ű����� name�� Ŭ�������� name�� ������ ���Ѵ�.
		//this - ������, �� ��, ������ �׳� �ᵵ this �����ڰ� �ִ� �ŷ� �ȴ�.
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		System.out.println("�Ű������� �ִ� �����ڰ� ȣ��Ǿ���");
	}
	
	//�Լ��� �����, �޼���, ����
	void setPerson(String n, String p, String a) {
		name = n;
		phone = p;
		address = a;
	}
	
	void output() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
	}
}


public class OOP1 {
	public static void main(String[] args) {
		//1.��ü �����ϱ�
		Person p1; //��ü �������� ����, null �Ǵ� new Ŭ������()���� �ʱ�ȭ ����
		p1 = new Person(); // heap������ ��ü�� ����� ��ü�� �ּҸ� ����
						   // ���� ��ü�� ���� ������ ���� ��쿡 null���� ��
		p1.name = "����ȣ";
		p1.phone = "010-1234-5678";
		p1.address = "��õ�� ������";
		
		System.out.println(p1.name);
		System.out.println(p1.phone);
		System.out.println(p1.address);
		
		//�迭 - ����, ��ü - ����
		//��ü�迭 - ������ ����
		Person[] persons = new Person[3]; //��ü 3�� ���� �迭�� �ۼ�
		persons[0] = new Person(); //��ü����
		persons[0].name = "ȫ�浿";
		persons[0].phone = "010-0000-0000";
		persons[0].address = "����� ���ʱ�";
		
		System.out.println(persons[0].name);
		System.out.println(persons[0].phone);
		System.out.println(persons[0].address);
		
		persons[1] = new Person();
		persons[1].setPerson("�ڻ���", "010-5678-1234", "���ı�");
		persons[1].output();
		
		//Ŭ������ ���� ���� �� ������ ���� �Ѵ�.
		persons[2] = new Person("jaeho", 26, "010-9756-1474", "�˾�");
		persons[2].output();
		
	}
}
