package sec02.exam26;

public class MathExample {

	public static void main(String[] args) {
		//절대값 생성
		int v1 = Math.abs(-5);
		System.out.println("v1 : "+v1);
		
		double v2 = Math.abs(-3.14);
		System.out.println("v2 : "+v2);
		
		//올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 : "+v3);
		System.out.println("v4 : "+v4);
		
		//버림값
		double v5 = Math.floor(5.4);
		double v6 = Math.floor(-5.4);
		System.out.println("v5 : "+v5);
		System.out.println("v6 : "+v6);
		
		//최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 : "+v7);
		System.out.println("v8 : "+v8);
		
		//최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 : "+v9);
		System.out.println("v10 : "+v10);
		
		//랜덤값 난수를 돌려줌 0.0이상 1.0미만 사이의 실수double값 리턴
		double v11 = Math.random();
		System.out.println("v11 : "+v11);
		
		//가장 가까운 정수의실수값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 : "+v12);
		System.out.println("v13 : "+v13);
		
		//반올림값(실수>long타입 정수로 반환)
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 : "+v14);
		System.out.println("v15 : "+v15);
		
		double value = 12.3456;
		double tmp1 = value * 100; //1234.56
		double tmp2 = Math.round(tmp1);
		double v16 = tmp2 / 100.0;//정수 / 실수 = 실수
		System.out.println("v16 : "+v16);
	}

}
