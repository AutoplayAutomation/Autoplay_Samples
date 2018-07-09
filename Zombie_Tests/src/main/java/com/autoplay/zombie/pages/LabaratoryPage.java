package com.autoplay.zombie.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LabaratoryPage extends PageObject {

    @FindBy(id = "Shop")
    private WebElementFacade shopIcon;

    @FindBy(id = "Skill")
    private WebElementFacade skillIcon;

    @FindBy(xpath = "(//*[@ID='Map']//empty)[2]")
    private WebElementFacade mapIcon;

    ////////////////////  INPUT ACTIONS SECTION START  /////////////////////////////////////////

    public void clickMap(){
        mapIcon.click();
    }

    ////////////////////  INPUT ACTIONS SECTION END  /////////////////////////////////////////


    ////////////////////  VERIFY ACTIONS SECTION START  /////////////////////////////////////////

    public void verifyShopIconAppers(){
        shopIcon.shouldBeVisible();
    }

    public void verifySkillIconAppers(){
        skillIcon.shouldBeVisible();
    }

    public void verifyMapIconAppears(){
        mapIcon.shouldBeVisible();
    }

    ////////////////////  VERIFY ACTIONS SECTION END  /////////////////////////////////////////
}