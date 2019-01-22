package com.autoplay.actionRPG.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class IntroPage extends PageObject {

    @FindBy(id = "SkipLabel")
    private WebElementFacade lblSkipIntroMsg;

    ////////////////////  INPUT ACTIONS SECTION START  /////////////////////////////////////////

    public void clickSkipIntro(){
        lblSkipIntroMsg.click();
    }

    ////////////////////  INPUT ACTIONS SECTION END  /////////////////////////////////////////


    ////////////////////  VERIFY ACTIONS SECTION START  /////////////////////////////////////////

    public void verifyIntroAppers(){
        lblSkipIntroMsg.shouldBeVisible();
    }

    ////////////////////  VERIFY ACTIONS SECTION END  /////////////////////////////////////////
}