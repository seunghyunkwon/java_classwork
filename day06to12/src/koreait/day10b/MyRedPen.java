package koreait.day10b;

import java.util.Random;

public class MyRedPen {

	private String name;		//참가자 이름
	private int cnt;			//시도횟수, 초기값 0
	private boolean isSuccess;	//성공여부, 초기값 false
	
	public MyRedPen(String name) {
		this.name=name;
		
	}
	
	public int Quiz(int min, int max) {	//11~99
		Random r = new Random();
		return r.nextInt(max-min+1)+min;	//r.nextInt(199)+101;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
