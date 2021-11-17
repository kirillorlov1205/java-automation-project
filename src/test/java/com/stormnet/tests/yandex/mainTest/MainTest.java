package com.stormnet.tests.yandex.mainTest;

import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.AbstractPageActions;
import com.stormnet.yandex.framework.actions.LoginPageActions;
import com.stormnet.yandex.framework.actions.diskActions.DiskPageActions;
import com.stormnet.yandex.framework.actions.diskActions.FilesPageActions;
import com.stormnet.yandex.framework.actions.mailActions.MailFormActions;
import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPage;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import org.testng.annotations.Test;

public class MainTest extends AbstractTest {

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

		MailFormActions.sendMail("orlovkirilltest1205@yandex.by",
				"Automation",
				"LetsAutomateThisCase",
				FileManager.getFile().getAbsolutePath());

		MailPageActions.sendFileToDisk();

		AbstractPageActions.HeaderPanelActions.openDiskPage();

		DiskPageActions.DiskSideBarMenuActions.openDownloadsPage();

		DiskPageActions.moveFileToFilesFolder(DownloadsPage.getDownloadedFile().getElement());

		DiskPageActions.DiskSideBarMenuActions.openFilesPage();

		FilesPageActions.moveDownloadedFileToBin();

	}
}