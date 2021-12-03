package w1203추상클래스;

public class Triangle extends Shape {
	
	double side;
	double height;
	
	public Triangle(double side, double height) {
		this.side = side;
		this.height = height;
	}
	
	@Override
	public void setSurface() {
		this.surface = this.side * this.height / 2;
	}
	
	@Override
	public void setLength() {
		this.length = 3 * this.side;
	}

}
