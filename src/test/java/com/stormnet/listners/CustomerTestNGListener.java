package com.stormnet.listners;

import com.stormnet.yandex.framework.utility.logerator.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomerTestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Logger.getLogger().debug("Test {} start", result.getTestName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Logger.getLogger().info("Test {} is finished with status: {}", result.getTestName(), result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Logger.getLogger().error("Test {} finished with status: " + result.getStatus(), result.getThrowable());
	}

}
