package chapter14.treeset;


//record:멤버 변수선언, 생성자오버로딩 ,getter/setter
public record Employee(String name,int age) {

	@Override
	public String toString() {
		return name+": +age";
	}
	
	

}
