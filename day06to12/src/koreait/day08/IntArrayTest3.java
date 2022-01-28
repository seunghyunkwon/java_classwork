package koreait.day08;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest3 {
	//int값 저장하는 배열을 활용하는 연습(2)
	public static void main(String[] args) {
		int[] scores = new int[20];
		Random r1 = new Random(System.currentTimeMillis());
		
		//배열의 크기는 20, 배열의 값은 난수 1~100 범위값 저장
		
		for(int i=0;i<scores.length;i++) {
			scores[i] = r1.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(scores));
		//값의 분포 개수를 90~100, 80~89, 70~79, 70미만의 범위로 출력
		
		int cntA=0; //90~100
		int cntB=0; //80~89
		int cntC=0; //70~79
		int cntD=0; //70미만
		//20개 배열의 값 중에서 70이상의 값을 검색 - 인덱스, 값 출력
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>=90)cntA++;
			else if(scores[i]>=80) cntB++;
			else if(scores[i]>=70) cntC++;
			else cntD++;
			
			
		}
		System.out.println("점수 분포 요약");
		System.out.println("90~100 값의 개수=" + cntA);
		System.out.println("80~89 값의 개수=" + cntB);
		System.out.println("70~79 값의 개수=" + cntC);
		System.out.println("70미만 값의 개수=" + cntD);
		
		
	}
	
}
