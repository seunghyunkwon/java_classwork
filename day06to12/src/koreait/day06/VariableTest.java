package koreait.day06;

public class VariableTest {
	//변수가 선언되는 위치로 특성을 이해하는 연습
	//static, final(최종적인) 키워드 이해하기
	
	static int gval = 34;		//클래스 소속으로 선언된 변수(필드), 위치로 보면 전역(global)변수
	int dval;
	boolean boo1;
	final int fval=23;	
//	final int test;		//오류 : final 변수는 꼭 초기값을 정한다.
	int test2;
	static final int fval2 = 456;	//값을 변경할 수 없는 변수 : 상수
	
	public static void main(String[] args) {
		int sum=100;
		
		//1. while,for,if ...{} 블록 안에서 선언된 변수 : 지역변수
		//2. method {} 블록 안에서 선언된 변수 : 지역변수
		
		
		
		while(true) {
			int k=12;
			System.out.println("k= " + k);
			if(k==12) break;
			System.out.println("sum= " + sum); //main method {} 블록 안에서는 어디에서나 사용 가능
		}
		
//		System.out.println("k= " + k); //오류 : 선언된 {} 블록 지역을 벗어났다.
		System.out.println("전역변수 gval= " +gval);
		
		
//		fval=140;	오류 : 
		System.out.println("final 변수 fval2 = " +fval2);
//		fval2 =123; 오류 : final 변수여서 값을 변경할 수 없다
		
		//static final 예시
		System.out.println("Byte 정수의 크기:" + Byte.BYTES);	//Byte클래스의 BYTES필드
		System.out.println("Byte 정수의 최소값:" + Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최대값:" + Byte.MAX_VALUE);
		
		//상수 : 의미있는 값(변하지 않는 값)들을 이름으로 표기한다.
		//클래스의 일반적으로 기본형 상수 필드를 대문자로 표기한다.
	}
	
	//3. method 인자로 선언된 변수 : 해당 메소드 {} 안에서만 사용 가능한 지역변수
	static void methodA(int a) {
		int b=3;	//methodA()의 지역변수
		System.out.println("b= " +b);
		System.out.println("전역변수 gval= " +gval);
//		nonStatic(123);	//오류	
	}
	
		
	
	void nonStatic(int a) {
		System.out.println("-----nostatic-----");
		System.out.println("전역변수dval= " +dval);
		System.out.println("전역변수gval= " +gval);
		methodA(123);
	
		System.out.println(fval);
		System.out.println("------------------");
//		fval = 100;		//fval 변수는 값을 변경할 수 없다. -> 오류 : final 키워드 사용중이라서
	}
	//static 에서는 static 만 가능
	//nonstatic 에서는 static, nonstatic 둘 다 가능 / *nonstatic은  static 키워드가 없는 것을 말한다.
}
