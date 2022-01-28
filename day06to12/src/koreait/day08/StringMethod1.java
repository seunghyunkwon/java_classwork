package koreait.day08;

public class StringMethod1 {
	//charAt(), length() 메소드는 지난 시간 연습
	public static void main(String[] args) {
		
		String msg = "hello, JAVA";
		String temp;
		
		//1. 대소문자 변환 메소드
		temp = msg.toUpperCase();	
		//"HELLO, JAVA" 변환된 문자열을 메모리에 저장. 주소값은 temp에 저장
		System.out.println("대문자 변환 결과:" +temp);
		System.out.println("원본 msg:"+msg); //<---------
		
		temp = msg.toLowerCase();	
		//"hello, java" 변환된 문자열을 메모리에 저장. 주소값은 temp에 저장
		System.out.println("소문자 변환 결과:" +temp);
		System.out.println("원본 msg:"+msg); //ㅣ
		
		msg = "   hi~ ";	
		//msg 변수값이 다른 문자열을 참조 (새로운 문자열의 주소를 저장)
		System.out.println("원본 msg:"+msg);

		
		//2. 공백 제거
		//예를 들면 아이디 입력할 때 포함된 공백을 제거할 수 있다.
		temp = msg.trim();
		System.out.println("trim 결과:"+temp);
		System.out.println("원본 msg:"+msg);
		
		
		//3. 특정문자열 포함 여부 확인한다.
		msg = "born0725@naver.com";
		System.out.println("contains 메소드:"+ msg.contains("naver"));
		System.out.println("contains 메소드:"+ msg.contains("gmail"));
		//boolean형태로 결과값이 도출된다.
		
		
		//4. 전체 문자열이 동일한지 비교 여부 확인한다.
		msg = "momo";
		System.out.println("equals 비교(Momo):"+msg.equals("Momo"));
		System.out.println("equals 비교(Momo):"+msg.equals("momo"));
		System.out.println("equals 비교(Momo ):"+msg.equals("momo "));
		//boolean형태로 결과값이 도출된다.
		
		//5. 문자열 ==로 비교 결과 : 주소 비교 여부 확인한다
		String t1 ="test", t2="java";
		String t3 = new String("test");		//String 객체를 생성하고 문자열을 test
		String t4 ="test";
		
		System.out.println("t1==t2:"+(t1==t2));	//각기 내용이 다른 문자열 비교-> 주소값 다름
		System.out.println("t1==t3:"+(t1==t3));	//t3은 new 연산으로 만들어진 객체를 참조
		System.out.println("t1==t4:"+(t1==t4));	//문자열 내용이 같으면 -> 한번만 메모리에 저장
	
	}
}
