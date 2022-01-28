package koreait.day13;

import java.util.HashMap;
import java.util.TreeMap;

//ArrayList : 순차적(인덱스로 접근)으로 데이터를 관리하는 자료구조	(배열과 유사한 구조)
//HashMap	: 순차적인 구조가 아니다. 인덱스가 없고 Key 값을 이용하여 데이터에 접근하며 저장/읽기 한다.
//			: 검색이 많은 알고리즘에 유용하다.

//위 2가지의 클래스는 제너릭 타입<> 기호안에 표시한다. HashMap은 K:key, V:value 한묶음
//			   제너릭 타입은 int,long,double 기본형 타입 대신 래퍼(wrapper)클래스로 표기

public class HashMapTest {

	public static void main(String[] args) {
		
//		HashMap<String, Integer> map = new HashMap<>();
		//Key: String 타입, Value: Integer 데이터
		
		TreeMap<String, Integer> map = new TreeMap<>();
		//key값으로 오름차순 정렬이 가능한 Map
		
		//1.데이터 저장
		map.put("돼지국밥", 9000);
		map.put("스파게티", 13000);
		map.put("불고기", 15000);
		map.put("곱창전골", 20000);
		map.put("백반", 7000);
		
		System.out.println(map);	//toString 재정의(오버라이드)되어있다.
		
		//2.데이터 읽어오기
		System.out.println("Key:곱창전골의 가격 = "+map.get("곱창전골")+"원");
		System.out.println("Key:삼겹살의 가격 = "+map.get("삼겹살")+"원");
		//Key 값으로 가져올 값이 없으면 결과(return) null이다.

		String key="백반";
		System.out.println("Key:"+key+"의 가격 = "+map.get(key)+"원");
	
		map.put("돼지국밥", 8000);		//실행결과 : Value가 변경된다.
		System.out.println(map);	//key값은 유일하다
		
		map.remove("불고기",10000);
		//key,value 모두 일치할 때 제거
		System.out.println("삭제결과:"+map);
		
		map.remove("불고기",15000);
		System.out.println("삭제결과:"+map);
		
		int temp = map.remove("백반");
		System.out.println("삭제결과 리턴값:"+temp);	//삭제된 key의 value값이 반환
		System.out.println("삭제결과:"+map);
	}
}
