package koreait.day14;

import java.util.Scanner;

public class AnimalCommunity {
		//반려동물 커뮤니티에는 무엇이 필요한가?
		//용품 공동구매, 반려<동물>분양, ...,<회원>
	public static void main(String[] args) {
		
		//동물클래스는 고양이 객체, 강아지객체, 토끼객체... 등을 참조하도록 한다.
		//분양가능한 동물객체 생성해서 참조하기
		Animal[] animals =new Animal[4];
		
		animals[0] = new Puppy("브라우니", "Brown");
		animals[1] = new Cat();
		animals[2] = new Rabbit("바니바니","White");
		animals[1].setName("냥이");
		animals[1].setColor("black");
		animals[3] = new Puppy();
//		animals[4] = new Animal(); //오류: 추상클래스는 객체 생성을 못한다.
		
		
		
		//회원은 반려동물 분양
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		for(int i=0;i<animals.length;i++) {
			if(animals[i]!=null)
			System.out.println(i+":"+animals[i]); animals[i].sound();
		}
		
//		System.out.println("[[반려동물들의 소리를 들려드립니다.]]");
//		for(int i=0;i<animals.length;i++) {
//			if(animals[i]!=null)animals[i].sound();
//		}
		
		
		//분양을 원하는 회원생성
		Member sana = new Member("사나",15);
//		System.out.println("분양가능여부 확인"+sana.isAdopt(animals[0]));
//		System.out.println("분양가능여부 확인"+sana.isAdopt(animals[1]));	//false
//		System.out.println("분양가능여부 확인"+sana.isAdopt(animals[2]));
//		System.out.println("분양가능여부 확인"+sana.isAdopt(animals[3]));
		Scanner sc = new Scanner(System.in);
		System.out.println("분양을 원하는 아이의 숫자를 선택해주세요. =");
		int sel =sc.nextInt();
	
		System.out.print("선택하신"+animals[sel]+"는");
		if(sana.isAdopt(animals[sel])) {
			System.out.println("분양이 가능합니다.");
		}else {
			System.out.println("분양이 불가합니다.");
			
		}
		System.out.println("\n\nTYPE 상수 필드 확인");
		System.out.println(Animal.TYPE);	//static 필드는 속해 있는 클래스로 구별한다.
		System.out.println(Puppy.TYPE);
		System.out.println(Cat.TYPE);
		System.out.println(Rabbit.TYPE);
	}
}
