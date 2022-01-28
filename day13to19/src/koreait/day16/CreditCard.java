package koreait.day16;

public abstract class CreditCard {
	
//	1. 필드
//	접근한정자는 protected 로 하세요.
//	String owner , int limit, int payTotal
//	(소유자,        이용한도,    결제금액)
//
	
	protected String owner;		//소유자	
	protected int limit;		//이용한도
	protected int payTotal;		//결제금액
	//*부모클래스는 자식클래스가 사용하도록 protected로 합니다.
	
//	2. 생성자
//	owner 필드값을 저장하는 커스텀 생성자만 정의합니다.
//
	public CreditCard(String owner) {
		this.owner=owner;
	}

	
//	3. getter 메소드 
//	각 필드값을 가져오는 메소드 정의합니다.
//	

	public String getOwner() {
		return owner;
	}

	public int getLimit() {
		return limit;
	}

	public int getPayTotal() {
		return payTotal;
	}


//	4. 추상메소드 선언
//	반환값 int , 이름 upLimit , 인자 int puls 1개  -> 이용한도 올리는 메소드입니다.
//	반환값 int , 이름 pay , 인자 int money 1개 -> 카드사용하는 메소드 입니다. money 금액을 결제합니다.
	public abstract int upLimit(int puls);
	
	public abstract int pay(int money);
	
	
}
