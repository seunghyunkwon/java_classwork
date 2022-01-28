package koreait.day08;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		// 난수 1~46범위값을 중복값 없이 6개 생성 후 배열에 저장

		int[] lotto = new int[6];
		//int[] lotto -> lotto라는 int값(정수)에 크기를 입력([])하고 새롭게 그 크기(new int[6])를 지정해주는 코드 
		Random r1 = new Random();
		boolean isOK = true;

		for (int i = 0; i < 6; i++) {
			int temp = 0;
			isOK = true;
			while (isOK) { //while 문을 쓰는 경우에는 탈출값이 예측이 되지 않을 때
				temp = r1.nextInt(45) + 1;
				System.out.println("난수값:" + temp);
				int j;

				for (j = 0; j < i; j++) { // j==i 이면 for 종료
					// 현재 인덱스 i의 앞에 있는 값들과 temp값을 비교

					if (temp == lotto[j]) {
						System.out.println("*");
						break; // for-j 에서 탈출
								// i는 4로 예를 들면
								// 1) j가 2의 배열값이 temp와 같다면
								// 탈출했을 때 아래**부분의 조건은 거짓
								// 2) j=0~3까지 배열값을 비교했을 때 모두 temp와 다른 값이라면
								// 탈출했을 때 아래 **부분의 조건은 참
					}
				} // for - j end
				if (j == i)
					isOK = false; // 비교하는 동안 같은 값이 없을 때
			} // while end

			lotto[i] = temp;

		} // for - i end

		System.out.println(Arrays.toString(lotto));
	}
}
//for문 안에서 temp의 초기값을 설정해주고  while의 조건문을 설정해준 다음
//while 을 진행하는데 isOK가 참일 때가 조건식이라서 참인 경우 
//별도의 탈출문이 없다면 무한반복된다.
//temp에게 난수를 입력시켜주고
//for문에 입력될 별도의 정수값을 주고
//1) j<i 조건으로 for문을 반복할 때 j=i가 되면 조건문이 틀려져서 for문이 종료가 된다. 
//따라서 if(j==i) 형태가 발생하며 다음과 같은 조건을 만나서 isOk = false 라는 값에 도달하여
//다시 while문 처음으로 실행이 된다. (for문 코드 재실행)
//2) j값 < i값으로 진행하는 도중 temp == lotto[j] 조건에 들어맞게 되면
//입력된 break; 코드로 인하며 for문을 탈출하게 된다.
//이는 temp 값이 lotto[i]에 저장된다. 
//이후 lotto를 나열하면 각각의 위치인 [0]~[6]까지의 각각의 자리수에 들어가게된 난수의 값이 도출된다

//---------------------coment---------------------
//1) j<i 조건으로 for문을 반복할 때 j=i가 되면 조건문이 틀려져서(거짓이되어) for문이 종료가 된다. 
//따라서 if(j==i) 형태가 발생하며 다음과 같은 조건을 만나서 isOk = false 라는 값에 도달하고
//lotto배열에 temp값을 저장한 수 다음 i 값으로 변경하여 바깥 for반복한다.
//아래 문장은 틀립니다..-----------------------------
//다시 while문 처음으로 실행이 된다. (for문 코드 재실행)
//2) j값 < i값으로 진행하는 도중 temp == lotto[j] 조건에 들어맞게 되면
//입력된 break; 코드로 인하며 for문을 탈출하게 된다.
//이때 isOk는 true 인 상태로 while반복을 다시 실행한다.
//
//틀립니다.위1번과 바뀌었습니다.--------------------------------
//이는 temp 값이 lotto[i]에 저장된다. 
//이후 lotto를 나열하면 각각의 위치인 [0]~[6]까지의 각각의 자리수에 들어가게된 난수의 값이 도출된다


