package chapter12.clone;

public class Circle implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	Point point;
	 int radius;
	public Circle(int x, int y, int radius) {
		point =new Point(x, y);
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}
	
	

}
