package koreait.day08;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest4 {
	//int값 저장하는 배열을 활용하는 연습(3)
	public static void main(String[] args) {
		int[] scores = new int[20];
		Random r1 = new Random(System.currentTimeMillis());
		
		//배열의 크기는 20, 배열의 값은 난수 1~100 범위값 저장
		
		for(int i=0;i<scores.length;i++) {
			scores[i] = r1.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(scores));
		//값의 분포 개수를 90~100, 80~89, 70~79, 60~69, 50~59,~ 40~49, 40미만의 범위로 출력
		
		//카운트 변수 4개 초기화 - > 분포가 더 다양하다면 더많은 변수가 필요하다.
		//따라서 cnt 변수값도 배열로 사용한다
		int [] cnts = new int [7];
		//위의 분포 순서대로 인덱스를 사용
		
		
		
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>=90)cnts[0]++;
			else if(scores[i]>=80) cnts[1]++;
			else if(scores[i]>=70) cnts[2]++;
			else if(scores[i]>=60) cnts[3]++;
			else if(scores[i]>=50) cnts[4]++;
			else if(scores[i]>=40) cnts[5]++;
			else cnts[6]++;
			
			
		}
		
		//연습문제 - 결과 출력을 반복문으로 수정하기 ( 범위의 숫자들을 수식으로 )
		System.out.println("점수 분포 요약");
		System.out.println("90~100 값의 개수=" + cnts[0]);
		System.out.println("80~89 값의 개수=" + cnts[1]);
		System.out.println("70~79 값의 개수=" + cnts[2]);
		System.out.println("60~69 값의 개수=" + cnts[3]);
		System.out.println("50~59 값의 개수=" + cnts[4]);
		System.out.println("40~49 값의 개수=" + cnts[5]);
		System.out.println("40 미만 값의 개수=" + cnts[6]);
		
		
	}
	
}
