package koreait.day17;

import java.util.Comparator;

public class MemberNameDesending implements Comparator<Member>{
			//멤버 이름 내림차순
	@Override
	public int compare(Member o1, Member o2) {
		
		return o2.getName().compareTo(o1.getName());
	}
}
