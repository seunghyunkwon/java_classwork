package koreait.day10;

public class MyClass3Test {

	public static void main(String[] args) {
		
		MyClass3 my = new MyClass3();
		my.setAge(19);
		my.print();
		int age = my.getAge();
		System.out.println("나이="+age);
		
		my.score=123;		//자바에서는 사용하지 않는 방법
							//상수만 필드를 직접 사용한다.(static / final)
	
		
	
	}
}
