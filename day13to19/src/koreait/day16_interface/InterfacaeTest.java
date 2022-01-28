package koreait.day16_interface;

public class InterfacaeTest {

	public static void main(String[] args) {
		//기본적인 방식
		MyClassA my1 = new MyClassA();
		MyClassAB my2 = new MyClassAB();
		
		
		//1. 인터페이스로는 객체생성이 불가하다.
		//2. 인터페이스 타입으로 객체를 참조한다.
		//(인터페이스는 '추상메소드'라는 규칙으로 이것을 구현한 클래는 하나의 타입(그룹)으로 묶을 수 있다.
		
		InterfaceA ia1 = new MyClassA();
		InterfaceA ia2 = new MyClassAB();
		
		InterfaceB ib1 = new MyClassC();
		InterfaceB ib2 = new MyClassAB();
		
		InterfaceA[] aas = new InterfaceA[3];
		
	}
}
