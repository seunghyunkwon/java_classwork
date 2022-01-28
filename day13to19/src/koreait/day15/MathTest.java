package koreait.day15;

public class MathTest {
	
	public static void main(String[] args) {
		//소수의 개념:1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수 (prime number)
		//ex) 15의 약수 1,3,5,15 ->X	/	11의 약수 1,11 ->O
		
		//소수 판별 수식을 생각해보자.	정수 num이 소수인지 확인하는 방법
		//2부터 num-1까지 나누어서 나머지가 0인 값이 있으면 소수가 아니다.
		//1*) num이 15일 때 2에서 14까지 나누어서 나머지가 0이 있는지
		//2***) 2~ 루트(제곱근)값까지 나누어보면 된다.
		//3**) 2~ num/2(몫)의 값까지 나누어보면 된다.
	
		System.out.println(Math.sqrt(16));
		System.out.println(Math.sqrt(15));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(22));
	
		System.out.println("어떤 정수가 소수인지 확인 정수 값 입력: ");
		int num = 881;	////테스트값 15,17,19,21
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(num);i++) {	//조건은 *i<num **i<num/2 ***i<Math.sqrt(num)
									//num이 소수일 때 반복횟수가 가장 작은 조건식은?
			if(num % i ==0) {
				isPrime=false;
				break;
			}
		}
	
		if(isPrime)
			System.out.println(num+"은 소수입니다.");
		else
			System.out.println(num+"은 소수가 아닙니다.");
	}
}
