package w1203�߻�Ŭ����;

public class Rectangle extends Shape {
	double width;  //�ʺ�
	double height; //����
	
	//�Ű����� ������ ������!
	//�⺻ �����ڴ� �Ϻη� �� �������
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void setSurface() {
		this.surface = this.width * this.height;		
	}
	
	@Override
	public void setLength() {
		this.length = (this.width + this.height)*2;
	}
}
