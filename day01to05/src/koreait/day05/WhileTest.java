package koreait.day05;

public class WhileTest {

	public static void main(String[] args) {

		System.out.println("for 출력");
		for (int i = 0; i < 5; i++)
			System.out.println("헬로우 ! (" + i + ")"); 
		// i = 0, 0<5 참 -> 출력 실행 -> i++											
		// i = 1, 1<5 참 -> 출력 실행 -> i++											
		// i = 2, 2<5 참 -> 출력 실행 -> i++											
		// ...										
		// i = 5, 5<5거짓 -> for 종료
		
		//while 반복문
		System.out.println("\n while 출력1");
		int j=0;		// 
		while(j<5) {	//조건식 j<5가 참인 동안에 while { } 안에 있는 반복 부분을 실행한다.
			System.out.println("헬로우 ! (" + j + ")");
			j++;
		}
		//while 종류 후 j = 5
		System.out.println("\n while 출력2");
		while (true) {	//무한 반복
		System.out.println("하이 자바 - " + j);
			j++;
			if(j==100) break; //탈출
		}
		System.out.println("\n while 출력3");
		boolean isOk=true;
		while(isOk) {
			System.out.println("j = " + j);
			for(int i=0;i<5;i++)
				System.out.println("\t"+i);
			
			System.out.println();
			
			j++;
			if(j==105) break;
		}
	}
}
