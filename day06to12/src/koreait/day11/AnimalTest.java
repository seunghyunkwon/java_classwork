package koreait.day11;

public class AnimalTest {
	public static void main(String[] args) {
		
		Puppy puppy = new Puppy();
		puppy.sound();
		puppy.setType("poodle");
		System.out.println("puppy type:"+puppy.getType());
		
		Animal dog = new Puppy();
		
		dog.sound();
		
//		Puppy test = new Animal();	// 오류 : 부모객체는 자식 타입이므로 참조 불가
		
		
		Puppy test = (Puppy) dog;
		test.sound();
//		Puppy test = (Puppy) new Animal();	//강제캐스팅
//		test.sound();
//		
		
		//Cat cat = new Cat();
	}
}
