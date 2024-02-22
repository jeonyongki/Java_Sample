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
		Map<String, String> map = new HashMap<>();
		map.put("아메리카노", "americano");
		map.put("카페라테", "caffe latte");
		map.put("말차라테", "matcha latte");
		map.put("바닐라라테", "vanilla latte");
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
		Collection<String> vList = map.values();
		System.out.println(vList); 
		//키의 존재여부판단 : containsKey(키)
		System.out.println("아메리카노 존재?"+map.containsKey("아메리카노"));
		//값의 존재여부판단 : containsValue(값)
		System.out.println("caffe latte?"+map.containsValue("caffe latte"));
		System.out.println("------------------------------------");
		//값을 알고있을때 해당키를 구하시오.
		//americano의 메뉴 이름을 알고싶다..
		//1.값이 맵에 존재하는가?
		//2.존재한다면 키 집합을 생성
		//3.키 집합에서 키를 하니씩가져와서 알고있는 값과 비교
		//4.비교값이 true면 해당 메뉴임.
		if(map.containsValue("americano")) {
			Set<String> kSet = map.keySet();
			Iterator<String> key = kSet.iterator();
			while(key.hasNext()) {
				String m = key.next();
				if(map.get(m).equals("americano")) {
					System.out.println("메뉴:"+m);
				}
			}
			
		}
	}

}
