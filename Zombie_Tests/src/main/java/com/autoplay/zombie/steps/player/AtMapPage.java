package com.autoplay.zombie.steps.player;

import com.autoplay.zombie.pages.MapPage;
import com.autoplay.zombie.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class AtMapPage extends CommonSteps {

    MapPage mapPage;

    @Step
    public void clickLevelButton(){
        mapPage.clickLevelButton();
    }

    @Step
    public void verifyMapPanelAppears(){
        mapPage.verifyMapPanelAppears();
    }

    @Step
    public void verifyStartLevelPopUpAppears(){
        mapPage.verifyStartLevelPopUpAppears();
    }

    @Step
    public void clickNormalLevelButton(){
        mapPage.clickNormalLevelButton();
    }

    @Step
    public void verifyTipsAppears(String msg) {
        mapPage.verifyTipsAppears(msg);
    }
}