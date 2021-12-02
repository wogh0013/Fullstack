package w1202���;

//�θ�Ŭ����
class Cars{
	int speed;

	public Cars() {
		super();
		System.out.println("parent default constructor");
	}

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
	
}

class SportsCar extends Cars{
	boolean turbo; // ���ο� �ʵ� �߰��ϱ�
	
	//��� �����ڴ� Ư���� ������ ������, �θ��� �⺻ ������(�Ű����� ���� ������)�� ȣ���Ѵ�.
	//�ڽ� �����ڿ��� �θ� �����ڸ� ȣ���Ѵ�
	public SportsCar() {
		super(); //�ݵ�� �Լ����� ù ��° ���ο� �����Ѵ�.
		//�θ�Ŭ���� ������ �߿� �����ؼ� ȣ���Ѵ�. ����Ʈ������
		this.turbo=true;
		System.out.println("child default constructor");
	}
	
	public SportsCar(int speed, boolean turbo) {
		super(speed); //�θ� �����ڸ� ��� ȣ���� �� �ִ�.
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
		
	}
}
