package com.autoplay.zombie.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BattlePage extends PageObject {

    @FindBy(id = "UnitPositions")
    private WebElementFacade unitPositionsField;

    @FindBy(id = "Icon_index12")
    private WebElementFacade firstUnitPosition;

    @FindBy(xpath = "//*[@ID='UnitSelect_Clone__index7']//Icon")
    private WebElementFacade firstUnitIcon;

    @FindBy(xpath = "//*[@ID='NewEnemy']/Icon")
    private WebElementFacade newUnitIcon;

    @FindBy(id = "Button_Close")
    private WebElementFacade closeNewUnitUnitPoPUp;

    @FindBy(xpath = "//*[@ID='Tutorial_0']//Text")
    private WebElementFacade tips;

    ////////////////////  INPUT ACTIONS SECTION START  /////////////////////////////////////////

    public void moveFirstUnitToPosition(){
        Actions builder = new Actions(getDriver());

        Action dragUnit = builder.clickAndHold(firstUnitIcon)
                .moveToElement(firstUnitPosition)
                .release().build();
        dragUnit.perform();

    }

    public void holdForUpgrade(){
        Actions builder = new Actions(getDriver());

        builder.clickAndHold(firstUnitIcon).build().perform();
        builder.release().perform();

    }

    public void openNewUnitInfo() {
        newUnitIcon.click();
    }

    public void closeNewUnitInfo() {
        closeNewUnitUnitPoPUp.click();
    }

    ////////////////////  INPUT ACTIONS SECTION END  /////////////////////////////////////////


    ////////////////////  VERIFY ACTIONS SECTION START  /////////////////////////////////////////

    public void verifyBattleFieldAppears(){
        unitPositionsField.shouldBeVisible();
    }

    public void verifyNewUnitInfoPoPUPAppears(){
        closeNewUnitUnitPoPUp.shouldBeVisible();
    }

    public void verifyTipsAppears(String msg) {
        Assert.assertEquals(msg, tips.getText());
    }


    ////////////////////  VERIFY ACTIONS SECTION END  /////////////////////////////////////////
}