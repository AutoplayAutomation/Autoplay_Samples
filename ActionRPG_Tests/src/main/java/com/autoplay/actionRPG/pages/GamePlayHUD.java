package com.autoplay.actionRPG.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GamePlayHUD extends PageObject {

    @FindBy(xpath = "//*[@ID='Inventory_Button']")
    private WebElementFacade btnInventory;

    @FindBy(id = "HealthBox")
    private WebElementFacade healthBox;


    ////////////////////  INPUT ACTIONS SECTION START  /////////////////////////////////////////

    public void openInventory() {
        btnInventory.click();
    }

    ////////////////////  INPUT ACTIONS SECTION END  /////////////////////////////////////////

    public void driverClose(){
        getDriver().close();
    }

    public void driverQuit(){
        getDriver().quit();
    }


    ////////////////////  VERIFY ACTIONS SECTION START  /////////////////////////////////////////

    public void checkHudAppears(){
        btnInventory.shouldBeVisible();
        healthBox.shouldBeVisible();
    }

    ////////////////////  VERIFY ACTIONS SECTION END  /////////////////////////////////////////
}