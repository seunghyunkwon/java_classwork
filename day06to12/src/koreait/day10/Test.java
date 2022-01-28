package koreait.day10;

public class Test {

	public static void main(String[] args) {
		
		int[] arr= new int[10];
		
		for(int i=0;i<5;i++)
			arr[i] = 11*i+1;
		System.out.println(TrialStr(arr));
	}
	static String TrialStr(int[] lst) {
		String trials = "";
		
		for (int l = 0; l < lst.length; l++) {
			if (l == lst.length - 1 || lst[l + 1] == 0) {
				trials += lst[l];
				break;
			} else	trials += lst[l] + ", ";
		}
		
		return trials;
}

}