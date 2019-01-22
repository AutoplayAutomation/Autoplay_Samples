package com.autoplay.actionRPG.steps.player;

import com.autoplay.actionRPG.pages.IntroPage;
import com.autoplay.actionRPG.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class AtIntroPage extends CommonSteps {

    IntroPage IntroPage;

    @Step
    public void clickSkipIntro(){
        IntroPage.clickSkipIntro();
    }

    @Step
    public void verifyIntroAppears(){
        IntroPage.verifyIntroAppers();
    }
}
