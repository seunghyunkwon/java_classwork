package koreait.day14;

public class Member {

	private String name;
	private int age;
	
	public Member(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("새로운 회원<"+this.name+"("+age+")"+">님 환영합니다.");
		
	}
	
	//(처리조건)
	//회원이 분양받습니다. 
	//회원나이 강아지는 15세이상, 고양이는 18세이상, 토끼는 13세이상 분양받을 수 있다.
	boolean isAdopt(Animal animal) {	//Animal의 자식(하위)클래스 Puppy,Cat,Rabbit 객체가 animal변수로 참조하게 된다.
		//현재 회원객체가 인자로 전달받은 animal 객체를 분양자격이 되는지 반환값 결정
		//instanceof 연산 : 구체화된 객체타입을 검사한다.	자식(하위)클래스 객체들에게 사용하는 연산
		if(animal instanceof Puppy && this.age >=15 ) return true;
		else if(animal instanceof Cat && this.age >=18 ) return true;
		else if(animal instanceof Rabbit && this.age >=13 ) return true;
		else 
			return false;
		
		
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
