package koreait.day19;

public interface WordNote {

	
	//무슨 메소드 일까요 ...? 추상메소드, 생략된 키워드는 ? public abstract
	void wordadd();
	void wordList();
	void wordSave(String filename);
	void wordRead(String filename);
	
	//default 메소드 (인스턴스메소드)	: 이미 여러개의 클래스가 WordNote 인터페이스를 구현한 상황이라면
	//							새로운 추상메소드를 추가하면 오류 발생
	//							해결 방법중 하나가 default 메소드를 정의하고 클래스가 오버라이드
	default void start() {
		
	}
}
