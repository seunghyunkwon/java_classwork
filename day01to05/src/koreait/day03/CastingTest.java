package koreait.day03;

public class CastingTest {	//데이터의 형식 변환(Type Casting)을 연습한다.
//	필요한 이유 : 대입,연산(사칙연산 등)을 실행할 때 같은 형식으로 일치를 시켜야 한다. (자동변환 또는 강제변환)
	public static void main(String[] args) {
		// 
		short sva11 = 11;	// int 보다 작은 크기의 리터럴은 없다.
							// 11은 4byte, sva11변수는 2byte
//		sva11 = 40000;
//		sva11 = sva11 + sva11;	// 4byte로 연산하기 때문에 오류가 발생하며 강제 캐스팅이 필요하다.
		
		float fva11 = 1.23f;
		fva11 = fva11 + fva11;	// float으로 연산하기 때문에 정상 실행이 가능하다.
		
		sva11 = (short)40000;	//강제 캐스팅 -> 데이터 손실 오류 (정확한 값이 아니다.)
		System.out.println("sva11+변수값 = " + sva11);
		sva11 = (short)(sva11 + sva11);	//덧셈 결과를 강제로 캐스팅
				
		
	}

}
//byte(1byte) -> short(2byte) -> int(4byte) -> long(8byte)
//	-> float(4byte) -> double(8byte)
//1. 자동 캐스팅 : = 를 기준으로 오른쪽의 데이터가 크기가 작은 것(리터럴,변수,연삭식)을
//				왼쪽의 큰 타입 변수로 대입
//			: 정수는 4byte 보다 작은 타입은 int 리터럴을 사용하며 표현 범위에서 벗어나면 오류가 발생한다.
//			: 연산할 때 정수는 4byte 보다 작은 타입은 int로 변환된 후에 연산한다.
//			: 실수는 float 과 double 각각의 타입에 따라 연산한다.
//2. 강제 캐스팅 : ()안에 변환하고자 하는 기본형 타입을 표시하여 실행한다.