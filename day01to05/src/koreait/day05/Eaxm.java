package koreait.day05;

import java.util.Scanner;

public class Eaxm {
	public static void main(String[] args) {
		System.out.println("-------------");
		System.out.println("[[사용자 패스워드 검사]]");
		System.out.println("1)8글자 이상");
		System.out.println("2)특수문자 1개 이상 포함");
		System.out.println("3)대소문자 1개 이상 포함");
		System.out.println("4)숫자 1개 이상 포함");
		Scanner sc = new Scanner(System.in);
		int upper_cnt = 0; // (대문자)
		int lower_cnt = 0; // (소문자)
		int numberic_cnt = 0; // (숫자)
		int symbol_cnt = 0; // (특수문자)
		String pw = "";
		while (true) {
			System.out.println("사용할 패스워드를 입력하세요.");
			pw = sc.nextLine();
			System.out.println("입력하신 패스워드는 " + pw + "입니다.");
			if (8 > pw.length()) // 1)조건
				System.out.println("1)8글자 이상 입력해야합니다.");
			char check ;
			for (int i = 0; i < pw.length(); i++) {
				check = pw.charAt(i);

				if (check >= 'A' && check <= 'Z') // 'A'~'Z'
					upper_cnt++;
				else if (check >= 'a' && check <= 'z') // 'a'~'z'
					lower_cnt++;
				else if (check >= '0' && check <= '9') // '0'~'9'
					numberic_cnt++;
				else if (check >= 32 && check <= 47 || check >= 58 && check <= 64 || check >= 91 && check <= 96
						|| check >= 123 && check <= 126)
					symbol_cnt++;
				else
					System.out.println("분류: 없음, 알 수 없는 문자: " + check);
			}
			if (upper_cnt < 1)
				System.out.println("3)대소문자 1개 이상 포함해야합니다.");
			if (lower_cnt < 1)
				System.out.println("3)대소문자 1개 이상 포함해야합니다.");
			if (numberic_cnt < 1)
				System.out.println("4)숫자 1개 이상 포함해야합니다.");
			if (symbol_cnt < 1)
				System.out.println("2)특수문자 1개 이상 포함해야합니다.");

			if (pw.length() >= 8 && upper_cnt >= 1 && lower_cnt >= 1 && numberic_cnt >= 1 && symbol_cnt >= 1)
				break;
		} // while end
		String pw2 = "";
		
		while (true) {
			System.out.println("패스워드를 다시 한번 입력하세요.");
			pw2 = sc.nextLine();
			if (pw.equals(pw2)) {
				System.out.println("비밀번호 설정이 완료되었습니다.");
				break;
			} else
				System.out.println("패스워드가 일치하지 않습니다.");
		} // while end
		sc.close();
	}// main end

//		*실행결과 화면*
//	-----------------------------------
//	[[사용자 패스워드 검사]]
//	사용할 패스워드를 입력하세요. -> ex) jungBo1
//	
//	만족하지 않은 조건 1) ~ 4) 내용들을 출력
//	
//	1)	8글자 이상이어야 합니다.
//	2)	특수문자 1개 이상 포함해야 합니다.
//	
//	결과 : 다시 입력하세요.
//	-----------------------------------
//	
//	프로그래밍에 필요한 내용
//	1]	문자열 입력받아서 참조변수 이용하여 저장하기
//	2]	1]번 문자열의 개수 구하기 : 메소드 length()
//	3]	1]번 문자열에서 글자를 1개씩 가져와서 검사하기 : 메소드 charAt() - > 반복작업 필요 (for)문
//	4]	3]번 메소드에서 문자 분류하기 : day4 CharacterTypeTest.java 활용
}
