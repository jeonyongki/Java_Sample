package sec02.exam27;

public class MathRandomExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("num : "+num);
		
		int num2 = (int)(Math.random()*6)+1;
		System.out.println("주사위 눈 : "+num2);
	}

}
