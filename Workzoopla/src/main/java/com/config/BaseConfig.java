package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig {
	
	public static  String getconfig(String key) throws Throwable {		
		
		Properties pro = new Properties();		
		
		String path ="./config.properties";
		FileInputStream fis = new FileInputStream(path);		
		
		pro.load(fis);		
		
		return pro.get(key).toString();
		
	}
}
