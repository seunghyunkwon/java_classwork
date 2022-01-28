package koreait.day06;

import java.util.Scanner;

public class This {

	int num, korean, english, science;
	String name;
	
	
	Scanner sc = new Scanner(System.in);
	void inputData() {
		//아직 객체가 생성되지 않은 상태이므로 클래스에서 this를 사용합니다. 
		//this는 실행할때 이 메소드를 실행하는 객체가 됩니다. 
		System.out.print("이름 ->  " );  		this.name = sc.nextLine();
		System.out.print("번호 ->  " ); 		this.num= sc.nextInt();
		System.out.print("국어 ->  " ); 		this.korean = sc.nextInt();
		System.out.print("영어 ->  " );		this.english = sc.nextInt();
		System.out.print("과학 ->  " );		this.science = sc.nextInt();
//		sc.close();
	}
	void outputData() {
	System.out.println("번호 :"+ num + ", 이름 :"+ name + ", 국어점수 :"+ korean + ", 영어점수 :"+ english + ", 과학점수 :"+ science);
	}
	int sum() {
		return (korean + english + science);
	}
	//평균(평균 계산하고 결과값 리턴하는 메소드 avg)
	double avg(int cnt) {
		return (double)(sum())/ cnt;
	}
}
