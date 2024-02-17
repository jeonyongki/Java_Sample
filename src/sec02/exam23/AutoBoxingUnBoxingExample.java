package sec02.exam23;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//자동 언박싱
		//Integer 클래스의 intValue() 메서드를 명시적으로 호출하여 
		//Integer 객체를 기본 int 값으로 변환
		Integer obj = 100;
		System.out.println("value "+obj.intValue());
		
		//Integer 클래스의 toString() 메서드가 암시적으로 호출되어 
		//Integer 객체의 문자열 표현을 반환
		System.out.println("value "+obj);
		
		int value = obj;
		System.out.println("value "+value);

		int result = obj +100;
		System.out.println("result "+result);
		
	}

}
