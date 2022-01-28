package koreait.day17;

public class Day17App1 {

	public static void main(String[] args) {
		//다형성 예시	- 객체의 실체는 1개이나 여러가지 타입으로 참조할 수 있다.
		//어떤 메소드의 인자 타입 RemoteControl 이라면 mac1,mac2,mac3,mac4 모두 인자로 전달할 수 있다.
		
		
		MacBook mac1 = new MacBook();		//사나
		SmartMachine mac2 = new MacBook();	//모모	//부모타입으로 선언한 경우
		
		mac1 = (MacBook)mac2;	//down casting(자식타입으로참조)
		mac2 = mac1;			//up casting (부모타입으로참조)
		
		mac1.turnOnOff();
		mac1.turnOnOff();
		
		//인터페이스 타입으로 선언한 경우
		RemoteControl mac3 = new MacBook();	//나연
		WebSearch mac4 = new MacBook();		//다현
		
		mac1.setVolume(13);
		mac1.search("유튭");
		
		mac3.setVolume(19);
//		mac3.search("YouTube");
		//오류의 원인 : mac3의 참조타입 RemoteControl은 search메소드가 없다.
		
//		mac4.setVolume(13);
		//오류의 원인 : mac4의 참조타입 WebSearch는 setVolume메소드가 없다.
		mac4.search("유튭");
		
//		필요하다면 casting으로 메소드를 실행한다
		MacBook temp=(MacBook)mac4;	//*temp와 mac4참조변수가 저장하는 주소는 같다.
		temp.setVolume(11);
		
		WebSearch web = temp;	//자동 캐스팅
//		web=mac3;
		
		//다현이의 맥북이 가리키는 변수 mac4, temp, web이고 모두 같은 값이다.
		
		
		//mac3이 RemoteControl 타입
		//인터페이스 static 메소드는 Interface로만 사용할 수 있다.
		RemoteControl.changebettery();
		
		//인터페이스의 인스턴스 메소드
		mac1.setMute(false);
		mac2.setMute(false);
		mac3.setMute(true);
//		mac4.setMute();	
		//오류 : RemoteControl을 구현한 객체이면서 참조타입이 RemoteControl 그룹에 속해있을 때 사용가능하다.
		
		
		
	}
}
