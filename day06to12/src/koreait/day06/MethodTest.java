package koreait.day06;

public class MethodTest {
	//클래스(또는 객체)의 구성 : 필드, 메소드
	//-> 메소드를 이해하는 연습         단, 같은 클래스에서 사용되는 경우이다.
		public static void main(String[] args) {
			System.out.println();		//System은 클래스, out은 필드, println은 out의 메소드
			
			//메소드 실행 - 메소드 이름 호출
			testMethod1();		//main 메소드의 특징 : static, 실행할 수 있는 메소드는 static만 가능하다.
			testMethod1();		//--> static은 static의 성질을 갖는 요소들만 사용한다.
//			testMethod2(123, 123);	//오류 -> 인자의 형식이 틀림 (두번 째 인자는 String 이지만 int형식의 인자 값을 입력하여서)
			testMethod2(123, "twice"); 
			testMethod2(456, "momo");
			testMethod2(789, "쯔위");
			testMethod22(1.34,23,4.56);		//3개의 인자 값을 더해서 출력하는 메소드
			testMethod22(23,45,1.8987);		//인자 값을 전달할 때 자동캐스팅이 진행된다.
			int result = testMethod3();					//반환 값(리턴)이 있는 메소드는 변수를 사용하여 저장 또는 출력한다.
			String day = testMethod33();
			
			
			
			System.out.println(result);
			System.out.println("testMethod3 return = " + testMethod3());
			System.out.println("testMethod3 return 더하기 = " + (testMethod3()+11));
			System.out.println(testMethod33());		//수요일 출력
		
			System.out.println("testMethod4 return = " + testMethod4(34, 67));
			//testMethod44를 실행해서 리턴값을 변수 d_result에 저장하고 출력하기
			double d_result = testMethod44(3.56,12);
			System.out.println(d_result);
			System.out.println("\n요일 출력");
			System.out.println(dayOfWeek(3));		//반환받은 문자열의 참조값으로 내용을 출력한다.
		
		}	//main end
		
		

		//1.인자(args), 반환 값이 없는 메소드만들기
		static void testMethod1()	{	//메소드 정의 연습1
			System.out.println("첫 번째 메소드 정의 연습입니다.");
		}
		
		//2.인자 있고, 반환 값이 없는 메소드만들기
		//인자 개수는 제한이 없다.		변수 선언과 같은 방식으로 구분한다.		인자는 메소드 실행에 필요한 데이터이다.
		static void testMethod2(int a, String name) {	//인자 2개
			//메소드를 실행할 때는 정수, 문자열 순서에 맞게 값을 지정하고
			//a는 정수 값, name은 문자열의 참조 값을 저장한다.
			System.out.println("정수 값= "+a);
			System.out.println("name= "+name);
		
		}
		static void	testMethod22(double d, int a1, double f) {
			System.out.println("인자값 합계 = "+ (d+a1+f));
			
		}
		
		//3.인자 없고, 반환 값이 있는 메소드 만들기
		static int testMethod3() {
			return 145;		//반환 값이 있는 형식에서는 꼭 있어야하는 명령문 -> return
			
		}
		
		//연습 - "수요일"을 리턴하는 메소드
		static String testMethod33() {
			return "수요일";
			
		}
		
		//4.인자 있고, 반환 값이 있는 메소드
		static int testMethod4(int a,int b) {
			return (a+b);
			
			
		}
		static double testMethod44(double a,int b) {
			double result= a+b;
			return result;
			
			
		}
		
		//정수값을 전달 받고 1이면 월요일, 2이면 화요일, 3이면 수요일 ... 7일이면 일요일을 리턴
		//리턴하는 메소드 -> 1~7 이외의 값은 "unknown" -> method이름은 dayOfWeek
		static String dayOfWeek(int a) {
			String result="unknown";
			switch(a) {
			case 1:
				result="월요일";
				break;
			case 2:
				result="화요일";
				break;
			case 3:
				result="수요일";
				break;
			case 4:
				result="목요일";
				break;
			case 5:
				result="금요일";
				break;
			case 6:
				result="토요일";
				break;
			case 7:
				result="일요일";
				break;
				
			}
			return result;		//result는 문자열의 참조값(메모리의 주소)을 반환한다.
			
			
			}
				
			
			
}
		
		
		
		

