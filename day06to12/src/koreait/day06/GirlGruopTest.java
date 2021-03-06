package koreait.day06;

import java.util.Scanner;

public class GirlGruopTest {
	
	public static void main(String[] args) {
		//GirlGroup 클래스를 활용합니다.
	
		System.out.println("static 필드값 확인");
		System.out.println("성별 = " + GirlGroup.GENDER);
		
		System.out.println("2.객체 생성합니다.");
		GirlGroup brave = new GirlGroup();	//객체 생성 : 객체는 클래스의 인스턴스(복사본)
		brave.year = 2011;
		brave.team_eng = "Brave Girls";
		brave.team_kor = "브레이브 걸스";
		brave.numbers = 4;
		
		GirlGroup aespa = new GirlGroup();
		aespa.year = 2020;
		aespa.team_eng = "aespa";
		aespa.team_kor = "에스파";
		aespa.numbers = 4;
		
		//객체의 필드값 출력 - > infoprint() 메소드
		brave.infoPrint();
		aespa.infoPrint();
		
		System.out.println("브레이브걸스 년차 : " + brave.yearth(2022));
		System.out.println("에스파 년차 : " + aespa.yearth(2022));
	
		
		GirlGroup stacy = new GirlGroup();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("그룹명(한글) - > ");
		stacy.team_kor = sc.nextLine();
		
		System.out.print("그룹명(영문) - > ");
		stacy.team_eng = sc.nextLine();
		
		System.out.print("멤버 인원 - > ");
		stacy.numbers = sc.nextInt();
		
		System.out.print("데뷔 년도 - > ");
		stacy.year = sc.nextInt();		//nextInt()는 인스턴스 메소드 -> 객체참조변수.메소드명 으로 실행한다.
//		stacy.year = Integer.parseInt(sc.nextLine());	//문자열을 정수로 변환
		
		stacy.infoPrint();
		
	}

}
