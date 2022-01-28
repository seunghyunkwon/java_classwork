package koreait.day03;

public class LogicalOPTest { // 논리연산을 연습한다.
	// 논리연산 : and (&&), or (||),  not (!)  -> 연산결과는 boolean 타입이다.
	//	-> 관계연산을 복합적으로 검사할 때 사용한다.
	
	public static void main(String[] args) {
		// 응용 : 국어점수 90점 이상이고 총점이 250점 이상이면 국어 특기 우수 학생
	int korean, sum;
	
	korean = 92;
	sum = 250;
	
	if(korean >=90 && sum >=250)
		System.out.println("국어 특기 우수 학생");
	
	//else 없는 if 형식이다.
	
	//	: 국어 점수가 80점 이상이거나 총점이 200점 이상이면 pass
	
	korean = 77;
	sum = 190;
	
	if(korean >=80 || sum >= 200)
		System.out.println("pass!!!");
	
	System.out.println("끝");
		
	System.out.println("논리연산 결과 확인하기 : and");
	System.out.println(" true and true = "+ (true && true));
	System.out.println(" true and false = "+ (true && false));
	System.out.println(" false and true = "+ (false && true));
	System.out.println(" false and false = "+ (false && false));
	
	System.out.println("논리연산 결과 확인하기 : or");
	System.out.println(" true and true = "+ (true || true));
	System.out.println(" true and false = "+ (true || false));
	System.out.println(" false and true = "+ (false || true));
	System.out.println(" false and false = "+ (false || false));
	
	System.out.println("논리연산 결과 확인하기 : not");
	System.out.println(" not ture = " + !true); //true 값을 반대(not)값으로 바꾼다.
	System.out.println(" not false = " + !false);
	
	//Quiz	 : korean 국어점수가 40~69인 학생들은 "선생님 면담"을 출력한다.
	korean = 69;
	if(korean >=40 && korean <70)		//40이상이면서 70미만
	System.out.println("선생님 면담!!!");
	
	
	//		 : korean 국어점수가 0~100이 아닌 값은 "잘못된 값" 출력한다.
	korean = 19;
	if(korean < 0 || korean > 100 )
		System.out.println("잘못된 값!!");
	
//	if(!(korean >=0 && korean <=100))
//		System.out.println("잘못된 값1"); // 1) 0~100이 아니다.
//	
	}

}
