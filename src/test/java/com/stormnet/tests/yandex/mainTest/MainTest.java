package com.stormnet.tests.yandex.mainTest;

import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.AbstractPageActions;
import com.stormnet.yandex.framework.actions.LoginPageActions;
import com.stormnet.yandex.framework.actions.diskActions.DiskPageActions;
import com.stormnet.yandex.framework.actions.diskActions.FilesPageActions;
import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPage;
import org.testng.annotations.Test;

public class MainTest extends AbstractTest {

	@Test(testName = "Login to the system with right credentials")
	public void LoginTestRightCredentials() {
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

		MailPageActions.MailFormActions.sendMail("orlovkirilltest1205@yandex.by",
				"Automation",
				"LetsAutomateThisCase",
				file);

		MailPageActions.sendFileToDisk(file);

		AbstractPageActions.HeaderPanelActions.openDiskPage();
//
		DiskPageActions.DiskSideBarMenuActions.openDownloadsPage();

		DiskPageActions.moveFileToFilesFolder(DownloadsPage.getDownloadedFile());

		DiskPageActions.DiskSideBarMenuActions.openFilesPage();

		FilesPageActions.moveDownloadedFileToBin();

	}
}