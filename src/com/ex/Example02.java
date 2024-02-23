package com.ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * Map객체의 ketSet()메서드 활용 
 * 카페 메뉴 가져오기.
 * 
 * */
public class Example02 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("아메리카노", 2000);
		map.put("카페라테", 2000);
		map.put("카푸치노", 3000);
		map.put("말차라테", 4000);
		map.put("바닐라라테", 3000);
		//here
		Set<String> set = map.keySet();
		System.out.println(set);
		//Iterator인테페이스 활용(데이터에 순차적으로 접근)
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String out = iter.next();
			System.out.println(out);
		}
		//key의 데이터타입과동일, 키의 목록(집합)구하기 ketSet()
		Set<String> keyList = map.keySet();
		System.out.println(keyList);
		//값의 목록(집합)을 구하자 values()
		Collection<Integer> vList = map.values();
		System.out.println(vList); 
		//키의 존재여부판단 : containsKey(키)
		System.out.println("아메리카노 존재?"+map.containsKey("아메리카노"));
		//값의 존재여부판단 : containsValue(값)
		System.out.println("카페라테?"+map.containsValue(2000));
		System.out.println("------------------------------------");
		//값을 알고있을때 해당키를 구하시오.
		//Qs? 2000원하는 커피를 알고싶다..
		//1.값이 맵에 존재하는가?
		//2.존재한다면 키 집합을 생성 
		//3.키 집합에서 키를 하니씩가져와서 알고있는 값과 비교
		//4.비교값이 true면 해당 메뉴임.
		if(map.containsValue(2000)) {
			Set<String> kSet = map.keySet();
			Iterator<String> key = kSet.iterator();
			while(key.hasNext()) {
				String m = key.next();
				if(map.get(m).equals(2000)) {
					System.out.println("메뉴:"+m);
				}
			}
			
		}
	}

}
