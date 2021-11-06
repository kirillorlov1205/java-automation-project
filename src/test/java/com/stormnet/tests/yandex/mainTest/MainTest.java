package com.stormnet.tests.yandex.mainTest;


import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.*;
import com.stormnet.yandex.framework.actions.diskActions.DiskPageActions;
import com.stormnet.yandex.framework.actions.diskActions.DownloadsPageActions;
import com.stormnet.yandex.framework.actions.mailActions.MailFormActions;
import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
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
		DownloadsPageActions.invokeContextMenuForLastFile();
		DownloadsPageActions.clickMovingContextButton();

		//


	}

}
