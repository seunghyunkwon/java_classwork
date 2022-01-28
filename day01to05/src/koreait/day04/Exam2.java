package koreait.day04;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
//		3개 정수 중 최대값을 구하라		
		Scanner sc = new Scanner(System.in);

		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		int n3 = Integer.parseInt(sc.nextLine());
		
		int max;
		if(n1>n2) 		//n1가 더 크다면
			max=n1;		//n1은 max
		else			//n2가 더 크다면
			max=n2;		//n2는 max
		if(n3>max)		//n3가 더 크다면
			max=n3;		//n3는 max
		System.out.println("최대값"+max);

//		3개 정수 중 최대값과 최소값을 구하라
		int maxium;
		int minium;
		if(n1>n2) { 
			maxium=n1;		
			minium=n2;		
		}else { 
			maxium=n2;
			minium=n1;
		}if(n3>maxium) { 
			maxium=n3;			
		}if(n3<minium) {
			minium=n3;
		}
		
		System.out.println("최대값"+maxium);
		System.out.println("최소값"+minium);
		
		
		sc.close();		
	}//main end
}
