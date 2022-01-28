package koreait.day07;

import java.util.Scanner;

public class UpperLowerStringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 선언
		String message;
		// 입력 받는값 (변수)
		String uppers = "";
		// 결과값
		String lowers = "";
		// 결과값
		char[] upper = new char[20];
		// upper에 메모리 할당
		char[] lower = new char[20];
		// 메모리 할당
		int k = 0;
		int j = 0;
		//변수선언
		System.out.print("문자열을 입력하세요.(단, 영문자만 사용합니다) - >");
		// 출력문
		message = sc.nextLine();
		// 입력코드

		for (int i = 0; i < message.length(); i++) {
			char temp = message.charAt(i);
			if (temp >= 'A' && temp <= 'Z') {
				upper[k] = temp;
				k++;
			} else if (temp >= 'a' && temp <= 'z') {
				lower[j] = temp;
				j++;
			}
		} // 메인 코드

		uppers = String.valueOf(upper);
		lowers = String.valueOf(lower);
		// 문자로 구분된 친구들 분리하여 다시 문자열로 결합

		System.out.println("\n [[결과]] ");
		System.out.println("대문자 -> " + uppers);
		System.out.print("소문자 -> " + lowers);
		//출력

	}
}
