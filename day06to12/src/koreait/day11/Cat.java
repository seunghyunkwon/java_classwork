package koreait.day11;

public class Cat extends Animal{

	public Cat() {
		
		//생략된 실행명령은 ? -> super()
	System.out.println("야용이가 생성되었습니다.");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹야옹 웁니다."+ getname());
	}
}
