package com.Reader;

import java.io.IOException;

public class FileManagerReader {
	
	private FileManagerReader(){}
	
	public static FileManagerReader getInstanceFR() {
		FileManagerReader reader = new FileManagerReader();
				return reader;
	}

	
	public   ConfigurationReader getInstanceCr() throws IOException {
		
		ConfigurationReader helper = new ConfigurationReader();
		return helper;
		
		}
	
	
	
}
