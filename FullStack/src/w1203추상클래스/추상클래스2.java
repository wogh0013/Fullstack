package w1203추상클래스;

//자바는 하나의 클래스만 상속받을 수 있다. 다중상속 불가 !
//추상클래스도 마찬가지다.
//추상클래스에서 인터페이스가 빠져나온다.
public class 추상클래스2 {
	public static void main(String[] args) {
		
		//Rectangle
		Shape shape1 = new Rectangle(8, 7);
		
		shape1.setSurface();
		shape1.setLength();
		
		System.out.println(shape1.getSurface());
		System.out.println(shape1.getLength());
		
		//Circle
		shape1 = new Circle(7);
		
		shape1.setSurface();
		shape1.setLength();
		
		System.out.println(shape1.getSurface());
		System.out.println(shape1.getLength());
		
		
		//Triangle
		shape1 = new Triangle(7, 5);
		
		shape1.setSurface();
		shape1.setLength();
		
		System.out.println(shape1.getSurface());
		System.out.println(shape1.getLength());
	}
}


//Shape를 상속받아서 Circle 만들기