package koreait.day10a;

import koreait.day10.MyClass2;

public class MyClass2Test {
	//MyClass2 클래스의 접근권한 확인
	public static void main(String[] args) {
		
		MyClass2 my = new MyClass2();	//*다른 패키지의 클래스를 사용할 때는 import가 필요하다.
		
		//my. 보이는 필드(name,score) / 보이지 않는 필드(age)
	}
}
