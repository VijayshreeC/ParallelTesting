package com.Manager;

public class DriverManagerFactory {
	
	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager;
		
		switch(type) {
		case CHROME :
			driverManager =  new ChromeDriverManager();
			break;
		default :
			driverManager =  new ChromeDriverManager();
		}
		return driverManager;
	}

}
