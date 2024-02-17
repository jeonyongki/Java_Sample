package sec03.exam02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		//추상클래스 인스턴스생성불가 정적메소드로Calendar하위객체를 얻음.
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);//연도
		int month = now.get(Calendar.MONTH)+1;// 0~11리턴
		int day = now.get(Calendar.DAY_OF_MONTH);// 1~30리턴
		
		int week = now.get(Calendar.DAY_OF_WEEK);//일 1~7리턴
		String strWeek = null;
		switch(week) {
		case Calendar.SUNDAY : strWeek = "일"; break; //1
		case Calendar.MONDAY : strWeek = "월"; break; //2
		case Calendar.TUESDAY : strWeek = "화"; break; //3
		case Calendar.WEDNESDAY : strWeek = "수"; break; //4
		case Calendar.THURSDAY : strWeek = "목"; break; //5
		case Calendar.FRIDAY : strWeek = "금"; break; //6
		case Calendar.SATURDAY : strWeek = "토"; break; //7
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) strAmPm = "오전";
		else if(amPm == Calendar.PM) strAmPm = "오후";
		//시간
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(strWeek + "요일 "+week);
		System.out.println(strAmPm + " "+amPm);
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	}

}
