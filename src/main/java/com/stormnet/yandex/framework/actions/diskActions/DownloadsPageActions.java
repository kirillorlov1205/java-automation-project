package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.pageWrappers.ContextMenuWrapper;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.DownloadsPageWrapper;
import org.openqa.selenium.interactions.Actions;

public class DownloadsPageActions {

	public static void invokeContextMenuForLastFile(HtmlElement htmlElement) {
		Actions actions = new Actions(UiDriver.getDriver());
		actions.contextClick(htmlElement.getElement()).perform();
	}

	public static void clickMovingContextButton() {
		ContextMenuWrapper.getMoveContextButton().click();
	}

//	public static void waitTillContextMenuOpened() {
//		new Waiter(5).untilVisible(DownloadsPageWrapper.getMoveContextButton(),"Context Menu hasn't been shown");
//	}
//
	public static void waitTillDownloadsPageOpened(){
		new Waiter().untilVisible(DownloadsPageWrapper.getLastDownloadedFile(),"no");
	}

}
