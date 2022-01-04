package w1203추상클래스;

public class Circle extends Shape {

	final double PI = Math.PI;
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void setSurface() {
		this.surface = PI * this.radius * this.radius;
	}

	@Override
	public void setLength() {
		this.length = 2 * PI * this.radius;
	}

}
