package koreait.day06;

public class StaticObjectTest {

		public static void main(String[] args) {
			
			System.out.println(VariableTest.fval2);		//1번
			
			VariableTest obj = new VariableTest();		//obj는 객체를 참조하는 변수
			System.out.println(obj.dval);				//2번
			if(obj.boo1 == false) {
				System.out.println("false입니다.다");
			}
			System.out.println(obj.boo1);				//2번
			
			obj.nonStatic(0);							//2번
			
			//1.클래스이름.메소드 or 클래스이름.필드를 입력하면 메소드와 필드는 static
			//2.객체(object).메소드 or 객체.필드를 입력하면 메스드와 필드는 static이 아닌 것을 사용한다.
//											     		   (static도 사용할 수 있지만 이런 경우 1번을 사용)
		}
}
