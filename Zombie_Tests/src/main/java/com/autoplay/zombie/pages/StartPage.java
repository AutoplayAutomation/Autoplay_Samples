package com.autoplay.zombie.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class StartPage extends PageObject {

    @FindBy(id = "Button_Play")
    private WebElementFacade playButton;

    ////////////////////  INPUT ACTIONS SECTION START  /////////////////////////////////////////

    public void clickPlayButton(){
        playButton.click();
    }

    ////////////////////  INPUT ACTIONS SECTION END  /////////////////////////////////////////


    ////////////////////  VERIFY ACTIONS SECTION START  /////////////////////////////////////////

    public void waitStartPageAppears(){
        playButton.shouldBeVisible();
    }

    ////////////////////  VERIFY ACTIONS SECTION END  /////////////////////////////////////////

}
