package com.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * [execute]
 * 아메리카노 : [Guest@주소1, Guest@주소2]
 * 카페라테 : [Guest@주소3, Guest@주소4, Guest@주소5] 
 * 
 *  손님 : 2명 출력
 *	손님 : 3명 출력
 *	밀크티 : 메뉴없음.
 * 
 * */
class Guest{
	//field
	private String id;
	//constructor
	Guest(String id){ this.id = id;}
	
	@Override
	public String toString() {
		return this.id;
	}
}

public class Example01 {
	public static void main(String args[]) {
		Map<String, List<Guest>> map = new HashMap<>();
		//주문 리스트
		List<Guest> orderList1 = new ArrayList<Guest>();
		orderList1.add(new Guest("손님1"));
		orderList1.add(new Guest("손님2"));
		List<Guest> orderList2 = new ArrayList<Guest>();
		orderList2.add(new Guest("손님3"));
		orderList2.add(new Guest("손님4"));
		orderList2.add(new Guest("손님5"));

		map.put("아메리카노", orderList1);
		map.put("카페라테", orderList2);

		System.out.println(map);
		System.out.println(map.get("카페라테").get(0));
		if(args.length != 1) System.exit(0);
		//주문수
		if(map.containsKey(args[0])) {
			int size = map.get(args[0]).size();
			System.out.println("주문수 : "+size+"명");
//			for(Guest guest : map.get(args[0])) {
//				System.out.println(guest);
//			}
			for(int i=0; i<size; i++) {
				Guest guest = map.get(args[0]).get(i);
				System.out.println(guest);
			}
		}else {
			System.out.println("메뉴없음");
		}
	}
}
