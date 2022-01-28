package koreait.day10;

public class DowhileTest {

	public static void main(String[] args) {
		//반복문 : do ~ while(조건식);
		
		int i=0;
		
		while(i<5) {	//1) i<5 일 때 5번 실행 
						//2) i>5 일 때 0번 실행
			System.out.println("i="+i);
			i++;
		}
		
		
		int k=0;
		do {
			System.out.println("k="+k);
			k++;
			
		}while(k<5);
		
		System.out.println("The End!");
	}
}
