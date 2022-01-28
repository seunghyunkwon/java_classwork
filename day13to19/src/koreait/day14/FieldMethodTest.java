package koreait.day14;

public class FieldMethodTest {

	//인스턴스 필드
	String color;
	
	//스태틱 필드
	static double pi = 3.14159;
	
	//인스턴스 메소드
	void setColor(String color) {
		this.color=color;
	}
	
	//스태틱 메소드
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
}
