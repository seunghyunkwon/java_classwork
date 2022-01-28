package koreait.day06;

import java.util.Scanner;

public class ScannerTest {
	
	static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			int a = sc.nextInt();
			System.out.println(a);

//			sc.close();			//1)
		testA();
		
			
		}
		
		static void testA() {
//			Scanner sc = new Scanner(System.in);
//1)에서 close() 메소드로 해제된 표준 입력 System.in을 다시 사용할 수 없다. 전역변수로 선언하여 사용한다.
			int c = sc.nextInt();
			System.out.println(c);
//			sc.close();
		}
		
		@Override
		protected void finalize() throws Throwable {//객체가 소멸(제거)될 떄 실행하는 메소드
			sc.close();
		}
		
		
}
