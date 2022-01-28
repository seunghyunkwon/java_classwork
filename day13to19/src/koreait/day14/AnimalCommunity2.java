package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {
	//작성자 : 권승현
	public static void main(String[] args) {
		//AnimalCommunity 클래스 실행내용을 ArrayList 활용하여 구현
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Animal> list = new ArrayList<>();

		list.add(new Puppy("브라우니", "Brown"));	//index 0
		list.add(new Cat());					//index 1
		list.add(new Rabbit("바니바니","White"));	//index 2
		list.get(1).setName("냥");
		list.get(1).setColor("black");
//		System.out.println(list);	//동물들 인덱스 주소(list)에 위치하였는지 확인
		
		System.out.println("이름을 입력하세요. (문자만 입력이 가능)");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요. (숫자만 입력이 가능)");
		int age = sc.nextInt(); 
		
		Member member = new Member(name,age); 
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
			list.get(i).sound();
		}
//		System.out.println("[[반려동물들의 소리를 들려드립니다.]]");
//		for(int i=0;i<list.size();i++) {
//		}

		System.out.println("분양을 원하는 동물의 번호를 선택해주세요. =");
		int sel =sc.nextInt();

		System.out.print("선택하신"+list.get(sel)+"는");
		if(member.isAdopt(list.get(sel))) {
			System.out.println("분양이 가능합니다.");
		}else {
			System.out.println("분양이 불가합니다.");
		}

		

		

		
		
		
	}
}
