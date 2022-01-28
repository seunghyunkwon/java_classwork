package koreait.day04;

public class SumTest {	//for문을 이용하여 1부터 100까지 합계
	
		public static void main(String[] args) {
			
		int sum=0;	//반드시 초기화가 필요합니다.
			for(int i=1; i<=100; i++) {
//				sum=sum+i;
				sum+=i;
				System.out.println("i= " + i + ", sum =" +sum);	
			}
				System.out.println("sum = " + sum);
		}

}
