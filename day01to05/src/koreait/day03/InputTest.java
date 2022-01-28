package koreait.day03;

import java.util.Scanner;

public class InputTest {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
//			-------------------------------------
	System.out.println("----------------------");
//			[[성적 집계 : 평균과 총점 구하기]]
	System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
//			성적을 입력하세요.
	System.out.print("성적을 입력하세요.\n");
	int korean;
//			국어 ->
	System.out.print("국어 -> ");
	korean = sc.nextInt();
	int english;
//			영어 ->
	System.out.print("영어 -> ");
	english = sc.nextInt();
	int science;
//			과학 ->
	System.out.print("과학 -> ");
	science = sc.nextInt();
//			>>처리되었습니다.
	System.out.println("처리되었습니다.");
//			총점 :
	int sum;
	sum = (korean + english + science);
	System.out.println("총점: " + sum);
//			평균 :
	System.out.printf("평균: %d (%.2f)", sum/3,(double)sum/3);
	
//	double average;
//	average = sum/3;
//	System.out.printf("평균: %.2f\n", average);
//			-------------------------------------
	System.out.println("----------------------");
//			참고 : 총점 = 국어 + 영어 + 과학, 평균 = 총점 / 3 (주의 : 정수타입 / 정수타입의 결과는 정수)
//						평균은 정수값 출력 and 소수점이하 2자리 출력
//			변수명: korean, english, science , sum 4개만 사용하기			
		}
}
