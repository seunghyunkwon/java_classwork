package koreait.day16_interface;

//이 클래스는 인터페이스(InterfaceA)를 사용한다.
public class MyClassA implements InterfaceA{

	//InterfaceA에 선언된 추상메소드를 구현하는 것이 핵심
	@Override
	public void methodA() {
		System.out.println("MyClassA-methodA 실행");
	}

	@Override
	public int methodB(int num) {
		System.out.println("MyClassA-methodB 실행(arg:"+num+")");
		return num+10;
	}

	
}
