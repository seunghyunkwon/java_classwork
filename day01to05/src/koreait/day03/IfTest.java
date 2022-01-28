package koreait.day03;

import java.util.Scanner;

public class IfTest { //boolean 자료형과 관계연산을 이용한 조건제어 연습을 한다.

		public static void main(String[] args) {
			//if 문의 형식1 : if(조건관계식) {...A...} else {...B...}
			//	A는 조건관계식이 참일 때 실행하는 명령문들
			//	B는 조건관계식이 거짓일 때 실행하는 명령문들
			//	A,B의 명령문이 1개일 때는 {}는 생략한다.
			
			//응용 : point 가 100점 이상이면 회원등급 VIP, 100점 미만이면 일반회원
			
			int point;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("포인트를 입력하세요. -> ");
			point = sc.nextInt();
			
			//if를 이용
			System.out.print("회원등급 : ");
			if(point >=100)
			 System.out.println("VIP");
			else
			 System.out.println("일반회원");
			
			
			//point가 70  이상이면 + 100을 추가 적립, 70 미만이면 + 110을 추가적립
			//		"	감사합니다.		",			"	또 오세요.		" 메세지 출력
			//실행하는 명령이 2문장 이상일 때 {}를 사용한다.
			if (point >=70) {
			//	point = point + 100;
				point += 100; // 축약연산 ( 변수명이 같을 때 사용 )
				System.out.println("감사합니다.");
			}else {
			//	point = point + 110;
				point += 110;
				System.out.println("또 오세요.");
		}
			System.out.println("현재 포인트 : " + point);
			
			sc.close(); //Scanner 타입 변수 사용 종료
			
		}
}