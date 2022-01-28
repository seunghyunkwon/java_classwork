package koreait.day17;

import java.util.ArrayList;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {
		
		//값의 비교 : 기본형 데이터 외에 객체 타입 비교를 인터페이스를 활용해 본다.
		
		List<Integer> list1 = new ArrayList<>();
		
		List<String> list2 = new ArrayList<>();	//문자열 String 클래스
		
		
		list1.add(34);
		list1.add(67);
		list1.add(15);
		list1.add(56);
		list1.add(45);
		
		System.out.println("sort 이전:"+list1);
		list1.sort(null);	//정렬은 값의 비교가 가능한 데이터이어야한다.
		System.out.println("sort 이후:"+list1);
		
		list2.add("사나");
		list2.add("미나");
		list2.add("다현");
		list2.add("나연");
		list2.add("모모");
		
		System.out.println("sort 이전:"+list2);
		list2.sort(null);	//사전식 정렬(알파벳or가나다순서)
		System.out.println("sort 이후:"+list2);
		
		
		List<Member> list3 = new ArrayList<>();
		
		list3.add(new Member("사나",23));
		list3.add(new Member("가나",23));
		list3.add(new Member("마나",20));
		list3.add(new Member("하나",21));
		list3.add(new Member("자나",29));
		System.out.println("age기준 오름차순");
		System.out.println("sort 이전:"+list3);
//		list3.sort(null);	//오류
		list3.sort(new MemberAsending());
		System.out.println("sort 이후:"+list3);

		System.out.println("");
		
		System.out.println("age기준 내림차순");
		System.out.println("sort 이전:"+list3);
		list3.sort(new MemberDesending());
		System.out.println("sort 이후:"+list3);
		
		System.out.println("");
		
		System.out.println("name기준 오름차순");
		System.out.println("sort 이전:"+list3);
		list3.sort(new MemberNameAsending());
		System.out.println("sort 이후:"+list3);

		System.out.println("");
		
		System.out.println("name기준 내림차순");
		System.out.println("sort 이전:"+list3);
		list3.sort(new MemberNameDesending());
		System.out.println("sort 이후:"+list3);

		
		
		
		
		
	}
}
