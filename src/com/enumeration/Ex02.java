package com.enumeration;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		
		Week today = null;//열거타입 변수선언
		Calendar cal = Calendar.getInstance();
		//일(1) ~ 토(7)까지의 숫자를 리턴
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1 : 
			today = Week.SUNDAY;
			System.out.print(today);
//			today = Week.일요일; 
			break;
		case 2 : 
			today = Week.MONDAY;
			System.out.print("오늘은 "+today);
//			today = Week.월요일; 
			break;
		case 3 : 
			today = Week.TUESDAY;
			System.out.print("오늘은 "+today);
//			today = Week.화요일; 
			break;
		case 4 : 
			today = Week.WEDNESDAY;
			System.out.print("오늘은 "+today);
//			today = Week.수요일; 
			break;
		case 5 : 
			today = Week.THURSDAY;
			System.out.print("오늘은 "+today);
//			today = Week.목요일; 
			break;
		case 6 : 
			today = Week.FRIDAY;
			System.out.print("오늘은 "+today);
//			today = Week.금요일; 
			break;
		case 7 : 
			today = Week.SATURDAY;
			System.out.print("오늘은 "+today);
//			today = Week.토요일;
			break;
		}
		
		if(today.equals(Week.SATURDAY)||today.equals(Week.SUNDAY)) {
			System.out.println("\n주말은 가족과 보냅니다");
		}else {
			System.out.println("\n학원에 갑니다");
		}
	}

}

