package sec02.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "C 프로그래밍";
		int location = subject.indexOf("로");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
			
		}
		
		if(subject.contains("자바")) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
			
		}
	}

}
