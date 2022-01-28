package koreait.day15;

import java.util.Scanner;

public class TryCatchTest1 {
	//try{...원래해야 할 명령들...}, catch(){...exception발생시 실행할 명령들...} 
	//실행 중에 잘못된 값으로 발생하는 오류 Exception을 처리한다.
	public static void main(String[] args) {
		
		try {
			//테스트2
			String msg = null;
			char temp = msg.charAt(0);
			
			//테스트1
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();	//Excepion 가능성 있음
			System.out.println("a="+a);
		}catch(NullPointerException e1) {	//NullPointerException 발생시에만 처리되는 {}이다.
			System.out.println("NULL 참조");
		
		}catch(Exception e) {	//Exception이 발생한 오류 정보를 객체로 관리하고 참조변수는 e
			//NullPointException을 제외하고 다른 Exception발생시 처리되는 {}이다.
			System.out.println("잘못된 입력입니다.");
		}
		
		System.out.println("프로그램 종료");
		
		
	}
}
