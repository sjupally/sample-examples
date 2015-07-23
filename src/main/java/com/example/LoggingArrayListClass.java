package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level; // For Setting the Logging Level
import java.util.logging.Logger;

public class LoggingArrayListClass {
	private final static Logger logger = Logger.getLogger(LoggingArrayListClass.class.getName()); // Initializing
																									// the
																									// Logger

	public static void main(String args[]) {
		
		List<String> lst = new ArrayList<String>(0);
		if (logger.isLoggable(Level.INFO)) { // Setting the Logging Level to
												// info
			logger.info("***** main(args=" + Arrays.asList(args) + ")");
		}

		if (logger.isLoggable(Level.INFO)) {
			logger.info("***** Inside main() method");
		}

		lst.add("GAURAV");
		lst.add("SHIVAM");
		lst.add("ARYAN");

		logger.info("Added Names are-");
		for (String lstStr : lst) {
			logger.info(lstStr);
		}

	}
}