package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class LottoArrayList {

	public static void main(String[] args) {
		

		
		ArrayList<Integer> lotto = new ArrayList<>();
		//선택된 숫자 저장(주소)
		ArrayList<Integer> balls = new ArrayList<>();
		//공 45개 저장하는 리스트 -> 44개 -> 43개 -> 42개
//		int [] num = new int[45]; 같은 내용
		int i=0;
		for(i=0;i<45;i++)
		balls.add(i+1);
		System.out.println(balls);
		//balls에는 1~45의 숫자가 들어있어야한다.
		//인덱스 주소로는 0~44
//		int random =0;
//		random=r.nextInt(45)+1;
//		System.out.println(random);
//		//난수출력
//		for(i=0;i<6;i++)
//		lotto.add(random);
//		System.out.println(lotto);
//		balls.remove(random);
//		random=r.nextInt(45-i);
//		System.out.println(balls);
		//1. balls 리스트에 1~45 숫자를 저장(추가)
		//확인: 출력해보기
		int k;
		Random r = new Random();
		
		for(int cnt=0;cnt<6;cnt++) {
			
			//인덱스 범위를 -1씩 줄이기 위해 난수 발생 범위도 변경한다.
			k = r.nextInt(45-cnt); // 경계값을 45(0~44),44(0~43),43(0~42),42(0~41),41(0~40),40(0~39)

			int temp = balls.get(k);
			lotto.add(temp);

			balls.remove(k);
			
			System.out.println(lotto);
			System.out.println(balls);
		//2. balls 리스트에서 뽑을 인덱스를 난수 0~44 -> 0~43 ... -> 0~39로 반복
		//2-1. 난수 인덱스에 해당하는 요소를 lotto 리스트에 추가한다.
		//2-2. 뽑힌 난수 인덱스의 요소는 삭제한다.
		
		//3. 최종 lotto 변수가 참조하는 값을 출력한다.
			lotto.sort(null);
		System.out.println("오름차순 정렬:"+lotto);
		
		
		
		}
		//ArrayList의 중요 메소드 : size(), add(), get(), remove()
		//size 크기, add 더하기, get 가져오기, remove 지우기
	}
}
