package com.stormnet.yandex.framework.actions;

import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.MovingPopUpWrapper;
import io.qameta.allure.Step;

public class MovingPopUpActions {

	@Step("Select file folder in the Moving tree")
	public static void selectFileFolder() {
		new Waiter().untilVisible(MovingPopUpWrapper.getFirstFolderItem(), "Moving pop up hasn't been shown");
		MovingPopUpWrapper.getFirstFolderItem().click();
	}

	@Step("Click on Move Button")
	public static void clickMoveButton() {
		MovingPopUpWrapper.getMoveButton().click();
	}

}
