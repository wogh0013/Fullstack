package w1202���;

import java.util.ArrayList;

//�θ�Ŭ���� - �⺻������ Object��� Ŭ������ ������ ��ӹ޴´�.
class Cars{
	int speed;

	//�����ڴ� Ŭ���� ������ �������� �ʱ�ȭ�ϱ� ���� �����.
	//����ڰ� Ŭ������ ���Ǹ� �ϰ� �����ڸ� �� ����� �ý����� �⺻�����ڸ� ���� ȣ���Ѵ�.
	//(��� Ŭ������ �ݵ�� �����ڰ� �ִ�.
	public Cars() {
		//�θ������ ȣ�� - �θ� Object�� Object Ŭ������ �����ڸ� ȣ��(�ϴ� ���� x)
		super();
		System.out.println("parent default constructor");
	}
	
	//�θ�Ŭ������ �����ڸ� ȣ���ϴ� ���� �θ�Ŭ���� �����ڰ� ���� ���� �ϴ� �ϵ� ���Ƽ�, ���߿��� �����ؼ� ȣ���ϰ��� �� ��
	public Cars(int speed) {
		super();
		this.speed = speed;
		System.out.println("parent parameter constructor");
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//equals �Լ��� Object Ŭ������ ������ �Լ��̴�.
	//��ü �� ���� ���� ���� �� equals��� �Լ��� ����ؾ� �Ѵ�.
	//Object o1 = new Object();
	//Object o2 = new Object();
	//if (o1.equals(o2))
	
	//Car c1 = new Car(110);
	//Car c2 = new Car(130);
	//c1.equals(c2)
	
	@Override
	public boolean equals(Object obj) {
		//Car -> Object (��ĳ����)
		Cars temp = (Cars)obj; // Object -> Cars (�ٿ�ĳ����) - ���������� ���ȴ�.
		return this.speed == temp.speed;
	}
}

//�ڽ�Ŭ����
class SportsCar extends Cars{
	boolean turbo; // ���ο� �ʵ� �߰��ϱ�
	
	//��� �����ڴ� Ư���� ������ ������, �θ��� �⺻������(�Ű����� ���� ������)�� ȣ���Ѵ�.
	//�ڽĻ����ڿ��� �θ�����ڸ� ȣ���Ѵ�
	public SportsCar() {
		super(); //�ݵ�� �Լ����� ù ��° ���ο� �����Ѵ�.
		//�θ�Ŭ���� ������ �߿� �����ؼ� ȣ���Ѵ�. ����Ʈ������
		this.turbo=true;
		System.out.println("child default constructor");
	}
	
	public SportsCar(int speed, boolean turbo) {
		super(speed); //�θ�����ڸ� ��� ȣ���� �� �ִ�.
		//this.speed=speed;
		this.turbo=turbo;
		System.out.println("child parameter constructor");
	}
	
	public boolean isTurbo() {
		return turbo;
	}
	
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
}

//�θ�Ŭ���� : Cars
//�ڽ�Ŭ���� : SportsCar
public class ��� {
	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.setSpeed(100);
		System.out.println(c1.getSpeed());
		
		SportsCar sc1 = new SportsCar();
		sc1.setSpeed(140);
		System.out.println(sc1.getSpeed());
		
		sc1.turbo=true;
		System.out.println(sc1.turbo);
		
		System.out.println("------------------------");
		SportsCar sc2 = new SportsCar(160, true);
		
		System.out.println("------------------------");
		
		//�θ�ü�� ������ �ڽİ�ü�� ������ �� ����.
		
		c1 = sc1; //  Car <- SportsCar ��ü�� ������
		          // (�ڽ��� �θ��� ���·� ��ȯ�ȴ�. ��ĳ����(upcasting) - �׻� ���ȴ�)
		
		//sc1 = new Cars(); //�ڽİ�ü ������ �θ�ü ������ ��ģ������ �ȵ�
		//�θ�Ÿ�Կ��� �ڽ�Ÿ������ ����ȯ�ϴ� ���� �ٿ�ĳ�����̶� �ϰ�, ����� �ȵȴ�.
		//sc1 ���忡���� turbo������ �ִµ�, Cars ��ü�� turbo ������ ����.
		//�θ�Ŭ�������� �Ļ��Ǿ� �� �߰��� �� �ڽ�Ŭ�����ϱ� ����
		
		//upcasting(�ڽ�Ÿ�� -> �θ�Ÿ�� ��ȯ) : ������ ���
		//downcasting(�θ�Ÿ�� -> �ڽ�Ÿ�� ��ȯ) : ���x, ���������� ���(by ��������ȯ)
		
		sc1 = (SportsCar)c1; //���� SportsCar -> Cars -> SportsCar�� ���ȴ�. (��������ȯ)
		
		
		//���׸� ������, �ذ� ���� �ڵ��� ���� -> ���� -> ���׸��� �ʿ伺
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add(new Cars(100)); //add�Լ� �ȿ����� Cars��ü�� ObjectŸ������ ��ȯ�ż� ����. -> upcasting
		list.add(new Cars(110));
		list.add(new Cars(120));
		list.add(new Cars(130));
		list.add(new Cars(140));
		
//		list.add(7); // integer, string, sc1 ��� Object�� �ڽ��̹Ƿ� �߱������� ��, Cars�� �ٿ�ĳ�����ؼ� CarsŬ���� �ڽĸ� ����.
//		list.add("flower");
//		list.add(new SportsCar(140, true));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getClass());
			
			//Cars temp = (Cars)list.get(i); // �ٿ�ĳ����
			//System.out.println(temp.getSpeed());
		}
	}
}
