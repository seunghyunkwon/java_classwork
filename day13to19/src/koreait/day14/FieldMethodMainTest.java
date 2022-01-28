package koreait.day14;

public class FieldMethodMainTest {

//	public class Static_1 {
		public static void main(String[] args) {
			
			// 원칙적으로는 (클래스이름).(필드or메소드)로 접근해야 하지만
	        // 정적 멤버의 경우 객체 참조 변수만으로도 접근이 가능해진다.
			double result1 = 10 * 10 * FieldMethodTest.pi;
			// double result1 = 10 * 10 * myCal.pi;
			int result2 = FieldMethodTest.plus(10, 5);
			// int result2 = myCal.plus(10, 5);
			int result3 = FieldMethodTest.minus(10, 5);
			// int result3 = myCal.minus(10, 5);
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			
		}
		


}
