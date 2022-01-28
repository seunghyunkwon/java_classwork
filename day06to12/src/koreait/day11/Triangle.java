package koreait.day11;

public class Triangle extends Shape {

	public Triangle(String shapename, int width, int height) {
	
		super(shapename,width,height);
	
	}
	public void print() {	//getshapename() : shape 클래스의 필드가 private
		System.out.println("도형이름:"+getShapename()+", 너비:"+getWidth()+", 높이:"+getHeight());
		System.out.println("특별한 변수 테스트(Triangle)");
		System.out.println("기타정보 :"+etc);
		System.out.println("count:"+count);
		
	}
	public int getArea() {
		return (getHeight()*getWidth())/2;
	}
	public double getAreadouble() {	//같은 이름의 메소드가 존재할 수 없다
		return (double)(getHeight()*getWidth())/2;
	}
	
	
}
