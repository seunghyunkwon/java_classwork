package koreait.day17;

public class Member {

	private String name;
	private int age;
	
	public Member(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("새로운 회원<"+this.name+"("+age+")"+">님 환영합니다.");
		
	}
	
	
	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}

	//getter (생성자로만 값을 주고 값이 변하지 않게끔하기 위하여)
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
	
}
