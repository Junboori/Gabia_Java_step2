package chapter12.clone;

public class ObjectCloneMain_02 {

	public static void main(String[] args) throws CloneNotSupportedException {
	Circle circle=new Circle(10, 20, 30);
	Circle circlecopy=(Circle)circle.clone();
	
	
	System.out.println(circle);
	System.out.println(circlecopy);
	//hashcode
	System.err.println(System.identityHashCode(circle));
	System.err.println(System.identityHashCode(circlecopy));
	}

}
