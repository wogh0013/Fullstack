package w1203추상클래스;

public class Rectangle extends Shape {
	double width;  //너비
	double height; //높이
	
	//매개변수 생성자 만들음!
	//기본 생성자는 일부러 안 만들었음
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
