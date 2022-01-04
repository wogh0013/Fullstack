package w1203인터페이스;

interface Calc{
	int add();
	int sub();
	int mul();
	int div();
}

// 일반적으로 implements로 상속받을 때 클래스명 뒤에 Impl을 붙여줌  
class CalcImpl implements Calc{
	int x,y;
	
	public CalcImpl(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public int add() {
		return x+y;
	}

	@Override
	public int sub() {
		return x-y;
	}

	@Override
	public int mul() {
		return x*y;
	}

	@Override
	public int div() {
		return x/y;
	}
}

public class 인터페이스 {
	public static void main(String[] args) {
		Calc data = new CalcImpl(7,9);
		System.out.println(data.add());
		System.out.println(data.sub());
		System.out.println(data.mul());
		System.out.println(data.div());
	}
}
