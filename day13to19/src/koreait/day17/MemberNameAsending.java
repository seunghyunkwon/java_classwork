package koreait.day17;

import java.util.Comparator;

public class MemberNameAsending implements Comparator<Member>{
			//멤버이름 오름차순
	@Override
	public int compare(Member o1, Member o2) {
		String a = o1.getName();
		String b = o2.getName();
		
		return a.compareTo(b);
	}
}
