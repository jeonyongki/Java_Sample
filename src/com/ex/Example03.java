package com.ex;
/*
 * Hashtable로 key(아이디),value(비빌번호) 저장.
 * 입력값을 받아서 로그인 출력 여부
 *  
 * */
import java.util.*;
public class Example03 {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String pwd = scanner.nextLine();
			System.out.println();
			if(map.containsKey(id)) {//키존재
				if(map.get(id).equals(pwd)) {//값비교
					System.out.println("로그인 완료");
					break;
				}else {
					System.out.println("비밀번호 오류");
				}
			}else {
				System.out.println("아이디 없음");
			}
		}
	}

}
