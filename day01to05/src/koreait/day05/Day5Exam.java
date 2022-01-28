package koreait.day05;

import java.util.Scanner;

public class Day5Exam { // 오늘의 복습문제 구현

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 입력받기 위해 선행 코드
		String pw;
		int upper_cnt = 0; // (대문자)
		int lower_cnt = 0; // (소문자)
		int numeric_cnt = 0; // (숫자)
		int symbol_cnt = 0; // (특수문자)
		boolean isOk = false; // password 규칙에 맞는지 논리값 저장
		String msg = ""; // pw 규칙 불만족 조건 메세지

		// 연산에 사용되는 변수는 반드기 초기값을 저장한다.
		System.out.println("[[사용자 패스워드 검사]]");
		System.out.print("사용할 패스워드를 입력하세요. -> ");

		pw = sc.next(); // 입력

		if (pw.length() < 8) {
			msg = "*) 8글자 이상"; // (변수를 쓸 때는 변수를 선언해야한다)[16번째줄]
		}
		// 추가요구사항 처리를 위한 변수선언
		boolean isUseless = false;

		for (int i = 0; i < pw.length(); i++) { // jungBo@#23일 때 length()메소드는 10(정수값)을 반환한다
//			System.out.println(pw.charAt(i));
			char temp = pw.charAt(i);

			if (temp >= 'A' && temp <= 'Z')
				upper_cnt++; // uppper_cnt = upper_cnt +1; (대문자 개수 증가)
			else if (temp >= 'a' && temp <= 'z')
				lower_cnt++; // (소문자 개수 증가)
			else if (temp >= '0' && temp <= '9')
				numeric_cnt++; // (숫자 개수 증가)
			else if (temp >= 32 && temp <= 47 || temp >= 58 && temp <= 64 || temp >= 91 && temp <= 96
					|| temp >= 123 && temp <= 126) {
				if (temp == '>' || temp == '<' || temp == '(' || temp == ')' || temp == '%' || temp == '\\'
						|| temp == ';')
					isUseless = true;
				else
					symbol_cnt++; // (특수문자 개수 증가)
			}
		}
		// 추가 요구사항 : 사용할 수 없는 기호[ <, >, (, ), ;, %, \, 공백 ]추가하기

		System.out.println("대문자 개수 : " + upper_cnt);
		System.out.println("소문자 개수 : " + lower_cnt);
		System.out.println("숫자 개수 : " + numeric_cnt);
		System.out.println("특수문자 개수 : " + symbol_cnt);

		if (upper_cnt < 1)
			msg += "\n*) 대문자 1개 이상 포함 "; // + 문자열 연결
		if (lower_cnt < 1)
			msg += "\n*) 소문자 1개 이상 포함 ";
		if (numeric_cnt < 1)
			msg += "\n*) 숫자 1개 이상 포함 ";
//		if (!isUseless && symbol_cnt < 1)	// 
		if (symbol_cnt < 1)
			msg += "\n*) 특수문자 1개 이상 포함 ";


		if (isUseless) // 추가요구사항
			msg += "\n*)사용할 수 없는 기호는 > < ( ) ; % \\ 공백 입니다.";

		if (pw.length() >= 8 && upper_cnt >= 1 && lower_cnt >= 1 && numeric_cnt >= 1 && symbol_cnt >= 1 && !isUseless)
			isOk = true;

		System.out.println(msg);
		System.out.println("결과 : " + (isOk ? "사용할 수 있는 패스워드 입니다." : "패스워드 작성 규칙에 맞지 않습니다."));
		// isOk가 참일 때 : 앞에 문자열 출력, 거짓이면 뒤에 문자열 출력
	}
	// 불필요한 변수 사용은 줄이고 반복되는 코드도 없애며 다른 사람이 이해하기 쉬운 코드로 작성
}
