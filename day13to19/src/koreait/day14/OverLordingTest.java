package koreait.day14;


import java.util.Arrays;

public class OverLordingTest {

	public static void main(String[] args) {
		//메소드 오버로딩 예제
		
		//min메소드는 int, long, double 등 여러 형식의 인자를 전달받는다.
		//이를 메소드 오버로딩이라 한다.
		int r1 = Math.min(134, 56);
		double r2 = Math.min(6.789, 3.45);
		
		System.out.println("r1= "+r1);
		System.out.println("r2= "+r2);
		
		int[] arr1 = {67,45,99,12};
		String[] arr2 = {"sana","momo","나연","다현"};
		double[] arr3 = {7.8,3.4,9.9,12.34};
		
		String r3 = Arrays.toString(arr1);	//toString 메소드 리턴 타입이 String
		String r4 = Arrays.toString(arr2);
		String r5 = Arrays.toString(arr3);
	
	System.out.println("r3문자열 "+r3);
	System.out.println("r4문자열 "+r4);
	System.out.println("r5문자열 "+r5);
	
	//인자의 타입은 Object일 때는 모든 클래스 타입이 된다. (String, Member, ...)
	//Object는 자바클래스의 최상위클래스(가장높은부모클래스)
	Member[] arr4 = {new Member("sss",12),new Member("ttt",21),new Member("zzz",19)};
	
	String r6 = Arrays.toString(arr4);
	System.out.println("r6문자열 "+r6);
	
	//내가만든 MyMath 오버로딩 메소드를 테스트합니다. - arr1정수배열, arr3실수배열
	System.out.println("arr1 배열 최대값= "+MyMath.arrayMaxValue(arr1));
	System.out.println("arr3 배열 최대값= "+MyMath.arrayMaxValue(arr3));
	
	
	}
}
