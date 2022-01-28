package koreait.day17;

import java.util.Comparator;

public class MemberDesending implements Comparator<Member> {
//Member 클래스의 비교기준을 설정한다.	나이의 내림차순으로 결정

@Override
public int compare(Member o1, Member o2) {
	Integer a = o1.getAge();	//int를 integer타입으로 참조
	Integer b = o2.getAge();
	return b.compareTo(a);		//compareTo는 비교메소드 : 래퍼클래스의 메소드
}
	// a>b : 음수, a==b : 0, a<b : 양수
	
	
	
	
	
}
