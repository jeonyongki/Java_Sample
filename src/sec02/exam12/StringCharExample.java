package sec02.exam12;

public class StringCharExample {

	public static void main(String[] args) {
		String ssn  = "200304-41491260";
		//인덱스에 지정된 문자를 가져옴
		char sex = ssn.charAt(7);
		System.out.println(sex);
		if(sex != 1 || sex != 3) {
			System.out.println("여성");
		}else {
			System.out.println("남성");
		}
		
		switch(sex) {
		case '1' : case '3' : 
			System.out.println("남자입니다");
			break;
		case '2' : case '4' :
			System.out.println("여자입니다");
			break;
		default :
			System.out.println("잘못된번호입니다");
		}
	}

}
