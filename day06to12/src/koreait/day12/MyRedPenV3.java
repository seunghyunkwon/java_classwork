package koreait.day12;

import java.util.ArrayList;

import java.util.Scanner;

public class MyRedPenV3 {

	public static void main(String[] args) {
		ArrayList<MathProblem> addList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 맞은 갯수 카운트
		int ans;

		System.out.println("---------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기2");
		System.out.println("---------------------");

		for (int i = 0; i < 3; i++) {

			MathProblem p1 = new MathProblem('+');
			addList.add(p1);
			p1.makeProb();
			// 문제 만드는 메소드 : 연산 종류에 따라 숫자가 다른 범위 난수로 만들어진다.
			System.out.print("문제:" + p1 + ", 답 입력->");
			ans = sc.nextInt();
			if (ans == p1.showAnswer()) {
				cnt++;
				p1.setCorrect(true);
			}
		} // for end
		System.out.println("----------------------");
		System.out.println("채점합니다. 맞은 갯수:" + (cnt) + " (" + cnt * 20 + "점)");
		System.out.println("----------------------");
		System.out.println("틀린 문제 다시보기");
		for(MathProblem prob : addList) {
			if(!prob.isCorrect())
			System.out.println(prob+" 정답 : "+prob.showAnswer());
		}
		

	}
}
