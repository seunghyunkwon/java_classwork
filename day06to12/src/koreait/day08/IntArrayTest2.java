package koreait.day08;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest2 {
	//IntArrayTest 첫번째 예제는 day7 프로젝트
	//int값 저장하는 배열을 활용하는 연습(1)
	public static void main(String[] args) {
		int[] scores = new int[20];
		Random r1 = new Random();
		
		//배열의 크기는 20, 배열의 값은 난수 1~100 범위값 저장
		
		for(int i=0;i<scores.length;i++) {
			scores[i] = r1.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(scores));

		int cnt=0; //카운트 변수 (조건에 부합되는 경우 증가)
		//20개 배열의 값 중에서 70이상의 값을 검색 - 인덱스, 값 출력
		for(int i=0;i<scores.length;i++) {
			//scores[0], scores[1], scores[2], ... scores[19] 각각의 값이 70보다 큰 값을 확인
			if(scores[i]>=70) {
				System.out.println("i=" + i + "\t점수=" + scores[i]);
				cnt++;
			}
			
			
		}
		//70이상인 값의 개수 출력
		
		System.out.println("70이상 값의 개수=" + cnt);
		
		
	}
	
}
