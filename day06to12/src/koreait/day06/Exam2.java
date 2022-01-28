package koreait.day06;

import java.util.Scanner;

public class Exam2 {
//	클래스를 자유롭게 테스트하기	
//	StudentScoreTest 클래스에 main메소드 작성해서 진행
//	작성자명 작성
//*sum,avg 메소드와 같이 리턴값이 있는 메소드에서는 출력문을 가급적 만들지 않는다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int korean;
		int english;
		int science;

		String name;
		
		Exam ex = new Exam();
		
		System.out.print("번호 :");
		ex.num = Integer.parseInt(sc.nextLine());
		System.out.print("이름 :");
		ex.name = sc.nextLine();
		System.out.println("국어점수 :");
		ex.korean = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수 :");
		ex.english = Integer.parseInt(sc.nextLine());
		System.out.println("과학점수:");
		ex.science = Integer.parseInt(sc.nextLine());
		
		ex.printScore();
		
		ex.sum();
		ex.avg(3);
		System.out.print("총점:"+ex.sum());
		System.out.printf("평균: %.2f",ex.avg(3));
	}
}
