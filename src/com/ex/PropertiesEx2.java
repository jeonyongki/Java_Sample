package com.ex;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {

	public static void main(String[] args) {
		// commandline에서 inputfile을 지정해주지않으면 프로그램 종료
		System.out.println(args.length);
		if(args.length != 1) {
			System.out.println("USAGE : java PropertiesEx2 INPUTFILENAME");
			System.exit(0);
		}
		
		Properties prop = new Properties();
		String inputfile = args[0];
		try {
			prop.load(new FileInputStream(inputfile));
		} catch (IOException e) {
			System.out.println("지정된파일을 찾을수없습니다");
			System.exit(0);
		}
		
		String name = prop.getProperty("name"); 
		String[] data = prop.getProperty("data").split(",");
		int max=0, min=0, sum=0;
		
		for(int i=0; i<data.length; i++) {
			int intValue= Integer.parseInt(data[i]);
			if(i==0) max = min = intValue;
			
			if(max < intValue) {
			   max = intValue;
			}else if(min > intValue){
			   min = intValue;
			}
			sum += intValue;
		}
		System.out.println("이름 : "+name);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(float)sum/data.length);
	}

}