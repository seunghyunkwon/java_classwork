package koreait.day15;

import java.util.Random;

public class MathProblem {
	private int n1, n2;
	private char op;	//연산자 +,-,*,/
	private boolean isCorrect;
	
	
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	public MathProblem(char op) {
		this.op=op;
	}
	public void makeProb() {//사칙연산 종류별로 적절한 난수 생성
		Random r = new Random();
		int max1=0, min1=0, max2=0, min2=0;
		switch(op){
			case '+':
				max1=99;min1=11;
				max2=99;min2=11;
				break;
				
			case '-':
				max1=99;min1=50;
				max2=49;min2=11;
				break;
			case '*':
				max1=77;min1=11;
				max2=29;min2=11;
				break;
			case '/':
				max1=77;min1=30;
				max2=29;min2=11;
				break;
				

		}
		n1=r.nextInt(max1-min1+1)+min1;
		n2=r.nextInt(max2-min2+1)+min2; 
		
	}
	
	public int showAnswer() {
		int result =0;
		
		switch(op) {
		case'+':
			result = n1 + n2;
			break;
		case'-':
			result = n1 - n2;
			break;
		case'*':
			result = n1 * n2;
			break;
		case'/':
			result = n1 / n2;
			break;
		}
		return result;
		
	}
	
	public void print() {
		System.out.println(n1+""+op+""+n2);
	}
	
	
	
	@Override
	public String toString() {
		return n1+" "+op+" "+n2;
	}
	//getter 메소드 작성
	public int getN1() {
		return n1;
	}
	public int getN2() {
		return n2;
	}
	public char getOp() {
		return op;
	}
	
	
	
}
