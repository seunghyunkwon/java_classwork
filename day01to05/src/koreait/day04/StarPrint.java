package koreait.day04;

import java.util.Scanner;

public class StarPrint {
	//예제 : 영화 감상 후기 1~5 평점 입력 -> 방법1)3일때 ★★★,  방법2)★★★☆☆
			public static void main(String[] args) {
			
				Scanner sc =new Scanner(System.in);
				int point;
				
				System.out.println("[[영화감상 후기]]");
				System.out.print("평점을 몇 점 주시겠습니까?(1~5) -> ");
				
				point = sc.nextInt();
				System.out.println("방법1)");
				
				for(int i=0; i<point; i++)
						System.out.print("★");		
				System.out.println(); // 내용 없는 println은 줄바꿈이 된다.
		
				System.out.println("방법2-1)");	
				for(int i=0; i<point; i++)
					System.out.print("★");
				for(int i=0; i<5-point; i++)
					System.out.print("☆");
				System.out.println();
//			=========================================				
				System.out.println("방법2-2)");
				for(int i=0; i<5; i++) {
					if(i<point)
						System.out.print("★");
					else	System.out.print("☆");
				}	//for문이 종료되면 i변수는 사용 못한다.
				System.out.println();
//			=========================================				
				System.out.println("방법2-3)");
				int k;	
				//for문이 아닌 별도로 변수값 k를 주게 되면 종료시 k는 point 값과 같다.
				for(k=0; k<point; k++)
					System.out.print("★");
				for(; k<5; k++)	//초기값 식을 생략	k=point
					System.out.print("☆");
				
				
			}

}
