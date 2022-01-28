package sort;

import java.util.Arrays;

public class StringAscendingSortTest {

	public static void main(String[] args) {
		
		String[] names = {"iu","boa","nayeon","zun","twice","nana"};
		
		//오름차순으로 정렬
		
		for (int i = 0; i < names.length; i++) {

			for (int k = i + 1; k < names.length; k++) {
				if (names[i].compareTo(names[k])>0) {
					// 교환
					String temp = names[k];
					names[k] = names[i];
					names[i] = temp;
				}//if end
			} // k변수 for end
			System.out.println("i=" + i+", 중간결과:"+Arrays.toString(names));
		
	}
}
}
