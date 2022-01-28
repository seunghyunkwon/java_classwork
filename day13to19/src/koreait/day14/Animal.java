package koreait.day14;

public abstract class Animal {	//abstract 클래스는 abstract 메소드를 갖는 것이 일반적이다.
								//abstract 메소드의 유/무와 상관없이 객체는 직접 생성 못한다.
								//추상 메소드를 자식클래스가 구현하면 구체화
					
	//필드 : 공통적인 값
	private String name;
	private String color;
	
	static final String TYPE = "아직 모름";
	
	public Animal() {
		System.out.println("새로운 반려동물이 태어났습니다.");
	}

	public Animal(String name) {
		this();
		this.name=name;
	}
	
	public Animal(String name,String color) {
		this(name);	//자기자신 객체의 기본생성자 메소드 호출
		this.color=color;
		
	}
	
	//추상메소드
	public abstract void sound();
	
	//Object 클래스의 toString() 메소드 오버라이드
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "] -Type :";
		//TYPE 필드값을 여기서 출력하면 이 코드가 있는 Animal의 TYPE이 출력된다.
		//자식클래스의 TYPE필드값을 출력하지 않는다.
		//결론:TYPE 필드는 각각 자식클래스 toString에서 출력한다.
	}
	
	
	
	
	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
