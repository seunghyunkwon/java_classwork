package koreait.day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	//날짜와 시간형식을 다루는 자바클래스
	//1)java.util.Date 클래스 2)java.util.Calendar 클래스
	//3)java 8버전 LocalDate(날씨), LocalTime(시간), LocalDateTime(날짜와 시간) 클래스
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("날짜 확인: "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("시간 확인: "+currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("날짜와 시간 확인: "+current);
		
		//임의 날짜 또는 시간으로 객체를 생성한다.
		LocalDate mybirth = LocalDate.of(1992, 7, 25);
		System.out.println("내 생일 날짜 확인: "+mybirth);
		
		LocalTime mybirth_time = LocalTime.of(0, 0);
		System.out.println("내 탄생 시간 확인: "+mybirth_time);
		
		//현재 날짜로부터 5일 후를 계산
		int day=5;
		System.out.println("오늘 날짜 +"+day+"일은"+currentDate.plusDays(day));
		day=30;
		System.out.println("오늘 날짜 -"+day+"일은"+currentDate.minusDays(day));
		
		//태어난날로부터 경과시간
		Period between = Period.between(mybirth, currentDate);
		System.out.println("내가 태어난지 "+between.getYears()+"년");
		System.out.println("내가 태어난지 "+between.getMonths()+"달");
		System.out.println("내가 태어난지 "+between.getDays()+"일");
		
		long test = ChronoUnit.DAYS.between(mybirth, currentDate);
		System.out.println("test = "+test);
		
		test = ChronoUnit.YEARS.between(mybirth, currentDate);
		System.out.println("test = "+test);
		
	}
}
