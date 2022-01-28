package koreait.day08;

public class StringMethod2 {
	//문자열 메소드 연습2
	
	public static void main(String[] args) {
	
		//1.indexOf : contains 처럼 특정 문자열을 찾아서 시작 위치값을 반환
		String msg ="born0725@naver.com";
		System.out.println("naver의 시작 위치:"+msg.indexOf("naver"));
		System.out.println("naver의 시작 위치:"+msg.indexOf("gmail")); //반환값은 ? 해당문자열이 없을 때 -1 반환
		

		msg = "it gmail it gmail";
		System.out.println("마지막 gmail의 문자열의 시작 위치:"+msg.lastIndexOf("gmail"));

		//2. 문자열의 첫 부분 또는 마지막 부분을 검사하는 멧도ㅡ
		System.out.println("gmail으로 시작하는가 ?" + msg.startsWith("gmail"));
		System.out.println("it으로 시작하는가 ?" + msg.startsWith("it"));
	
		System.out.println("mail으로 끝나는가? " + msg.endsWith("mail")); 
		System.out.println("@으로 끝나는가? " + msg.endsWith("@")); 
	
		String temp;
		//3. 문자열 부분적인 추출하기
		msg = "i like java";
		temp = msg.substring(4);
		System.out.println("substring(4):" +msg.substring(4));
		
		temp = msg.substring(4,8);
		System.out.println("substring(4,8):" +msg.substring(4,8));
		
		//문제1) java 추출하려면 substring 메소드 인자는 ?
		temp = msg.substring(7);
		System.out.println("substring(7):" +msg.substring(7));
		//문제2) like 추출하려면 substring 메소드 인자는 ?
		temp = msg.substring(2,6);
		System.out.println("substring(2,6):" +msg.substring(2,6));
		
		//substring을 써서 indexOf의 값을 찾아낸다
		int start = msg.indexOf("like");
		int len = "like".length();
		temp = msg.substring(start,start+len);
		System.out.println("start:"+start+",len:"+len+",추출결과:"+temp);
		
		//4. 문자열 치환하기
		msg = "koreait.2021@gmail.com - 2021";
		temp = msg.replace("2021", "1999");	// 인자가 2개 (첫 번째 인자는 찾는 문자열, 둘 째 인자는 바뀌는 문자열)
		System.out.println("replace 결과:"+temp);
		
		temp = msg.replaceAll("gmail", "daum");
		System.out.println("replace 결과:"+temp);
		//문자열의 문자 개수와 상관없이 치환된다.		
				
		msg = "그는 오늘 치킨을 그녀와 먹는다. 치킨 브랜드는 ...그녀는 비비큐 좋아함 치킨의 재료 원산지는 브라질산이다.";		
		//문제1) msg 문자열에서 "치킨"이 몇 번 나오는지 출력해보기
		
		int idx; // 치킨의 위치 저장
		int cnt=0;
		temp=msg;
		String find = "브라질";
		while (true) {
			idx = temp.indexOf(find);
			if(idx==-1) break;
			cnt++;
			temp = temp.substring(idx+find.length()); //(치킨은 length가 2)->(첫 째 찾은 치킨 뒤부터 문자열을 추출)
			
		}
		System.out.println(find+"을 찾은 횟수:"+cnt);
		
	}
}
