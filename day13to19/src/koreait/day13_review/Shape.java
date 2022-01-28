package koreait.day13_review;

public class Shape {	//상위 클래스 -> 상속 받는 클래스 : Triangle, Square

		static	final int MAX_WIDTH=100;	//변하지 않는값 -> 상수
		static	final int MAX_HEIGHT=200;	//변하지 않는값 -> 상수
	
		private String shapename;	//도형이름
		private int width;			//너비
		private int height;			//높이
		String etc="연습";	//기타정보	(기본접근자 : 패키지 같은 클래스에 사용할 수 있다)
		protected int count=12;
		
		//필드 초기화 생성자 : 필드값은 생성자로만 초기화한다. (예시 : 요구조건 -> 초기화된 필드값은 변경하지 않는다)
		public Shape(String shapename, int width, int height) {
			this.shapename =shapename;
			this.width=width;
			this.height=height;
		}
		//getter 메소드만 허용하고 setter 메소드는 허용안한다. (예시 : 요구조건 -> 초기화된 필드값은 변경하지 않는다)
		public String getShapename() {
			return shapename;
		}
		public int getWidth() {
			return width;
		}
		public int getHeight() {
			return height;
		}
		
		
		
		//넓이(면적)를 구하여 반환하는 메소드 : getArea
		public int getArea() {
			return width*height;
		}
		
		
		//기본 생성자를 사용할 수 없는 클래스
}
