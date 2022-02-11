package db.day03;

public class SingletonObj {
// Singleton 과 static이 똑같은데 why? -> 싱글톤 패턴은 일반적인 클래스의 성격을 갖고 있다.
// 메소드 오버라이드 가능하다.
// 프레임웍에서는 직접 코딩은 하지않아도 된다.			
	
//	1. 자기 자신의 객체를 new연산으로 생성하여 private 접근한정자 변수로 참조한다.
	private static SingletonObj object = new SingletonObj();
	
//	2. 생성자도 private 이다.	-> 다른 클래스에서 new SingletonObj()을 못한다.
	private SingletonObj() {
			
	}
	
//	3. getInstance() 메소드 정의 : 자기 자신의 1번 객체를 리턴한다.
	public static SingletonObj getInstance() {
		return object;
	
	}
	
//	테스트 메소드
	public void print() {
		System.out.println("이 객체는 싱글턴 패턴 객체입니다.");
	}
	
	
}
