package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//주어진 난수 범위에서 소수가 7개 만든다.
		//범위 100~999
		//소수 7개는 배열에 저장하여 출력한다.
		int[] arr= new int[10];				//배열주소 만들기
		Random r= new Random();				//난수 생성
//		System.out.println(rnum);			//난수가 생성되는지 확인
		int i=0;
		int max=999, min=333;
		while(i<10) {
			int rnum= r.nextInt(max-min+1)+min;	//난수 범위값 지정
			if(isPrime(rnum)) {					//메소드를 호출하여 소수확인 받은 값을 반환받기
				arr[i]=rnum;
				i++;							//배열에 담기
			}
		}
		
		System.out.println(Arrays.toString(arr));	//배열을 출력하기 
		
		long end = System.currentTimeMillis();
		System.out.println("실행시간 ="+(end-start)+"ms만큼 ");
		}
		

	//주어진 정수 값이 소수인지 판별하는 메소드를 만들어본다.
	//메소드 이름은 isPrime, 리턴형식은 boolean, 인자는 정수1개
	//메소드부터 만들기
	static boolean isPrime(int a) {	//반환형식은 boolean, //인자 정수1개를 받아서(난수값)
	boolean primenum=true;
	for(int i=2;i<Math.sqrt(a);i++) {	//조건은 *i<num **i<num/2 ***i<Math.sqrt(num)							//num이 소수일 때 반복횟수가 가장 작은 조건식은?
		if(a % i ==0) {	//소수가 아닌 경우 false로 변경되면서 다시 for문 재실행
			primenum=false;
			break;
		}//이프문종료		
	}//포문종료
		return primenum;	//true인 경우 리턴(반환)
	}//메소드종료
}
