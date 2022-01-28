package koreait.day11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyRedPenTask {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int[] x1 = new int[10];	//틀린 문제 다시보기 위한 배열
		int[] x2 = new int[10];
		int[] no = new int[10];
		int n1,n2,ans;
		int cnt=0;
		
		System.out.println("---------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------");
		for(int i=0;i<10;i++) {
			//for문의 지역변수로 선언해도 되는 변수는 ? n1, n2, ans (for문 안에서 처리되는 변수)
			n1=r.nextInt(89)+11;	//nextInt(max-min+1)+min;
			n2=r.nextInt(89)+11;	
			System.out.print("문제"+(i+1)+"."+n1+"+"+n2+"= 답 입력->");
			ans = sc.nextInt();
//			if(n1+n2==ans)	cnt++;
			if(ans!=n1+n2) { //틀린 문제를 cnt++
				no[cnt] = i+1;
				x1[cnt] = n1;
				x2[cnt] = n2;
				cnt++;
			}	//틀린 개수는 cnt, 맞은 갯수는 (문제 갯수-cnt)
		}
		System.out.println("----------------------");
//		System.out.println("채점합니다. 맞는 갯수:"+(cnt)+" ("+cnt*10+"점)");
		System.out.println("채점합니다. 맞는 갯수:"+(10-cnt)+" ("+(10-cnt)*10+"점)");
		//틀린문제에 대해 번호, 문제, 정답 보여주기
		System.out.println("틀린 문제 다시보기");
		for(int i=0;i<cnt;i++)
			System.out.println("문제"+no[i]+"."+x1[i]+"+"+x2[i]+"="+(x1[i]+x2[i]));
//		System.out.println(Arrays.toString(no)+Arrays.toString(x1)+Arrays.toString(x2));
	}
}	//발전 방향 : x1,x2,no 배열 - > 2차원 배열(단순히 값만 저장), 클래스(값저장 + 메소드)의 배열
