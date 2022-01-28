package koreait.day13;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class TodayMenu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
			//Value 투표수 카운트하고 저장
		System.out.println(map);
		System.out.println("투표");
		String foods="오늘의 저녁 메뉴: 치킨, 떡볶이, 곱창전골, 오징어물회, 불고기";

		map.put("치킨", 0);
		map.put("떡볶이", 0);
		map.put("곱창전골", 0);
		map.put("오징어물회", 0);
		map.put("불고기", 0);
		
		while(true) {
			int temp;
			System.out.println(foods);
			System.out.print("선택하신 메뉴 음식명 입력하세요. (종료:end) : ");
			String menu = sc.nextLine();
			//문자열 동등비교 메소드 equals
			if(menu.equals("end"))
				break;
			if(map.containsKey(menu)==false) {//키값으로 없는 문자열이 입력된 경우
				System.out.println("없는 메뉴입니다.");
				System.out.println("메뉴에 추가되었습니다.");
				//continue;
				map.put(menu, 1);
				foods +=","+menu;
				
			} else {
			
			//입력한 메뉴가 key값이다. 해당 key의 value 값을 +1 증가시키고 그 값을 map에 반영한다.	
			temp = map.get(menu);	//temp++;
			//map.put(menu, temp++); 
			//	temp 값을 put메소드 에 저장하고 temp +1증가
	
			map.put(menu, ++temp);	//이미 있는 key의 value 값을 변경
			//	temp +1증가하고 temp값을 put메소드에 저장
			//결론: ++또는--연산은 다른 메소드 또는 연산자 또는 출력문...과 같이 쓰일 때
			//		위치에 따라 먼저 또는 나중에 실행
			//	++가 앞에 위치한 경우 (전치,prefix)/++가 뒤에 위치한 경우 (후치,postfix)
			}
			System.out.println("현재 투표현황: "+map);
		}
		
		System.out.println("투표종료");
		System.out.println("최대 득표수 : "+Collections.max(map.values()));	//value 중에 최대값
		System.out.println("테스트 : "+Collections.max(map.keySet()));	//key 값 정렬시 최대값
		
		//Collections의 종류 : List(ArrayList), Map(HashMap,TreeMap), Set(HashSet)
	}
}
