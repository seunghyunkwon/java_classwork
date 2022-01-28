package koreait.day17;

import java.util.ArrayList;
import java.util.List;

public class CompareTest2 {
	//User 객체 5개 생성하여 list에 담아서 sort(null) 해보기
	//User 타입은 비교가능한 객체이다.
	public static void main(String[] args) {
		
		List<User> ulist = new ArrayList<>();

	ulist.add(new User("가나",25));
	ulist.add(new User("나나",20));
	ulist.add(new User("다나",21));
	ulist.add(new User("마나",24));
	ulist.add(new User("사나",23));
	ulist.add(new User("바나",22));
	
	System.out.println("sort 이전"+ulist);
	ulist.sort(null);
	System.out.println("sort 이후"+ulist);
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
