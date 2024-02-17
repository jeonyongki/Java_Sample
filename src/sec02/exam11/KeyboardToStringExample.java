package sec02.exam11;

import java.util.Arrays;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception{
		//바이트를 문자열로 변환
		byte bytes[] = new byte[100];
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);//데이터를읽어들이고 바이트수를 반환
		System.out.println(readByteNo);
		System.out.println(Arrays.toString(bytes));
		
		//마지막 문자열 바로 앞에서 끝나는 새 문자열을 생성
		String str = new String(bytes, 0, readByteNo-2);//바이트배열, 배열인덱스, 바이트배열읠 끝인덱스 -2마지막문자제거
		System.out.println(str);
	}

}
 