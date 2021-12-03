package w1203�߻�Ŭ����;

import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("rawtypes")
//Comparable - �������̽�, �߻�Ŭ������ �ص��� �߻�ȭ�Ǹ�
class Person implements Comparable {
	String name;
	String phone;
	String address;
	
	public Person(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public int compareTo(Object o) {
		Person temp = (Person)o;
		//this.name�� ���������� temp.name���� �տ� ������ -��
		//this.name�� ���������� temp.name���� �տ� ������ 0
		//this.name�� ���������� temp.name���� �տ� ������ +��
		
		return this.name.compareTo(temp.name);
	}
	
}

public class �߻�Ŭ���� {
	public static void main(String[] args) {
		//LinkedList - ���� ��Ŀ�������� �� �� �߰��� �߰����� �� ArrayList���� ������.
		List<String> list = new LinkedList<String>();
		list.add("������");
		list.add("���̽�");
		list.add("Ȩ����");
		list.add("��īĨ");
		list.add("�����");
		list.add("������");
		list.add("���ڱ�");
		list.add("����Ĩ");
		list.add("�ڰ�ġ");
		
		list.sort(null); // ������ ������ �ÿ�����
		
		for(String s : list)
			System.out.println(s);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("ȫ�浿", "010-0000-0000", "��õ1��"));
		personList.add(new Person("�Ӳ���", "010-0000-0000", "��õ2��"));
		personList.add(new Person("����", "010-0000-0000", "��õ3��"));
		personList.add(new Person("������", "010-0000-0000", "��õ4��"));
		personList.add(new Person("�̼���", "010-0000-0000", "��õ5��"));
		personList.add(new Person("������", "010-0000-0000", "��õ6��"));
		personList.add(new Person("����", "010-0000-0000", "��õ7��"));
		personList.add(new Person("��������", "010-0000-0000", "��õ8��"));
		personList.add(new Person("������", "010-0000-0000", "��õ9��"));
		personList.add(new Person("��ġ��", "010-0000-0000", "��õ10��"));
		
		personList.sort(null);
		
		for(Person s : personList)
			System.out.printf("%s %s %s\n", s.name, s.phone, s.address);
	}
}
