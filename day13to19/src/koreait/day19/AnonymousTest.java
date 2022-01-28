package koreait.day19;

public class AnonymousTest {

	public static void main(String[] args) {
		
//		RemoteCon rc = new RemoteCon();
		//오류 : 인터페이스와 추상클래스는 직접 객체를 생성하지 않는다.
		
		RemoteCon rc = new RemoteCon() {	//Anonymous Inner Type (한번만 사용할 클래스)
			
			@Override
			public void turnOnOff() {
				System.out.println("전원 on/off");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨 up/down: "+volume);
				
			}
		};	//익명클래스 정의 끝날 때;
		
		rc.turnOnOff();
		rc.setVolume(10);
		rc.setBattery();
		
		Animal animal = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("아직 모른다.");
				
			}
		};
		animal.sound();
	}
}
