package koreait.day06;

public class Exam {
	int num;
	String name;
	int korean, english, science;

//	필드 : 번호(num), 이름(name), 국어점수(korean), 영어점수(english), 과학점수(science)
//	메소드 : 모든 필드값 출력하는 메소드	 printScore
	void printScore() {
		System.out.println("[번호:" + num + ", 이름:" + name + "]국어: " + korean + ", 영어: " + english + ", 과학: " + science);
	}

//			총점 계산하고 결과값 리턴하는 메소드 sum
	int sum() {
		return korean + english + science;
	}

//			평균 계산하고 결과값 리턴하는 메소드 avg
	double avg(int count) {
		return (double) (korean + english + science) / count;

	}
}
