package com.autoplay.zombie.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class MapPage extends PageObject {

    @FindBy(id = "LevelButtons")
    private WebElementFacade levelButton;

    @FindBy(id = "LevelSelected_Clone_")
    private WebElementFacade startLevelPoPUp;

    @FindBy(id = "ButtonSelectGameMode_Normal")
    private WebElementFacade normalLevelButton;

    @FindBy(xpath = "//*[@ID='Tutorial_0']//Text")
    private WebElementFacade tips;

    ////////////////////  INPUT ACTIONS SECTION START  /////////////////////////////////////////

    public void clickLevelButton() {
        levelButton.click();
    }

    public void clickNormalLevelButton() {
        normalLevelButton.click();
    }

    ////////////////////  INPUT ACTIONS SECTION END  /////////////////////////////////////////


    ////////////////////  VERIFY ACTIONS SECTION START  /////////////////////////////////////////

    public void verifyMapPanelAppears() {
        levelButton.shouldBeVisible();
    }

    public void verifyStartLevelPopUpAppears() {
        startLevelPoPUp.shouldBeVisible();
    }

    public void verifyTipsAppears(String msg) {
        Assert.assertEquals(msg, tips.getText());
    }


    ////////////////////  VERIFY ACTIONS SECTION END  /////////////////////////////////////////
}