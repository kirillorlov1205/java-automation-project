package com.stormnet.yandex.framework.pageWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import org.openqa.selenium.By;

public class ContextMenu {
	private static final By MOVE_CONTEXT_BUTTON_LOCATOR = By.cssSelector("div.resources-actions-popup__action_type_move");

	public static Button getMoveContextButton() {
		return new Button(UiDriver.getDriver(), MOVE_CONTEXT_BUTTON_LOCATOR);
	}

}
