package com.autoplay.zombie.steps.player;

import com.autoplay.zombie.pages.StartPage;
import com.autoplay.zombie.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class AtStartPage extends CommonSteps {

    StartPage startPage;

    @Step
    public void clickPlayButton(){
        startPage.clickPlayButton();
    }

    @Step
    public void waitStartPageAppears(){
        startPage.waitStartPageAppears();
    }
}
