package koreait.day03;

import java.util.Scanner;

public class ElseIfTest {
		public static void main(String[] args) {
			int point;
			Scanner sc = new Scanner(System.in);
			
			//if 문의 형식1 : if(조건관계식1) {...A...} else {...B...}
			//				else if(조건관계식2)
			//				{...B...}	//조건관계식1은 거짓일 때, 조건 관계식2는 참일 때
			//				else
			//				{...C...}	//조건관계식1은 거짓일 때, 조건관계식2는 거짓일 때
			
//응용 : point가 150 이상인 고객은 사과세트를, 100이상 150미만인 고객은 귤세트
//		point가 50이상 100미만인 고객은 과제세트를, 49미만인 고객은 5000원 상품권을 증정
			System.out.print("포인트를 입력하세요. -> ");
			point = sc.nextInt();
			
			
			System.out.print("설날 증성선물 : ");
			if (point >=150) {
				System.out.println("사과세트");
			}else if (point >= 100) {	//150보다 작은경우 두번째 조건식 검사
				System.out.println("귤세트");
			}else if (point >= 50) { 	//100보다 작은경우 세번째 조건식 검사
				System.out.println("과제세트");
			}else 
				System.out.println("5000원 상품권");
			
			sc.close(); //Scanner 타입 변수 사용 종료
			
			//리소스(자원) : 입 출력 클래스는 메모리등 추가적인 자원을 사용하므로 해제가 필요하다.
			
		}
}
