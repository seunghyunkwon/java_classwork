package koreait.day10;

public class MyClass1Test {

		public static void main(String[] args) {
			MyClass1 cls1 = new MyClass1();
		
//		Scanner sc = new Scanner(); //오류 : Scanner 클래스는 기본생성자 허용을 안한다.
		String str = new String(); // 가능 : 기본생성자 실행을 허용하는 클래스
		
		MyClass1 cls2 = new MyClass1(99);
		System.out.println("f1필드만 초기화");
		cls2.print();

		
		MyClass1 cls3 = new MyClass1("momo");
//		MyClass1 cls33 = new MyClass1(3.14); //오류 : 인자의 데이터타입과 맞는 커스텀 생성자가 없다.
		System.out.println("f2필드만 초기화");
		cls3.print();

		double[] test = new double[4];
		MyClass1 cls4 = new MyClass1(test);
		System.out.println("f3필드만 초기화");	//double 배열을 만들어서 참조값을 cls4 객체에 전달한다는 의미
		cls4.print();
		
		MyClass1 cls5 = new MyClass1(999, "momo", test);
		System.out.println("모든 필드 초기화");
		cls5.print();
		
		cls4.f3[2]=999.9912;
		System.out.println("cls5 객체f3[2]값 확인:"+cls5.f3[2]); //cls4와 cls5 객체의 f3 필드는 동일한 배열(주소)를 갖는다.
		
		System.out.println("cls5 객체f3[0]값 확인:"+cls5.f3[0]);
		}
}
