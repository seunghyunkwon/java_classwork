package koreait.day11;

public class Square extends Shape{
	
	protected String color;	//자식(하위)클래스(Square)만 갖는 필드
							//Square 클래스가 부모, 그 자식클래스들은 다른 패키지에서도 사용할 수 있는 필드
	//protected가 없으면 다른 클래스에서 사용 가능
	
/*	
	public Square(String color) {
		//super() 자동 호출 -> 오류 발생
		this.color=color;
	}
*/
	public Square(String shapename, int width, int height, String color) {
		super(shapename, width, height);
		this.color=color;
	}
	public Square(String color) {
		super("정사각형", 10, 10);
		this.color=color;
		
	}
	
	public void printWidth() {
		System.out.println("정사각형 너비:"+getWidth());	//getWidth()는 부모(상위)클래스의 메소드
		
	}
	
	public void printEtc() {
		System.out.println("기타정보:"+etc);
	}
	
	
	public int getArea() {	//오버라이드 메소드 (재정의)
		return getWidth()*getWidth();
	}
	
}
