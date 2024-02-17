package sec02.exam14;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		byte[] byte1 = str.getBytes();//인코딩
		
		System.out.println(byte1.length);
		
		String str1 = new String(byte1);//디코딩
		
		System.out.println(str1);
		try {
//문자열을 바이트 배열로 변환할 때 인코딩은 메소드에 대한 인수로 명시적으로 지정
			byte[] byte2 = str.getBytes("EUC-KR");
			
			System.out.println(byte2.length);
			System.out.println(Arrays.toString(byte2));
			String str2 = new String(byte2, "EUC-KR");//디코딩
			System.out.println(str2);
			
			byte[] byte3 = str.getBytes("UTF-8");			
			System.out.println(byte3.length);
			System.out.println(Arrays.toString(byte3));
			String str3 = new String(byte3, "UTF-8");//디코딩
			System.out.println(str3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//인코딩
	}

}
