package koreait.day16_interface;

//이 클래스는 2개의 인터페이스를 사용 - 결론: 상속은 다중상속이 불가하지만 인터페이스는 다중구현이 가능하다.
public class MyClassAB implements InterfaceA,InterfaceB{

	//InterfaceA의 추상메소드
	@Override
	public void methodA() {
	}
	@Override
	public int methodB(int num) {
		return 0;
	}
	//InterfaceB의 추상메소드
	@Override
	public void methodBa() {

		
	}
}
