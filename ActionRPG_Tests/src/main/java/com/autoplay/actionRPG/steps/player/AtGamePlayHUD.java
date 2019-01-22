package com.autoplay.actionRPG.steps.player;

import com.autoplay.actionRPG.pages.GamePlayHUD;
import com.autoplay.actionRPG.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class AtGamePlayHUD extends CommonSteps {

    GamePlayHUD gamePlayHUD;

    @Step
    public void checkGamePlayHUDAppears(){
        gamePlayHUD.checkHudAppears();
    }

    @Step
    public void driverClose(){
        gamePlayHUD.driverClose();
    }

    @Step
    public void driverQuit(){
        gamePlayHUD.driverQuit();
    }

    @Step
    public void openInventory(){
        gamePlayHUD.openInventory();
    }

}