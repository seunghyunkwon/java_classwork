package koreait.day04;

import java.util.Scanner;

public class CharacterTypeTest {
	
		public static void main(String[] args) {	//char ASCII 코드값을 분류한다 (대문자,소문자,숫자 특수기호)
			
			//Scanner로 키보드 입력할 때 문자입력은 없다.
			int ch1;
			Scanner sc = new Scanner(System.in);
			System.out.println("알고 싶은 아스키코드 정수값을 입력하세요. ->");
			
			ch1 = sc.nextInt();
			
			char ch2 = (char)ch1;	//입력받은 정수값을 char로 변환
			
			//요구사항 : 정수값에 해당하는 문자 출력하기. 문자 분류 결과 출력하기.

			if(ch2 >='A' && ch2 <='Z')	//'A'~'Z'
				System.out.println("분류: 대문자, 입력한 아스키코드값 문자 : " + ch2);
			else if (ch2 >= 'a' && ch2 <='z')	//'a'~'z'
				System.out.println("분류: 소문자, 입력한 아스키코드값 문자: " + ch2);
			else if (ch2 >= '0' && ch2 <='9')	//'0'~'9'
				System.out.println("분류: 숫자, 입력한 아스키코드값 문자: " + ch2);
			//분류:특수기호, 범위를 체크하기 (문자 또는 코드값) 코드값 32~47, 58~64, 91~96, 123~126
			else if (ch2 >=32 && ch2 <=47 || ch2 >=58 && ch2<=64
					|| ch2 >=91 && ch2 <= 96 || ch2 >= 123 && ch2 <= 126)
				System.out.println("분류 : 특수문자, 입력한 아스키코드값 문자: " + ch2);
			else 
				System.out.println("분류: 없음, 알 수 없는 문자: " + ch2);
		}

}

//연산자의 우선 순위 : 괄호 없이 여러개의 연산자로 수식을 만들 때  2+3*4/12 : *(곱하기) -> /(나누기) -> +(더하기)
//		기본 규칙:	* 와 / -> + 와 - 같은 우선 순위일 때는 왼쪽에서 오른쪽 순서로 한다.
//		논리 연산:	&&(and) -> ||(or) 순서