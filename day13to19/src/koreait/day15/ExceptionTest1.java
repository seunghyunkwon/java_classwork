package koreait.day15;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// Exception 요약 : 문법오류는 아니지만 실행하면서 발생하는 오류
		//				ㄴ 발생 원인에 따라 해당하는 원인을 지적하는 Exception이 발생하고
		//				ㄴ 이들은 Exception 클래스의 자식 클래스이다.
		//				ㄴ Exception이 실행중 발생하면 그 지점에서 프로그램이 중단된다.
		
		
		//Exception 예시4 :
		//Wraaper클래스(Short,Integer,Double,Long...)에는 문자열을 기본형타입으로 변환하는 메소드가 있다.
		int b = Integer.parseInt("abc"); //Integer.parseInt("123");->정상적으로 실행
		System.out.println("b="+b);		
		double c = Double.parseDouble("123,456,000.123");	//Double.parseDouble("1234.567"); ->정삭적으로 실행
		System.out.println("c="+c);
		//NumberFormatException 발생
		//	ㄴ정수로 변환할 수 없는 문자열이기 때문
		
		
		//Exception 예시3	: 입력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	//키보드 입력을 정수로 변환해서 변수에 저장
		//InputMismatchException 발생
		//	ㄴ이유:입력받을 문자는 정수타입이여야하지만 입력받은 문자의 타입이 다르기때문
		
		
		//Exception 예시2 : 인덱스값
		int[] nums = new int[5];	//배열선언 (주소 5개)
		nums[5]=100;	
		//ArrayIndexOutOfBoundsException 발생
		//	ㄴ이유:인덱스 범위값을 벗어났기 때문
		
		
		//Exception 예시1 : 참조
		String msg = null;
		char temp = msg.charAt(0);	//msg문자열에서 첫번째(0)을 가져온다
		//NullPointerException 발생
		//	ㄴ이유: msg 참조객체가 null이기 때문
		
		
	}
}
