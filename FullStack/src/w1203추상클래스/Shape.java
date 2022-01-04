package w1203추상클래스;

public abstract class Shape {
	
	double surface; //면적
	double length;  //둘레
	
	public abstract void setSurface();
	public abstract void setLength();
	
	public double getSurface() 
	{
		return surface;
	}
	
	public double getLength() 
	{
		return length;
	}
	
}

