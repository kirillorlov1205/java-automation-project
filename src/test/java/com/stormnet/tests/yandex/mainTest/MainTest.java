package com.stormnet.tests.yandex.mainTest;


import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.*;
import com.stormnet.yandex.framework.actions.diskActions.DiskPageActions;
import com.stormnet.yandex.framework.actions.mailActions.MailFormActions;
import com.stormnet.yandex.framework.actions.mailActions.MailPageActions;
import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.pageWrappers.SideBarMenuWrapper;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPageWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MainTest extends AbstractTest {

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

		MailFormActions.sendMail("orlovkirilltest1205@yandex.by",
				"testTopic", "testText", "D:\\stormDev\\AutomationProject\\src\\test\\resources\\testFile");

		MailPageActions.sendFileToDisk();

		HeaderPanelActions.openDiskPage();

		SideBarMenuActions.openDownloadsPage();

		DiskPageActions.moveFileToFilesFolder(DownloadsPageWrapper.getLastDownloadedFile());

//		move to separate check
//		WebElement element = UiDriver.getDriver().findElement(By.xpath("//div[contains(@class,\"client-confirmation-dialog__content\")]"));
//		if (element.isDisplayed()) {
//			element.click();
//		}

		SideBarMenuActions.openFilesPage();

		WebElement testFileInFileFolder = UiDriver.getDriver().findElement(By.xpath("//span[text() = \"testFile\"]//ancestor::div[contains(@class,\"listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file listing-item_selected js-prevent-deselect\")]"));
		WebElement destinationLocator = SideBarMenuWrapper.getBucketFolderButtonInSideBarMenu().getElement();

		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(testFileInFileFolder, destinationLocator).build().perform();
	}
}