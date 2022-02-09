package programers;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {
//1부터 45까지 숫자 중 6개를 찍어서 맞히는 대뵤적인 복권이다.
//1등 6개 일치 //2등 5개 일치 //3등 4개 일치 //4등 3개 일치 //5등 2개 일치 //6등 그외
//로또를 구매한 민우는 당첨 번호 발표일을 앞두고 동생이 로또에 낙서를 하여 일부 번호를 알아볼 수 없게 되었다.
//민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어졌다.
//알아볼 수 없는 번호를 @으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가
//44,1,@,@,31,25라고 가정한다.
//당첨 번호 6개가 31,10,45,1,6,19라면 당첨 가능한 최고 순위와 최저 순위를 구하여라.

//순서와 상관없이 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정된다.
//알아볼 수 없는 두 개의 번호를 각각 10,6이라고 가정하면 3등에 당첨될 수 있다.
	// ㄴ3등을 만드는 다른 방법들도 존재한다. 하지만, 2등 이상 만드는 것은 불가능하다.
//알아볼 수 없는 두 개의 번호를 각각 11,7이라고 가정하면 5등에 당첨될 수 있다.
	// ㄴ5등을 만드는 다른 방법들도 존재한다. 하지만, 6등으로 만드는 것은 불가능하다.

//민우가 구매한 로또 번호를 담은 배열 lottos, 당첨번호를 담은 배열 win_nums가 매개변수로 주어진다.
	// ㄴ이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return하도록한다.

	public static void main(String[] args) {
		int[] lottos = new int[6];
		int[] win_nums = new int[6];
		Random r = new Random();
		int max, min;
		boolean isOk = false;
		// 배열의 인덱스 중 2개의 값은 같고 2개의 값은 다르며 2개의 값은 모른다.
		max = 45;
		min = 0;
		while (!isOk) {
			for (int i = 0; i < lottos.length; i++) {
				lottos[i] = r.nextInt(max - min + 1) + min;
				if(lottos[i]==lottos[i]) {
					break;
				}
				if(lottos[i]!=lottos[i]) {
					isOk = true;
				}
			}//for end
			
		}//while end
		System.out.println(Arrays.toString(lottos));
	}
//lottos는 길이 6인 정수 배열이다. = o
//lottos의 모든 원소는 0이상 45이하인 정수이다.
	// ㄴ0은 알아볼 수 없는 숫자를 의미한다.
	// ㄴ0을 제외한 다른 숫자들은 lotos에 2개 이상 담겨있지 않다.
	// ㄴlottos의 원소들은 정렬되어 있지 않을 수도 있다.
//win_nums은 길이 6인 정수 배열이다. = 0
//win_nums의 모든 원소는 1이상 45이하인 정수이다.
	// ㄴwin_nums에는 같은 숫자가 2개 이상 담겨있지 않다.
	// ㄴwin_nums의 원소들은 정렬되어 있지 않을 수도 있다.

}
