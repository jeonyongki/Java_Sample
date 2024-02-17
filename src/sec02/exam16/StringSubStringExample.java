package sec02.exam16;

public class StringSubStringExample {

	public static void main(String[] args) {
		String ssn = "200304-4149126";
		
		String firstStr = ssn.substring(0,6);
		System.out.println(firstStr);
		
		String secondStr = ssn.substring(7);
		System.out.println(secondStr);
	}

}
