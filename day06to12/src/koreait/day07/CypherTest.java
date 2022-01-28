package koreait.day07;

import java.util.Scanner;

public class CypherTest {
	//연습 예제
	//내용 : 모모가 쯔위에게 메시지를 전달하는데 비밀 메시지로 암호화를 했다.
	//		모모와 쯔위는 암호를 푸는(해독,복호화) key 값으로 7이라는 숫자를 정했다.
	//고대암호: 문자하나+key = ? 새로운 문자 -> 이방법으로 메시지를 암호화 하기
	public static void main(String[] args) {
		//원본메시지 : 키보드 입력
		//암호메시지 : cypherString 을 출력
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String message;
		String cypherString;//암호메시지
		char[] temp;		//초기값 선언과 배열크기 선언 없이 진행
		
		System.out.print("보내고 싶은 원본 메시지를 입력하세요. -> ");
		message = sc.nextLine();
		
		//message를 temp로 변환해서 참조한다.
		temp = message.toCharArray();
		
		//문자 + key 결과값은 temp 배열에 저장한다.
		for(int i=0;i<temp.length;i++) {
		
//			temp[i] = temp[i]+key;
		
			temp[i]+=key;	//축약 연산자는 강제 캐스팅을 하지 않고 연산식 대입이 가능하다
		}
		System.out.println(temp);
		
		
		//추가 기능 : temp 문자배열을 문자열로 변환 참조
		cypherString = String.valueOf(temp);	//String.valueof 메소드는 여러타입 데이터를 문자열로 변환
		System.out.println("암호 메시지: " +cypherString);	//p'sprl'qh}h
		
		
		
	}
}
