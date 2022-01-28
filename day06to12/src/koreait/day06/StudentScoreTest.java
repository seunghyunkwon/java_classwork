package koreait.day06;

import java.util.Scanner;

public class StudentScoreTest {
	//StudentScore 클래스 활용
	public static void main(String[] args) {
		//메인 메소드 작성
	//권승현	22.01.05
	
		System.out.println("===StudentScore===");
		
		
		StudentScore k = new StudentScore();
		//Ctrl + Space bar 입력으로 하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : -> ");
		k.name=sc.nextLine();
		System.out.print("번호 : -> ");
		k.num=sc.nextInt();
		System.out.print("국어 : -> ");
		k.korean=sc.nextInt();
		System.out.print("영어 : -> ");
		k.english=sc.nextInt();
		System.out.print("과학 : -> ");
		k.science=sc.nextInt();
		
		k.printScore();
		
		System.out.println("총점은 : -> "+ k.sum());
		
		System.out.println("평균은 : -> "+ k.avg(3));
		//cnt 자리에 값을 입력해야하기에 '3'
		

		
	}
	
}