package sort;

import java.util.Arrays;

public class IntAscendingSortTest {

	public static void main(String[] args) {

		int[] datas = { 45, 34, 78, 65, 99, 14 };

		System.out.println("배열 초기값 :" + Arrays.toString(datas));
		for (int i = 0; i < datas.length; i++) {

			for (int k = i + 1; k < datas.length; k++) {
				if (datas[i] > datas[k]) {
					// 교환
					int temp = datas[k];
					datas[k] = datas[i];
					datas[i] = temp;
				}
			} // k변수 for end
			System.out.println("i=" + i+", 중간결과:"+Arrays.toString(datas));

		}// i변수 for end

	}
}
