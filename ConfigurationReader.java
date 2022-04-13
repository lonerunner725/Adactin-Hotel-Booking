package com.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	static Properties p;
	
	public ConfigurationReader() throws IOException{

	File f = new File("C:\\Users\\Deepthi\\eclipse-workspace\\adactinproject\\propertyfile\\configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	
	}
			
	public static String geturl() {
		String url = p.getProperty("url");
		return url;

	}
	
	public String getccno() {
		String ccno = p.getProperty("ccno");
		return ccno;

	}
	public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
    }

}
