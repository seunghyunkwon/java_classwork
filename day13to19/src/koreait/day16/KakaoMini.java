package koreait.day16;

import java.text.DecimalFormat;

//			1. CreditCard 클래스 상속
public abstract class KakaoMini extends CreditCard {
	//시나리오:카카오미니는 학생용카드, 한도 최대금액이 존재

//			2. 생성자- 부모클래스의 설계에 따라 정의합니다.
	public KakaoMini(String owner) {
		super(owner);
	}

//			3. 상수 필드 MAX_LIMIT = 100000 선언합니다.
	static final int MAX_LIMIT = 100000;

//			4. toString 메소드 재정의 : 아래형식의 문자열 반환
//
//			홍길동 님. 이번달 결제예정금액 xxx,xxx 원 입니다.
//			[이용한도 yyy,yyy 원]
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,###원");
		return owner+"님 이번달 결제예정금액 :"+df.format(payTotal)+"원 입니다."+"[이용한도 :"+df.format(limit)+"원]";
	}
//
//			5. 추상메소드 구현
//
//			upLimit : puls 는 한도를 올리는 금액입니다. limit+plus 가 MAX_LIMIT을 초과하지 못하도록 한다.
//			초과하면 0을 리턴/ 초과하지 않으면 limit을 plus만큼 더하고,  plus를 리턴합니다.
//
	public int upLimit(int plus) {
		if(limit+plus>MAX_LIMIT) 
			return 0;			
		else {
			limit+=plus;
			return plus;		
		}
	}
//			pay : money 가 사용 금액입니다. money를 사용했을때 limit 를 초과하지 못하도록 합니다.
//			money+payTotal 이 limit 보다 크면 0을 리턴
//			초과하지않으면 money 금액 결제를 처리하여 payTotla에 더하고, money를 리턴합니다. 
	public int pay(int money) {
		if(payTotal+money>limit)
			return 0;
		else { payTotal+=money;
			return money;
		}
		
		
	}

}
