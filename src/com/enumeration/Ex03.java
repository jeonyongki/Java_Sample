package com.enumeration;

enum LoginResult{
	SUCCESS,
	FAIL_ID,
	FAIL_PASSWORD
}
public class Ex03 {

	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인 성공!");
		}else if(result == LoginResult.FAIL_ID) {
			System.out.println("아이디가 틀립니다!");
		}else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("패스워드가 틀립니다");
		}
		
	}


}

