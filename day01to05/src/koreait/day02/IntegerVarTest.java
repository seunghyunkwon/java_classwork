package koreait.day02;

public class IntegerVarTest { //정수를 저장하는 변수 연습합니다.
	//이 자리에서 선언 된 변수는 필드가 된다.

	//변수 : 메모리에 저장된 값 중에서 변경할 수 있는 데이터를 말한다.
	//	변수는 프로그램이 실행되는 동안에 임시로 사용하는 메모리 공간이다.
	//	데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자)을 부여한다.
	//	변수 선언한다 -> 변수명과 데이터 형식을 지정하는 것 -> 메모리에 공간 할당 된다. 
	public static void main(String[] args) {
		//지역 변수 선언
		byte n1;	// 데이터형식은 byte, 변수명은 n1
		short n2;
		int n3;
		long n4;
		
		//변수 선언 할 때에는 기본형(primitive,원형) 타입 사용한다.
		//byte,short,int,long 소문자로 시작하는 것은 정수 데이터 타입을 표시하는 키워드

		//선언된 변수에 데이터 저장 : 대입문 ( = )
		//n1 = 1997;	//오류 : overflow
		n1 = 100;
		n2 = 30000;
		//n2 = 40000;	//오류 : overflow
		n3 = 40000;
		//n3 = 4000000000;	//40억	//오류 : overflow
		n4 = 4000000000L;	// long 형식의 데이터는 뒤에 L(1)을 표기한다.
		
		
		//변수의 사용 : 출력/엽력, 연산 등
		n3 = n3 + 100;
		
		System.out.println("변수 n1 = " + n1);
		System.out.println("변수 n2 = " + n2);
		System.out.println("변수 n3 = " + n3);
		System.out.println("변수 n4 = " + n4);
		
		//short 연산시 주의
//		short result;
//		result = n2 + 100;	//	오류 : 100은 기본적으로 int 형식 4바이트이고
							//n2는 short인데 사칙연산은 4바이트로 한다.
		int result2;
		result2 = n2 + n2;	//32767+32767 = ? 정상적으로 int에 저장할 수 있다.
		
	}

}
