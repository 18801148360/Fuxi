package com.coderdream.log4j;

import org.apache.log4j.Logger;

public class HelloLog4j {
	private static Logger logger=Logger.getLogger(HelloLog4j.class);
	
	public static void main(String[] args){
		
		//��¼dehug�������Ϣ
		logger.debug("This is debug message.");
		//��¼info�������Ϣ
		logger.info("This is info message");
		//��¼error�������Ϣ
		logger.error("This is error message");
	}
	
}
