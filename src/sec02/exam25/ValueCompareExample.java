package sec02.exam25;

public class ValueCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		//-128 ~ 127 범위의 값이 아닌경우 언박싱한 값을 얻어 비교함
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}

}
