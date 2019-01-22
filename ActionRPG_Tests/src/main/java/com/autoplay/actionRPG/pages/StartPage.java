package com.autoplay.actionRPG.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class StartPage extends PageObject {

    @FindBy(id = "StartGameButton")
    private WebElementFacade btnStartGame;

    @FindBy(id = "ClearSaveButton")
    private WebElementFacade btnClearGame;

    @FindBy(id = "RateButton")
    private WebElementFacade btnRateGame;

    ////////////////////  INPUT ACTIONS SECTION START  /////////////////////////////////////////

    public void clickStartButton(){

        //TODO fix in plugin (check control animation finish state)
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){}

        btnStartGame.click();
    }

    ////////////////////  INPUT ACTIONS SECTION END  /////////////////////////////////////////


    ////////////////////  VERIFY ACTIONS SECTION START  /////////////////////////////////////////

    public void waitStartPageAppears(){
        btnStartGame.shouldBeVisible();
    }

    ////////////////////  VERIFY ACTIONS SECTION END  /////////////////////////////////////////

}
