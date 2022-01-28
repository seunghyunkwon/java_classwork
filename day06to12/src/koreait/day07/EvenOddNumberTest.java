package koreait.day07;

public class EvenOddNumberTest {

	public static void main(String[] args) {
		int e1 =34, o1=17;
		//나머지 연산자 : %, 짝수는 2로 나눈 나머지 0, 홀수는 2로 나눈 나머지 1
		
		if(e1%2==0) 
			System.out.println("e1=34 짝수입니다." + "");
		if(e1%2==1) 
			System.out.println("e1=34 홀수입니다." + "");
		
		if(o1%2==0) 
			System.out.println("o1=17 짝수입니다." + "");
		if(o1%2==1) 
			System.out.println("o1=17 홀수입니다." + "");
		
	}
}
