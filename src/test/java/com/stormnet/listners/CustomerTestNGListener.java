package com.stormnet.listners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.logging.LogManager;

public class CustomerTestNGListener implements ITestListener {

	private static final Logger logger = LoggerFactory.getLogger("legger");

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test {}" + result.getTestName() + "finished with status: " + result.getStatus());
	}

}
