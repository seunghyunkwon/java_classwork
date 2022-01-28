package koreait.day10;

public class MyClass1 {
//생성자 메소드 연습 (리턴값은 없고, 인자는 있을 수도 있는 메소드) - constructor
	//생성자 메소드 실행으로 객체가 만들어진다.
	//기본생성자 : 인자가 없는 형식의 생성자
	//커스텀생성자 : 필드값 초기화를 위해서 인자가 있는 형식의 생성자
	int f1;
	String f2;
	double[] f3;
	public String f4;
	
	public MyClass1() {
	//커스텀생성자를 정의하면 기본생성자는 생략을 할 수 없다. -> 필요하다면 기본생성자 정의가 필요함
	}
	
	public MyClass1(int f1) {
		this.f1=f1; //이 객체의 f1필드값. this는 new 연산으로 만들어지는 객체
	}
	
	public MyClass1(String f2) {
		this.f2=f2;
	}
	public MyClass1(double[] f3) {//배열변수는 주소(참조)값 전달
		this.f3=f3;
	}
	
	//모든 필드값을 초기화하는 생성자
	public MyClass1(int f1, String f2, double[] f3) {
		this.f1=f1;
		this.f2=f2;
		this.f3=f3;
	}
	
	void print() {
		System.out.println("f1="+f1+",f2="+f2+",f3="+f3);
	}
}
