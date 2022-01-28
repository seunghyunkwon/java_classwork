package koreait.day07;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String odd_String="";
		String even_String="";
		char[] src;
		System.out.println("----------");
		System.out.println("문자열을 입력하세요");
		String src_String = sc.nextLine();
		src = src_String.toCharArray();
		
		for(int i=0;i<src_String.length();i++) {
			if(i%2==0) 
				even_String += src[i];
			else
				odd_String += src[i];
		}
		System.out.println("짝수"+even_String);
		System.out.println("홀수"+odd_String);
		
		sc.close();		
	}
//	*오늘의 문제*	예시)twicemomonayeon
//내용 : 문자열을 입력 받고 그 문자열을 2개로 만든다. 입력문자열은 src_String 변수
//	- 짝수번째 글자(문자)를 순서대로 모아서 1개 문자열 생성 even_string 변수
//		tieooaen
//	- 홀수번째 글자(문자)를 순서대로 모아서 1개 문자열 생성 odd_string 변수
//		wcmmnyo
//처리 조건 : char[] 문자배열 또는 String 클래스의 charAt 메소드 중 한 가지 방법을 사용한다.
//
//*실행화면*
//---------------------------
//문자열(공백과 기호,숫자 포함)을 입력하세요.->
//
//[[결과]]
//짝수문자열 ..............
//홀수문자열 ..............
}
