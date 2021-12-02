package w1202상속;

//부모클래스
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
	boolean turbo; // 새로운 필드 추가하기
	
	//모든 생성자는 특별한 조건이 없으면, 부모의 기본 생성자(매개변수 없는 생성자)를 호출한다.
	//자식 생성자에서 부모 생성자를 호출한다
	public SportsCar() {
		super(); //반드시 함수에서 첫 번째 라인에 생성한다.
		//부모클래스 생성자 중에 선택해서 호출한다. 디폴트생성자
		this.turbo=true;
		System.out.println("child default constructor");
	}
	
	public SportsCar(int speed, boolean turbo) {
		super(speed); //부모 생성자를 골라서 호출할 수 있다.
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

public class 상속 {
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
