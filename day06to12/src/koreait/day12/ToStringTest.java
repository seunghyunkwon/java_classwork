package koreait.day12;

public class ToStringTest {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.id=20220100;
		member.name="이모모";
//		member.print();	//지금까지 만들었던 메소드 : 필드 출력용도
		
		System.out.println("toString결과:"+member.toString());
		//재정의(오버라이드)전
		//결과1) : toString결과:koreait.day12.Member@15db9742
		//					(패키지명.클래스명@객체구별값16진수)
		//재정의(오버라이드)후
		//결과2) : toString결과:Member [id=20220100, name=이모모]
		
		System.out.println("toString생략:"+member);
	}
	
}
