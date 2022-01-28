package koreait.day11;

public class Puppy extends Animal{
	private String type;

	//생성자 생략 가능하다. -default 생성자 super() 호출한다.
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override	//@ 어노테이션 = 명령실행에 도움을 주는 주석
		public void sound() {
			System.out.println("멍멍합니다.");
		}
}
