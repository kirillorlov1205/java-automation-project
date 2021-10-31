package com.stormnet.listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomerTestNGListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test " + result.getTestName() + " was " + result.getStatus());
	}

}
