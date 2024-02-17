package sec02.exam01;
import static java.lang.System.out;
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String str = null;
//		System.out.println(str.length());
		
		try {//일반예외는 try-catch-finally로 처리
			Class clazz = Class.forName("java.lang.System");
			out.printf("%s 클래스가 존재함", clazz);
		} catch (ClassNotFoundException e) {
			String error = e.getMessage();
			out.println("클래스가 존재하지않음\n"+error);
		}finally {
			out.println(str);
		}
	}

}
