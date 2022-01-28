package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		System.out.println("-------------");
		System.out.println("숫자맞추기 게임");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 299;
		int min = 101;
		int num = r.nextInt(max - min + 1) + min;
		int temp =0;
		boolean isOk=false;
		System.out.println("숫자 생성 완료 101~299");
		System.out.print("생각되는 숫자를 입력하세요.");
		int cnt = 0;

		while (!isOk) {
			
			temp = Integer.parseInt(sc.nextLine());
			if (temp > num) {
				System.out.println("작은 값");
				cnt++;
			}else if (temp < num) {
				System.out.println("더 큰값");
				cnt++;
			}else {
				System.out.println("정답");
				cnt++;
				isOk=true;
			}
		}
			System.out.println("정답은"+num+"시도횟수"+cnt+"만에 정답입니다.");
			
	}
//	*실행화면* 
//	-------------------------------------------
//	숫자 맞추기 게임 시작합니다.  나 컴퓨터는 숫자를 결정했습니다.   (*101~299 -> 난수로 결정합니다.*)
//	너 휴먼은 맞춰보세요. 
//	생각한 숫자 입력 ->   ....
//	아닙니다. 더 큰값입니다.
//	생각한 숫자 입력 ->   ....
//	아닙니다. 더 작은값입니다.
//	생각한 숫자 입력 ->   ....
//	아닙니다. 더 큰값입니다.
//	생각한 숫자 입력 ->   ....
//	딩동댕 맞추셨습니다. 지금까지 시도한 값  ... ... ... ...   4번만에 정답입니다.  
//	
//	--------------------------------------------
}
