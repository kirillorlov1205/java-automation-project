package com.stormnet.tests.yandex.mainTest;


import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.*;
import com.stormnet.yandex.framework.actions.diskActions.DiskPageActions;
import com.stormnet.yandex.framework.actions.diskActions.DownloadsPageActions;
import com.stormnet.yandex.framework.actions.mailActions.MailFormActions;
import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DiskPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPageWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainTest extends AbstractTest {

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

		MailFormActions.sendMail("orlovkirilltest1205@yandex.by",
				"testTopic", "testText", "D:\\stormDev\\AutomationProject\\src\\test\\resources\\testFile");

		MailPageActions.sendFileToDisk();

		HeaderPanelActions.openDiskPage();

		DiskPageActions.openDownloadsPage();

		DiskPageActions.moveToFilesPage(DownloadsPageWrapper.getLastDownloadedFile());

//		move to separate check
		WebElement element = UiDriver.getDriver().findElement(By.xpath("//button[contains(@class,\"Button2 Button2_theme_raised Button2_view_action Button2_size_m confirmation-dialog__button confirmation-dialog__button_submit\")]"));
		if (element.isDisplayed()) {
			element.click();
			DiskPageWrapper.getFilesButton().click();
		}
	}
}
