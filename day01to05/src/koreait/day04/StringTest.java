package koreait.day04;

import java.util.Scanner;

public class StringTest {	//문자열 다루는 클래스 String을 연습한다.

		public static void main(String[] args) {
			
			System.out.println("Hi Java");	//문자열 리터럴 "Hi Java" -> 첫 날 수업
			
			//문자열을 변수로 지정하고 싶다. 그러나 문자열은 int, double처럼 기본형식이 없고 클래스가 있다.
			
			//name 변수는 int, double과 같이 기본형 타입이 아닌 *클래스 타입(참조타입) 변수이다.
			String name = "kwon";
			System.out.println("name = " + name); //문자열 + 연산은 문자열과의 연결연산이다.
			
			name = "seunghyun";
			System.out.println("name = " + name);
			
			
			//String 타입의 객체로 실행하는 메소드
			System.out.println(name.length());		
			//9  - > int 타입 반환, 문자열의 크기
			
			System.out.println(name.charAt(0));		
			//s  - > char 타입 반환, 지정된 위치의 문자
			System.out.println(name.charAt(1));		
			//e
			System.out.println(name.charAt(2));		
			//u
			char result = name.charAt(5); //charAt 메소드의 char 반환값 저장을 위한 변수 선언
			System.out.println(result);
			System.out.println(name.equals("kwon"));		
			//false - > boolean 타입 반환, name이 참조하는 문자열과 같은지 비교
			System.out.println(name.equals("seunghyun"));	
			//true  
	
		//문자열 입력
			Scanner sc = new Scanner(System.in);
			String nickname;	//String 타입의 객체 즉 문자열을 참조하는 변수
			System.out.print("닉네임을 입력하세요. -> ");
		
//			nickname = sc.next(); //키보드로 입력 받은 문자열을 메모리에 저장하고 그 주소를 nickname이 참조합니다
			nickname = sc.nextLine();
			//next() 메소드는 공백 또는 Enter까지만 저장한다.
			//nextLine() 메소드는 Enter 이전까지만 저장한다.
			
			System.out.println("nickname = " + nickname);
			System.out.println("nickname length = " + nickname.length());
			System.out.println("nickname equals = " + nickname.equals("James"));
			System.out.println("문자열 일부 추출 = " + nickname.substring(4)); // 4번째 위치부터 끝까지 (4~end)
			System.out.println("문자열 일부 추출 = " + nickname.substring(4,6)); // 4번째 위치부터 6번째 이전까지 (4~5)
		
			sc.close();
			
			
		}
}
