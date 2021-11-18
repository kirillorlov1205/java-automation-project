package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.FileMovingPopUp;
import io.qameta.allure.Step;

public class FileMovingPopUpActions {

	@Step("Select file folder in the Moving tree")
	public static void selectFileFolder() {
		Waiter.untilVisible(FileMovingPopUp.getFirstFolderItem(), "Moving pop up hasn't been shown");
		FileMovingPopUp.getFirstFolderItem().click();
	}

	@Step("Click on Move Button")
	public static void clickMoveButton() {
		FileMovingPopUp.getMoveButton().click();
	}

}
