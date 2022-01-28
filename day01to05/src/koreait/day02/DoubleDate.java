package koreait.day02;

public class DoubleDate {

	public static void main(String[] args) {
		// 실수 데이터 형식	: Wrapper 클래스는 Float, Double
		//				: 기본형은 Float
		System.out.println(":::4바이트에 저장하는 Float 실수 확인:::");
		System.out.println("Float 실수의 크기:" + Float.BYTES);
		System.out.println("Float 실수의 최소값:" + Float.MIN_VALUE);
		System.out.println("Float 실수의 최대값:" + Float.MAX_VALUE);
		
		
		System.out.println(":::8바이트에 저장하는 Double 실수 확인:::");
		System.out.println("Double 실수의 크기:" + Double.BYTES);
		System.out.println("Double 실수의 최소값:" + Double.MIN_VALUE);
		System.out.println("Double 실수의 최대값:" + Double.MAX_VALUE);
		
		//소수점 이하 자리수가 표현이 많이 되는 것을 정밀도가 높다고 한다.
	}
}
