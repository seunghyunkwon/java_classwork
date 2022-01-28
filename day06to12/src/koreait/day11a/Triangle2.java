package koreait.day11a;

import koreait.day11.Shape;

public class Triangle2 extends Shape {

	public Triangle2(String shapename, int width, int height) {
	
		super(shapename,width,height);
	
	}
	public void print() {	//getshapename() : shape 클래스의 필드가 private
		System.out.println("도형이름:"+getShapename()+", 너비:"+getWidth()+", 높이:"+getHeight());
		System.out.println("특별한 변수 테스트(Triangle)");
//		System.out.println("기타정보 :"+etc);	//다른패키지 클래스의 기본접근자 필드는 사용 불가
		System.out.println("count:"+count);	//자식(하위)클래스이면 어느 패키지에서도 사용 가능
		
	}
	public int getArea() {
		return (getHeight()*getWidth())/2;
	}
	public double getAreadouble() {	//같은 이름의 메소드가 존재할 수 없다
		return (double)(getHeight()*getWidth())/2;
	}
	
	
}
