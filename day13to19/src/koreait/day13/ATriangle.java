package koreait.day13;

public class ATriangle extends AShape {
	//추상클래스를 상속받으면 추상클래스가 반드시 구현 되어야한다

	private int height;
	private int width;
	
	@Override //(오버라이딩보다는 implements(구현)으로 불린다)
	public double getArea() {
		
		return height*width/2;
	}
	
	//테스트용 메소드
	public String triangle(){
		return "삼각형";
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
