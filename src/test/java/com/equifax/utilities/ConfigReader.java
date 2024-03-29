package com.equifax.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop;
	
		static {
			
			prop = new Properties();
			
			String fileName = "config.properties";
			
			try {
				FileInputStream fis = new FileInputStream(fileName);
				prop.load(fis);
				fis.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		public static String getConfiguration(String key) {
			return prop.getProperty(key);
		}

}
