package koreait.day03;

import java.util.Scanner;	//java.util 패키지에 Scanner 클래스를 메모리에 로드한다.
						//java.lang 패키지의 클래스들은 기본 클래스 - > import를 하지 않는다.
public class KeyInputTest {	//키보드 입력으로 변수에 값을 저장하는 연습

	public static void main(String[] args) {
		// 키보드 입력은 = 표준 입력 : System 클래스
		// -> 편하게 입력을 처리하기 위해 Scanner 클래스를 사용한다.
		
		
		// 화면출력은 표준 출력 : System 클래스 out 필드를 사용한다.
		System.out.println();
		
		//import를 필요로 한다.
		Scanner sc = new Scanner(System.in); //->외우기
			//sc 는 변수 / 기본형 변수가 아닌 참조형(클래스타임)변수이다.
		
		// 입력을 위한 코드
		// 키보드 입력 -> 변수에 저장
		int data;
		System.out.print("정수값 1개를 입력하세요. -> ");
		data = sc.nextInt();		//입력된 값을 정수로 변환(nextInt메소드)하고 data변수에 저장한다.
		System.out.println("지금 입력하신 값은"+data+"입니다.!");
		
		// 느낌으로 하는 미션... 실수를 입력 받아서 출력(소수점이하 4자리)한다.
		
		double data2;
		System.out.print("\n실수값 1개를 입력하세요. -> ");
		data2 = sc.nextDouble();
		System.out.printf("지금 입력하신 값은 %.4f 입니다.\n",data2);
		
		sc.close();
	}
	//키보드 입력 : 실행을 하면 커서가 보이고, 커서 자리에 입력을 한다.

}
	