package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.actions.MovingPopUpActions;
import com.stormnet.yandex.framework.elements.HtmlElement;
import io.qameta.allure.Step;

public class DiskPageActions {

	@Step("Move file to Files folder")
	public static void moveFileToFilesFolder(HtmlElement htmlElement) {
		DownloadsPageActions.invokeContextMenuForLastFile(htmlElement);
		DownloadsPageActions.clickMovingContextButton();
		MovingPopUpActions.selectFileFolder();
		MovingPopUpActions.clickMoveButton();
	}


}
