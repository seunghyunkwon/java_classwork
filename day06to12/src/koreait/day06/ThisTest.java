package koreait.day06;

public class ThisTest {

	public static void main(String[] args) {
		
		System.out.println("ThisTest");
		
		This k = new This();
		k.inputData();
		k.outputData();
		
		System.out.println("총점 : "+k.sum());
		System.out.println("평균: "+k.avg(3));
	}
	
	
}
