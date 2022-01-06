package w1202싱글톤;

class Singleton{
	//싱글톤 : 객체를 하나만 만드는 클래스 설계기법 
	//DB할 때는 싱글톤을 만들어야 한다 !
	
	//1. private 생성자를 만들어, 클래스 밖에서 객체를 생성하는 것을 막는다.
	private Singleton() {}
	
	//2. 객체 참조를 저장할 변수
	private static Singleton inst = null; 
	
	//3. 객체 참조를 반환할 static 메서드
	public static Singleton getInstance() {
		if(inst==null)
			inst = new Singleton();
		return inst;
	}
	int x; //공유자원
}


public class SingletonMain {
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		s.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.x);
		
		
	}
}
