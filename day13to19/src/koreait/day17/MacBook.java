package koreait.day17;

public class MacBook extends SmartMachine {
	//SmartMachine 은 이미 RemoteControl, WebSearch인터페이스를 구현하였다.
	//이해를 위해서 아무것도 작성하지 않는다.
	
	//인터페이스의 인스턴스 (default)메소드
	@Override
	public void setMute(boolean mute) {
		System.out.println("mute 기능 없다.");
	}
	
	
	public void setBattery() {
		System.out.println("영구적인 배터리를 사용합니다.");
	}
	
	
	
}
