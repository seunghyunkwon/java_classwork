package koreait.day07;

import java.util.Random;

public class RandomTest {
	//Random : 임의의, 아무거나 - > 컴퓨터가 만들어주는 임의의 값들을 생성
	
	//프로그래밍(테스트)에 필요한 데이터 : 정수값 데이터 1) 변수 초기화 2) 키보드 입력
	//			- > 3) 많은 양의 데이터는 random 기능을 이용합니다.
	public static void main(String[] args) {
		// Random 클래스를 활용합니다.
		Random r1 = new Random();	//Random 클래스의 객체를 생성, r1은 객체의 참조값(주소)저장
		Random r2 = new Random();
		
		System.out.println("r1\t\t\tr2");
		for(int i=0;i<10;i++) {
		int temp = r1.nextInt();		//난수 int값을 리턴한다.
			System.out.print(temp + "\t\t");
			System.out.println(r2.nextInt(100));	//0~99 범위의 난수
		}
		
		//1~46 범위의 난수 10개
		System.out.println("1~46 범위의 난수");
		for(int i=0;i<10;i++) {
			
			System.out.println(r2.nextInt(46)+1);		
		}
			
		
	}
}
