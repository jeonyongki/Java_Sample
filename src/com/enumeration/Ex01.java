package com.enumeration;

//열거타입(enumeration type) 관련성있는 상수들의 집합
enum Week{
	//열거상수 선언(열거타입의 값으로 사용됨)
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY,
//	월요일,
//	화요일,
//	수요일,
//	목요일,
//	금요일,
//	토요일,
//	일요일
}

public class Ex01 {

	public static void main(String[] args) {
		//열거상수는 객체!		
		Week today = Week.FRIDAY;
		//열거타입변수는 참조타입 null사용가능
		today = null;

		//메소드영역(static)에 같은 객체를 참조
		today = Week.SUNDAY;
		boolean type = (today == Week.SUNDAY);
		
		System.out.println(type);
	}

}
