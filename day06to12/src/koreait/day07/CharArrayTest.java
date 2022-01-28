package koreait.day07;

public class CharArrayTest {

	public static void main(String[] args) {
		//배열의 선언
		
		char[] carr1 = {'i','a','m','j','a','v','a'};
		char[] carr2 = new char[20];
		

		System.out.println("carr1 배열 길이(크기) : "+carr1.length);
		System.out.println("carr2 배열 길이(크기) : "+carr2.length);
		
		System.out.println("carr1 배열 3번째 데이터의 값 : " + carr1[2]);
		System.out.println("carr2 배열 3번째 데이터의 값 : " + carr2[2]);
	
		for(int i=0;i<carr1.length;i++) {
			System.out.print(carr1[i]);
		}
		
		//문자타입 char 의 배열은 문자열과 유사하다.
		System.out.println(carr1);
		
		String name = "java";
//		carr2 = "hello hi goodbye";	//char 배열에 바로 문자열 대입은 오류발생
		carr2 = "hello hi goodbye".toCharArray();	
		System.out.println(carr2);
		
		carr2 = "hello hi goodbye goodbye goodbye".toCharArray();	//선언된 배열의 크기보다 클 때
		System.out.println("carr2.length : " + carr2.length);		//-> 배열의 크기가 커진다
	}
}
