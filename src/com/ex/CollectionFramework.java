package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet ;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* 
 * # 컬렉션
 * 
	자료구조를 객체모델링한 클래스들의 묶음 java.util패키지
	1 Set(HashSet) : 검정주머니(않보임) 순서가없다, 중복된데이터 허용안됨.
	2 List(ArrayList) : 배열 순서가있다, 중복된데이터 허용
	3 Map(HashMap) : 사전 키와값 한쌍으로 이루어진 데이터 저장하는 방식
 * 
 * 
 * [ex] 1부터 45숫자 6개를 무작위로 출력하세요.
	1.Random객체를 생성한다.
	2.Set객체를 생성한다.
	3.무한반복문을 작성한다.
	3-1 > Random객체의 nextInt메서드 호출하기
	3-2 > 만약에 Set객체 사이즈가 6이면 반복문 빠져나오기
	3-3 > 반복문내에서 Set객체 요소추가하기add
*/
class SetExample{
	public void runSetExample() {
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		
		Set<String> set2 = new HashSet<>();
		set2.add("ab");
		set2.add("cd");
		set2.add("ef");
		
		System.out.println(set1);
		System.out.println(set2);
		//랜덤함수
		Random random = new Random();
		Set<Integer> set3 = new HashSet<>();
		while(true) {
			if(set3.size()==6) break;
			set3.add(random.nextInt(6)+1);
		}
		System.out.println(set3);
	}
}
//Map객체에 요소추가
class MapExample{
	public void runMapExample(String key) {
		Map<String, List<Integer>> map = new HashMap<>();
		ArrayList<Integer> bList = new ArrayList<Integer>();
		bList.add(1);
		bList.add(2);
		bList.add(3);
		map.put("a", bList);
		//Arrays.asList(new int[]{1, 2, 3, 4})));메서드 활용.
		//배열을 원래 배열이 지원하는 고정 크기 목록으로 변환
		map.put("b", new ArrayList<>(Arrays.asList(4,5,6,7)));
		
		System.out.println(map);
		//값 꺼내오기
		if(map.containsKey(key)) {
			if(key.equals("a")) 
				System.out.println("a[2] : "+map.get("a").get(2));
			else if(key.equals("b"))
				System.out.println("b[3] : "+map.get("b").get(3));
		}else {
			System.out.println("존재하지 않는 key");
		}
	}
}

public class CollectionFramework {

	public static void main(String[] args) {
		//Set
		SetExample set = new SetExample();
		set.runSetExample();
		//Map
		MapExample map = new MapExample();
		map.runMapExample(args[0]);
	}

}
