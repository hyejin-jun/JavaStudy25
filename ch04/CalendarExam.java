package ch04;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// 내장된 클래스를 이용하여 요일 계산을 해 보자
		
		Week today = null ;
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR) ;
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH)+1 ;
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("혅재 날짜는 " + year + " 년 " + month + "월 " + day + " 일입니다" );
		
		int hour = cal.get(Calendar.HOUR) ;
		int minute = cal.get(Calendar.MINUTE) ;
		int second = cal.get(Calendar.SECOND) ;
		System.out.println("현재 시간은 "  + hour + " 시 " + minute + " 분 " + second + " 초입니다");
	
		
		switch (week) {
		
		case 1:
			today = Week.SUNDAY ; break ;
			
		case 2:
			today = Week.MONDAY ; break ;
			
		case 3:
			today = Week.TUESDAY ; break ;
			
		case 4: 
			today = Week.WEDNESDAY ; break ;
			
		case 5:
			today = Week.THURSDAY ; break ;
			
		case 6:
			today = Week.FRIDAY ; break ;
			
		case 7:
			today = Week.SATURDAY ; break ;
		}
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일입니다! 열심히 쉽니다 ㅎㅎ");
		} else if (today == Week.MONDAY) {
			System.out.println("월요일입니다.. 자바 공부를 하러 수원에 옵니다 ㅜㅜ");
		}else if (today == Week.TUESDAY) {
			System.out.println("화요일입니다.. 수요일에는 쉬었지 이런 생각을 가지고 수원에 옵니다 ㅜㅜ");
		}else if (today == Week.WEDNESDAY) {
			System.out.println("수요일입니다.. 예전에 쉬었던 걸 생각하며 수원에 옵니다 ㅜㅜ");
		}else if (today == Week.THURSDAY) {
			System.out.println("목요일입니다.. 다들 실력이 좋아서 울면서 수원에 옵니다 ㅜㅜ");
		}else if (today == Week.FRIDAY) {
			System.out.println("금요일입니다.. 내일 쉰다는 생각에 버티며 수원에 옵니다 ㅜㅜ");
		}else if (today == Week.SATURDAY) {
			System.out.println("토요일입니다.. 복습 좀 하다가 영화를 보며 쉽니다 ㅎㅎ");
		}
		
		
		
	
		
	}

}
