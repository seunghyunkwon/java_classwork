package koreait.day17;

import java.util.Comparator;

public class MemberAsending implements Comparator<Member> {
//Member 클래스의 비교기준을 설정한다.	나이의 오름차순으로 결정

@Override
public int compare(Member o1, Member o2) {
	Integer a = o1.getAge();	//int를 integer타입으로 참조
	Integer b = o2.getAge();
	//나이가 같을 때 (기본은 데이터 입력순서) 이름순서로 하고 싶다면
	if(a==b)
		return o1.getName().compareTo(o2.getName());
	else
	return a.compareTo(b);		//compareTo는 비교메소드 : 래퍼클래스의 메소드
}
	// a>b : 양수, a==b : 0, a<b : 음수
	
	//list에 저장된 데이터를 정렬하는 것은 sort 메소드가 한다.
	//sort(정렬)알고리즘 : 비교와 교환이다.
	//기본형 타입 데이터와 String은 이미 비교 기준이 정해져있다.
	//다른 타입 객체들은 비교 기준만 알려주면 된다. (Comparator 인터페이스의 compareTo 메소드이다)
	// -> sort 메소드의 인자로 전달 
	
	
	
}
