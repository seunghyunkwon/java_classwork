package koreait.day04;

import java.util.Scanner;

public class Exam {
	// 예제 : 영화 감상 후기 1~5 평점 입력 -> 방법1)3일때 ★★★, 방법2)★★★☆☆
	public static void main(String[] args) {
		// 방법1)
		System.out.println("영화 감상 후기 1~5 평점 입력");
		Scanner sc = new Scanner(System.in);
		int score = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < score; i++)
			System.out.print("★");

		System.out.println("\n---------");

		// 방법2)
		for (int i = 0; i < score; i++) 
			System.out.print("★");
		
		if (score < 5) {
			for (int j = 0; j < 5 - score; j++)
				System.out.print("☆");
		}
		sc.close();
	}// main end

}
