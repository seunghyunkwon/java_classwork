package koreait.day10b;

import java.util.Random;
import java.util.Scanner;

public class Exam {
//	*)질문사항 : 틀린 문제에서 0값 없애는 방법
	public static void main(String[] args) {

		System.out.println("-----------------");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int max = 100;
		int min = 10;
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("시작");
		int[] problem = new int[10];
		int[] num1 = new int[10];
		int[] num2 = new int[10];
		boolean isSucess = false;
		int n1, n2, ans;
		int cnt = 0;
		String sel;
		while (!isSucess) {

			for (int i = 0; i < problem.length; i++) {
				n1 = r.nextInt(max - min + 1) + min;
				n2 = r.nextInt(max - min + 1) + min;
				System.out.println("문제" + (i + 1) + ". " + n1 + "+" + n2 + "=");
				ans = Integer.parseInt(sc.nextLine());
				if (n1 + n2 == ans) {
					cnt++;
				} else {
					num1[i] = n1;
					num2[i] = n2;
				}
			}
			System.out.println("채점합니다. 맞은 갯수" + cnt);
			for (int j = 0; j < problem.length - cnt; j++) {
				System.out.println("틀린 문제" + num1[j] + "+" + num2[j]);
			}
			System.out.println("계속하겠습니까? y or n");
			sel = sc.nextLine();
			if (sel.equals("y"))
				continue;
			else
				break;
		}sc.close();
//		*실행화면*
//		----------------------------------------------
//		빨간펜 수학 2자리 덧셈 문제 풀기
//		--------------------------------------
//		시작합니다
//		문제1. 23+56 = 답 입력->
//		문제2. 33+19 = 답 입력->
//
//		문제10. 28+32 = 답 입력->
//
//		----------------------
//		채점합니다. 맞은 갯수 ... (...점)
//
//		추가기능 : 틀린 문제 다시 보기 (배열), 계속하시겠습니까(반복)
//
//		처리조건 : 문제 숫자들은 난수이고 2자리 숫자로 진행
	}

}
