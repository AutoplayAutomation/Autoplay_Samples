package com.autoplay.zombie.steps.player;

import com.autoplay.zombie.pages.LabaratoryPage;
import com.autoplay.zombie.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class AtLabaratoryPage extends CommonSteps {

    LabaratoryPage labaratoryPage;

    @Step
    public void clickMap(){
        labaratoryPage.clickMap();
    }

    @Step
    public void verifyLabaratoryAppears(){
        labaratoryPage.verifyMapIconAppears();
        labaratoryPage.verifyShopIconAppers();
        labaratoryPage.verifySkillIconAppers();
    }
}
