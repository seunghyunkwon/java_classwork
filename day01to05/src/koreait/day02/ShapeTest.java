package koreait.day02;

public class ShapeTest {

	public static void main(String[] args) {
		
	
		//작성자 : 권승현
		
//	사각형의 넓이 구하기
//	가로 : 23, 세로 : 19
		//변수
		//사각형
		int height;
		int width;
		int area;
		
		height = 23;
		width = 19;
		area = height * width;
		System.out.println("[[사각형의 넓이를 구하여라]]");
		System.out.println("가로: "+height+"cm");
		System.out.println("세로: "+width+"cm");
		System.out.println("넓이: "+(area)+"cm²");
		
// 원의 넓이 둘레 구하기	//결과를 출력할 때 소수점 이하 3자리로 출력하기
		double radius;
		double round;
		double c_area;

		radius = 23.0;
		round = ( radius + radius )* 3.14;
		c_area = ( radius * radius ) * 3.14;
		System.out.println("[[원의 넓이와 둘레를 구하여라]]");
		System.out.println("반지름: "+radius+"cm");
		System.out.println("둘레: "+round+"cm");
		System.out.printf("넓이:  %.3f cm², c_area,\n");
		System.out.printf("넓이를 구했습니다 -> %.3f cm²,c_area");


	}
	
}
