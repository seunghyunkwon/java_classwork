package koreait.day10;

public class MyClass2 {
	//접근 권한 연습
	private int age;		//private	:	다른 클래스에서 사용 못한다.
	String name;			//default	:	다른 패키지에서 사용 못한다.
	public int score;		//public	:	어디서나 사용할 수 있다.
	
	
	//생성자 메소드 : public, default에 따라  접근권한 설정할 수 있다.
	//			기본 접근권한 : public
}
