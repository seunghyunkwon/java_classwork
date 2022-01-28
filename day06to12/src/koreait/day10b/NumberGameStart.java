package koreait.day10b;

import java.util.Scanner;

public class NumberGameStart {
//NumberGame 실행 - 실행기록 저장
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumberGame[] result = new NumberGame[5];
		int k=0;	//result 배열의 인덱스
		
		System.out.println("숫자 맞추기 게임");
		System.out.println("사용자 이름을 입력하세요 : ");
		String gamer = sc.nextLine();

		
		do {	//반복시 k의 인덱스(값) 증가
			NumberGame ng = new NumberGame(gamer);
			int[] numbers = new int[5];
			System.out.println("숫자생성완료[101~200]");
			System.out.println("시작");
			int random = ng.makeNumber(101, 200);
			
			int i = 0;	//numbers 배열(사용자 입력숫자 저장)의 인덱스 

			do {
				System.out.print("입력(기회 :"+(5-i)+"): ");
				numbers[i] = sc.nextInt();
				if (random > numbers[i]) {
					System.out.println("더 큰 값");
				} else if (random < numbers[i]) {
					System.out.println("더 작은 값");
				} else { //random과 number[i]가 같을 때
					ng.setSuccess(true);
				}
				i++;
				if (i == 5) 
					break;
				
			} while (!ng.isSuccess());
			
			//do~while문을 탈출한 방법(정답or오답)에 따른 분류
			ng.setCount(i);
			if(ng.isSuccess()) {
				System.out.println("정답");
				for(int j=0;j<i;j++) {
					System.out.print(numbers[j]);
					System.out.print((j!=(j-1)? ",":" "));
				}
				System.out.println("입력횟수"+ng.getCount()+"회 시도");
			}else {
				System.out.println("끝");
				System.out.println("답은 "+random);
			}
			result[k]=ng;
			k++;	//게임 기록 저장을 위한 인덱스 증가
			if(k==5) break;
			System.out.println("또? 0 입력");
		}while(sc.nextInt()==0);
		//게임 기록 result 배열값 출력		
		System.out.println("기록");
		for(int j=0;j<k;j++)
			result[j].print();
		
		System.out.println("Bye");
		
		
	}
}
