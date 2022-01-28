package koreait.day03;

import java.util.Scanner;

public class BooleanTest { // boolean 자료형을 연습한다.
	//boolean 자료와 관련된 주요 연산은 관계연산(비교)이다.
	//관계연산자 : > , < , >= , <= , == , !=
	//관계연산의 결과는 : 맞다 (참, true) 틀리다 (거짓, false)

		public static void main(String[] args) {
			
			boolean result; // true 또는 false 가 저장된다.
			
			result = 10 > 5;
			System.out.println("결과: " + result);
			
			result = 10 != 10;
			System.out.println("결과: " + result);
			
			int data;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("비교할 값 입력 >>> ");
			data = sc.nextInt();
			//boolean 출력은 %s ( printf 사용시 )
			System.out.printf("비교 결과 data >=50 : %s\n", data>=50);
		}
}
//응용 : 입력된 data 값이 50보다 작으면 포인트를 50을 적립해준다.
//					50보다 크거나 같으면 포인트를 10을 적립해준다.