package koreait.day05;

import java.util.Scanner;

public class MathExam {
	//작성자 : 권승현 (22.01.04)
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num1;	// 메뉴 선택
			int num2;	// 값1
			int num3;	// 값2
			int result;	// 결과

			System.out.println("\t [[수학 공부 도우미]]");
//			[[수학 공부 도우미]]
//					
			
		while (true) {
//					1. 덧셈       2. 뺄셈    3. 곱셈      4. 종료
			System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 종료");
//					연산을 선택하세요. ->  ..1..
			System.out.println("연산을 선택하세요. -> ");
			num1 = sc.nextInt();
		if(num1== 1) {
			System.out.println("선택하신 연산은 -> 덧셈입니다.");				
//					✏️  값 1 을 입력하세요. ->  ..34..
			System.out.println("값을 입력하세요. -> ");
			num2 = sc.nextInt();
			System.out.println("입력하신 값은 -> " + num2);
//					✏️  값 2 을 입력하세요. ->  ..23..
			System.out.println("값을 입력하세요. -> ");
			num3 = sc.nextInt();
			System.out.println("입력하신 값은 -> " + num3);
//					정답  : 34 + 23 = 57 입니다.
			result = (num2 + num3);
			System.out.println("정답 -> " + num2 +"+"+ num3 +"="+ result);
			
		}else if(num1==2) {
			num2 = 0;
			num3 = 0;
			result= 0;
//					연산을 선택하세요. ->  ..2..
//				System.out.println("선택하신 연산은 -> 뺄셈입니다.");
			System.out.println("선택하신 연산은 -> 뺄셈입니다.\n");
			
			System.out.println("값을 입력하세요. -> ");
			num2 = sc.nextInt();
			System.out.println("입력하신 값은 -> " + num2);
			
			System.out.println("값을 입력하세요. -> ");
			num3 = sc.nextInt();
			System.out.println("입력하신 값은 -> " + num3);	
			
			result = (num2 - num3);
			System.out.println("정답 -> " + num2 +"-"+ num3 +"="+ result);
			
		}else if(num1==3) {
			num2 = 0;
			num3 = 0;
			result =0;
//				System.out.println("선택하신 연산은 -> 곱셈입니다.");
			System.out.println("선택하신 연산은 -> 곱셈입니다.\n");
			
			System.out.println("값을 입력하세요. -> ");
			num2 = sc.nextInt();
			System.out.println("입력하신 값은 -> " + num2);
			
			System.out.println("값을 입력하세요. -> ");
			num3 = sc.nextInt();
			System.out.println("입력하신 값은 -> " + num3);	
			
			result = (num2 * num3);
			System.out.println("정답 -> " + num2 +"*"+ num3 +"="+ result);
			
			
		}else if(num1==4){
			System.out.println("프로그램을 종료합니다.Bye");
			break;
		}
		
		}
//		
//				System.out.println("종료");
//		
		
//					
//					연산을 선택하세요. ->  ..4.
//					프로그램을 종료 합니다.Bye

		}
}
