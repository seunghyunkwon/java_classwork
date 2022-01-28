package koreait.day13;

import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		TreeMap<String,String> dictionary = new TreeMap<String, String>();
		String index,english,korean;
		boolean run = true;
//		*)오늘의 문제
//	4.	MyDictionary.java영한 단어사전을 Map을 이용하여 구현
//		*실행화면
//		---------------
//		선택기능 1.단어저장 2.단어검색 3.단어장보기 4.프로그램 끝내기
//		선택->1
		while(run) {	//while 반복안에 switch로 종료조건을 동작시킬 때 break로 종료못한다.(변수 사용필요)
			System.out.println("----------------------");
			System.out.print("1.단어저장, 2.단어검색, 3.단어장보기, 4.끝내기");
			System.out.println("1~4 선택하세요");
			index = sc.nextLine();
			
			switch(index) {
			case "1":	//단어저장
				System.out.print("English:");
				english =sc.nextLine();
				System.out.print("Korean:");
				korean =sc.nextLine();
				if(dictionary.containsKey(english))
				{	//존재하는 key값은 value를 ","로 구분하여 연결하여 저장
					String temp = dictionary.get(english);
					temp +="/"+korean;
					dictionary.put(english, temp);
				}
				else dictionary.put(english,korean);
				
//		English -> milk
//		Korean -> 우유
//				String serch = sc.nextLine();
//				if(map.containsKey(index)==false)
//					System.out.println("단어장에 저장되었습니다.");
//				
//				map.put(index,serch);
//				Dictionary+=","+index;
				break;
			case "2":	//단어검색
				System.out.print("검색하실 단어를 입력해주세요.");
				english=sc.nextLine();
				System.out.println("검색하신 결과:"+dictionary.get(english));
				break;
//		선택->2
//		Korean ->우유
//		단어장에 검색했습니다.->milk
			case "3":	//단어장보기
				System.out.println("단어장 전체보기:"+dictionary);
				break;
//		선택->3
//		{apple:사과, milk:우유}
			case "4":	//끝내기
				run=false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력되었습니다.");
				System.out.println("다시 입력해주세요.");
				break;
				
		}
		
		
		}System.out.println("단어장을 종료합니다.");		
	}
}
