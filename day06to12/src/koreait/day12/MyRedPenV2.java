package koreait.day12;

import java.util.Scanner;

public class MyRedPenV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char op;
		do {
			System.out.print("연산입력 ->");
			op = sc.nextLine().charAt(0);
			// charAt(0) 메소드로 입력받은 문자열의 첫번째 문자를 저장
			if (op == '0') {	//종료조건을 먼저 검사하기
				System.out.println("프로그램 종료");
			} else if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("잘못된 선택입니다.");
				continue;
			} else {
				MathProblem p1 = new MathProblem(op);
				p1.makeProb();
//				p1.print();
				System.out.println(p1);
				System.out.println("정답:" + p1.showAnswer());
			}
		} while (op != '0');
		System.out.println("End");
	}
}
