package w1203�߻�Ŭ����;

//�ڹٴ� �ϳ��� Ŭ������ ��ӹ��� �� �ִ�. ���߻�� �Ұ� !
//�߻�Ŭ������ ����������.
//�߻�Ŭ�������� �������̽��� �������´�.
public class �߻�Ŭ����2 {
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


//Shape�� ��ӹ޾Ƽ� Circle �����