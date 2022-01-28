package koreait.day17;
							//User 클래스는 비교할 수 있는 객체가 된다.
public class User implements Comparable<User>{

	private String name;
	private int age;
	
	
	public User(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("새로운 회원<"+this.name+">님 환영합니다.");
		
	}
	
	//추상메소드 정의
	@Override		//User 객체 비교 기준 : age 필드, 오름차순
	public int compareTo(User o) {
		Integer o1 = new Integer(this.age);
		Integer o2 = o.getAge();
		return o1.compareTo(o2);
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() { 	
	return "(name="+name+", age="+age+")";
	}
	
	
	
}
