package sec02.exam13;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("전아린");
		String strVar2 = "전아린"; //문자열 리터롤생성
		String strVar3 = "전아린";
		//문자열 리터럴은 String 클래스의 인스턴스이며 힙 메모리의 특수 영역인 문자열 풀에 저장됨
		//자바에서 해당 값은 일단 생성되면 변경할 수 없음
		System.out.println(strVar1==strVar2);
		System.out.println(strVar2==strVar3);
		
		if(strVar1 == strVar2) {
			System.out.println("같은String객체를 참조");
		}else {
			System.out.println("다른String객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은String객체를 참조");
		}else {
			System.out.println("다른String객체를 참조");
		}
	}

}
