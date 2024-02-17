package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
//		p.setProperty("autosave", "5");
//		p.setProperty("language", "한글");
//		p.setProperty("time", "10");
		System.out.println(p);
		
		System.out.println(p.getProperty("time"));
		System.out.println(p.getProperty("time2"));
		System.out.println(p.getProperty("time2","0"));
		
		p.list(System.out);
		try {
			p.load(new FileInputStream("output.txt"));
			System.out.println(p);
			p.store(new FileOutputStream("output.txt"),"Properties Example");
			p.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
