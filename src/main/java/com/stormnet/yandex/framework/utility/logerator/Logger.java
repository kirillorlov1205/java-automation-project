package com.stormnet.yandex.framework.utility.logerator;

import org.slf4j.LoggerFactory;

public class Logger {

	public static org.slf4j.Logger getLogger() {
		StackTraceElement caller = new Throwable().fillInStackTrace().getStackTrace()[1];
		return LoggerFactory.getLogger(caller.getClassName() + "[" + caller.getMethodName() + "]");
	}
}
