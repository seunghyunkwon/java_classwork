package sort;

public class SwapTest {
// 두 개의 변수 값을 서로 바꾸기 위해 temp 변수를 사용한다.
	public static void main(String[] args) {
		int a=11, b=22;
		int temp;
		
		temp = b;
		b = a;
		a = temp;
		
		System.out.println(a+","+b);
		
		
	}
}
