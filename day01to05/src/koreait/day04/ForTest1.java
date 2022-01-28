package koreait.day04;

public class ForTest1 {		//반복되는 명령들을 실행하는 for문을 연습

	
		public static void main(String[] args) {
			
			//명령문의 반복1
			System.out.println("hello!");
			System.out.println("hello!");
			System.out.println("hello!");
			System.out.println("hello!");
			System.out.println("hello!");

			//명령문의 반복2
			System.out.println("hello(1)");
			System.out.println("hello(2)");
			System.out.println("hello(3)");
			System.out.println("hello(4)");
			System.out.println("hello(5)");
			
			for(int i=0; i<5; i++)
				System.out.println("hello!!!!!");

			for(int i=0; i<0; i++)
				System.out.println("헬로우!!!!!");
			
			for(int i=0; i<5; i++)
				System.out.println("헬로우 ! (" + i + ")");	//i = 0, 0<5 참 -> 출력 실행 -> i++
															//i = 1, 1<5 참 -> 출력 실행 -> i++
															//i = 2, 2<5 참 -> 출력 실행 -> i++
															//				...
															//i = 5, 5<5거짓 -> for 종료
			// 직접 테스트 16~20라인을 for로 출력하기
			
			for(int i=1; i<6; i++) //조건식 i <=5 도 가능하다.
				System.out.println("*hello(" + i + ")");
			
			//조건식에 변수를 활용한다.
			int end = 100;
			for(int i=0; i<end;i+=2)	//i+=2 는 i=i+2;
				System.out.println("i=" + i);
		}
}
