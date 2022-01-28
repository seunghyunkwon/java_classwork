package koreait.day03;

import java.util.Scanner;



public class Exam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("[[성적 집계: 평균과 총점 구하기]]");
		System.out.println("성적을 입력하세요.");
		System.out.println("국어 :");
		int korean = Integer.parseInt(sc.nextLine());
		System.out.println("영어 :");
		int english = Integer.parseInt(sc.nextLine());
		System.out.println("과학 :");
		int science = Integer.parseInt(sc.nextLine());
		
		System.out.println(">>처리되었습니다.");
		int sum=korean+english+science;
		System.out.println("총점 :"+sum);
		System.out.printf("평균 : %.2f",(double)sum/3);
		
	}
	
//	** 실행화면 **
//	-------------------------------------
//	[[성적 집계 : 평균과 총점 구하기]]
//	성적 입력하세요.
//	국어 :
//	영어 :
//	과학 :
//	
//	>>처리되었습니다.
//	총점 :
//	평균 :
//	-------------------------------------
//	참고 : 총점 = 국어 + 영어 + 과학, 평균 = 총점 / 3 (주의 : 정수타입 / 정수타입의 결과는 정수)
//				평균은 정수값 출력 and 소수점이하 2자리 출력
//	변수명: korean, english, science , sum 4개만 사용하기
}
