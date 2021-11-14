package com.stormnet.tests.yandex.mainTest;

import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.AbstractPageActions;
import com.stormnet.yandex.framework.actions.LoginPageActions;
import com.stormnet.yandex.framework.actions.diskActions.DiskPageActions;
import com.stormnet.yandex.framework.actions.diskActions.FilesPageActions;
import com.stormnet.yandex.framework.actions.mailActions.MailFormActions;
import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPage;
import org.testng.annotations.Test;

public class MainTest extends AbstractTest {

	// TODO: 11/10/2021 i'll add logback
	// TODO: 11/10/2021 перестали работать скриншоты при ошибке теста
	// TODO: 11/12/2021 new file class  + проверка что письмо пришло
	// TODO: 11/12/2021 абстрактная страница  + вложить хедер класс + вложить сайдбар

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

		MailFormActions.sendMail("orlovkirilltest1205@yandex.by",
				"Automation",
				"LetsAutomateThisCase",
				"D:\\stormDev\\AutomationProject\\src\\test\\resources\\testFile");

		MailPageActions.sendFileToDisk();

		AbstractPageActions.HeaderPanelActions.openDiskPage();

		DiskPageActions.DiskSideBarMenuActions.openDownloadsPage();

		DiskPageActions.moveFileToFilesFolder(DownloadsPage.getLastDownloadedFile());

		DiskPageActions.DiskSideBarMenuActions.openFilesPage();

		FilesPageActions.moveDownloadedFileToBin();

	}
}