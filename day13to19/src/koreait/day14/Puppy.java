package koreait.day14;

public class Puppy extends Animal{

	static final String TYPE = "강아지";
	
	public Puppy() {
	}
	
	public Puppy(String name,String color) {
		super(name,color);
	}
	
	
	@Override
	public void sound() {	//인스턴스 메소드는 현재 객체의 인스턴스 필드값으로 처리한다.
		//추상메소드를 구현한다.
		System.out.println("강아지는 멍멍하고 소리를 냅니다.");
	}
	@Override
	public String toString() {
		return super.toString() + TYPE;	//super는 Animal 클래스 toString
	}
	
	
	
}
