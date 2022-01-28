package koreait.day15;

import java.util.Scanner;

public class TryCatchTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] menu = {"삼겹살","스파게티","곱창전골","불고기","탕수육"};
		int sel;
		boolean run = true;
		
		while(run){//true
			try {
				for(int i=0;i<menu.length;i++)
					System.out.println("["+(i+1)+"]"+menu[i]);
				
				System.out.print("주문할 음식을 선택하세요");
				sel = Integer.parseInt(sc.nextLine());
				System.out.println("주문을 완료했습니다 당신의 주문은 "+menu[sel-1]+"입니다.");
				run=false; //break;
			} catch (NumberFormatException e1) {
				System.out.println("메뉴선택은 숫자로만 하세요.("+e1.getMessage()+")");
				continue;
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("없는 메뉴 번호입니다.("+e2.getMessage()+")");
				continue;
			}
		
		}//while end
	}	//반복문으로 catch에 걸렸을 때 다시 입력받는 코딩을 해보세요.
		//try ~ catch 활용 : 예를 파일열기할 때 없는 파일을 지정한다면 오류 발생
		//자바 클래스들은 꼭 try ~ catch를 하도록 한다.

}
