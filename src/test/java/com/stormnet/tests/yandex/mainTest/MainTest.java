package com.stormnet.tests.yandex.mainTest;

import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.AbstractPageActions;
import com.stormnet.yandex.framework.actions.LoginPageActions;
import com.stormnet.yandex.framework.actions.diskActions.DiskPageActions;
import com.stormnet.yandex.framework.actions.diskActions.DownloadsPageActions;
import com.stormnet.yandex.framework.actions.diskActions.FilesPageActions;
import com.stormnet.yandex.framework.actions.mailActions.MailFormActions;
import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPage;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class MainTest extends AbstractTest {

	// TODO: 11/10/2021 i'll add logback
	// TODO: 11/10/2021 перестали работать скриншоты при ошибке теста
	// TODO: 11/12/2021 new file class  + проверка что письмо пришло
	// TODO: 11/12/2021 абстрактная страница  + вложить хедер класс + вложить сайдбар

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

//		File testFile1 = new File(FileManager.generateFile());

		MailFormActions.sendMail("orlovkirilltest1205@yandex.by",
				"Automation",
				"LetsAutomateThisCase",
				FileManager.getFile().getAbsolutePath());

//		todo: place with problem

		String parentWindow = UiDriver.getDriver().getWindowHandle();

		MailPageActions.sendFileToDisk();

		UiDriver.getDriver().switchTo().window(parentWindow);

//		todo: finish

		AbstractPageActions.HeaderPanelActions.openDiskPage();

		DiskPageActions.DiskSideBarMenuActions.openDownloadsPage();

		DiskPageActions.moveFileToFilesFolder(DownloadsPage.getDownloadedFile().getElement());

		DiskPageActions.DiskSideBarMenuActions.openFilesPage();

		FilesPageActions.moveDownloadedFileToBin();

	}
}