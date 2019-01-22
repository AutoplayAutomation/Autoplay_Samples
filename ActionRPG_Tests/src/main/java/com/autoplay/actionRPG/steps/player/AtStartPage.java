package com.autoplay.actionRPG.steps.player;

import com.autoplay.actionRPG.pages.StartPage;
import com.autoplay.actionRPG.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class AtStartPage extends CommonSteps {

    StartPage startPage;

    @Step
    public void clickStartButton(){
        startPage.clickStartButton();
    }

    @Step
    public void waitStartPageAppears(){
        startPage.waitStartPageAppears();
    }
}
