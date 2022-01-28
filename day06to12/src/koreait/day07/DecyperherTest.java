package koreait.day07;

import java.util.Scanner;

public class DecyperherTest {
	//연습 예제
	//내용 : 쯔위가 모모에게 메시지를 전달받은 비밀 메시지로 해독 하려고한다. 약속된 key값 (7)을 알고 있다.
	//전달 받은 내용 : p'sprl'qh}h
	public static void main(String[] args) {
		//static 메인 입력
		Scanner sc = new Scanner(System.in);
		//입력 받기 위한 코드
		int key = 7;
		//약속된 암호값
		String CypherString;
		//받은 내용
		String DecypherString; //"";
		//해석해야 할 내용
		char[] temp;
		//문자(char)의 길이(크기)를 위한 코드
		//*char[] 배열의 사용 없이 하는 방법 
		//1) 메시지 초기화 -> 2)각각의 단어들에 key값 더하기 -> 3) 입력코드 -> 4) 데이터값이 커진다
		System.out.print("받은 메시지를 입력하세요: ");
		//출력문
		CypherString = sc.nextLine();
		//메시지 입력 코드
		temp = CypherString.toCharArray();
		//char[] 메시지 내용(문자열)을 문자로 나열한다.
		for(int i=0;i<temp.length;i++)
			temp[i]-=key;	
		//나열된 각각의 문자들에게 (i) key(7)값을 빼는 코드
		//2)cyperString.charAt(i) + key 코드 입력으로 각각 단어 뽑아내기 가능하다.
		//3)DecypherString+=(cypherString.charAt(i) + key)
		//4) "" + 'i' + "" + 'i' ...
		DecypherString = String.valueOf(temp);
		//전달 받은 문자들(temp)''을 다시 문자열""로 변경해주는 코드
		System.out.println("해독된 메시지: " +DecypherString);
		//출력문
	
	}
//					핵심 point
//String 을 char[] 배열로 변환  - 문자열.toCharArray();
//char[] 배열을 Sting 으로 변환 - String.valueOf(문자배열);
	
}
